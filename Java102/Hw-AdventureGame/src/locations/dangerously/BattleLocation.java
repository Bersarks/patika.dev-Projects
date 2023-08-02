package src.locations.dangerously;

import inventories.weapons.Pistol;
import inventories.weapons.Shotgun;
import inventories.weapons.Sword;
import inventories.weapons.Weapon;
import locations.Location;
import src.monsters.*;

import java.util.*;


public abstract class BattleLocation extends Location {

    public BattleLocation(Player player, String locationName, int locationId) {
        super(player, locationName, locationId);
    }

    @Override
    public boolean onLocation() {

        System.out.println("==================================== You are in the " + getName() + " =====================================");

        Random random = new Random();
        int monsterCount = random.nextInt(3) + 1;

        String startMessage = "";

        List<monsters.Monster> monsters = new ArrayList<>();

        if(getLocationId() == 3){
            startMessage = "Be careful! There " + (monsterCount > 1 ? " are " + monsterCount + " Zombies " : " is a Zombie ") + " in the Cave.";
            for (int i = 0; i < monsterCount; i++) {
                monsters.add(new Zombie());
            }
        }
        else if(getLocationId() == 4){
            startMessage = "Be careful! There " + (monsterCount > 1 ? " are " + monsterCount + " Vampires " : " is a Vampire ") + " in the Forest.";
            for (int i = 0; i < monsterCount; i++) {
                monsters.add(new Vampire());
            }
        }
        else if(getLocationId() == 5){
            startMessage = "Be careful! There " + (monsterCount > 1 ? " are " + monsterCount + " Bears " : " is a Bear ") + " near the River.";
            for (int i = 0; i < monsterCount; i++) {
                monsters.add(new Bear());
            }
        }
        else if(getLocationId() == 6){
            startMessage = "Be careful! There " + (monsterCount > 1 ? " are " + monsterCount + " Snakes " : " is a Snake ") + " near the River.";
            for (int i = 0; i < monsterCount; i++) {
                monsters.add(new Snake());
            }
        }


        startMessage += "\n1- Run to the Safe House,\n2- Fight!";

        System.out.println(startMessage);

        int selection = getIntegerFromMinToMaxFromUser(1,2,"Please make your choice: ");

        if(selection == 1) {
            getPlayer().setSafeHouseState(true);
            return true;
        }
        else return battle(getPlayer(), monsters);
    }

    private boolean battle(Player player, List<Monster> monsters){

        Random random = new Random();

        boolean isPlayerAlive = true;

        for (int i = 0; i < monsters.size(); i++) {

            int round = 1;

            Monster monster = monsters.get(i);

            String mName = monster.getMonsterName().toUpperCase();
            int mHit = monster.getDamage();

            String pName = player.getPlayerName().toUpperCase();
            int pHit = player.getPlayerDamage();
            int pBlock = player.getPlayerArmorBlocking();

            System.out.println("------------------------- " + mName + " " + (i+1) + " / " + monsters.size() +" -------------------------");

            boolean playerAttacks = random.nextBoolean();

            while (true)
            {
                System.out.println("Round: " + round + " - " + (playerAttacks ? pName : mName) + " is attacking!");

                if(playerAttacks)
                {
                    playerAttacks = false;

                    // player is attacking
                    monster.setHealth(monster.getHealth() - player.getPlayerDamage());

                    boolean isMonsterAlive = (monster.getHealth() > 0);

                    String mHealthMessage;

                    if(isMonsterAlive) mHealthMessage = "The " + mName + " has " + monster.getHealth() + " health left.";
                    else mHealthMessage = "The " + mName + " is dead!";


                    System.out.println(pName + " has hit " + player.getPlayerDamage());
                    System.out.println(mHealthMessage);

                    if(!isMonsterAlive) break;
                }
                else {
                    playerAttacks = true;

                    // monster is attacking
                    player.setPlayerCurrentHealth(player.getPlayerCurrentHealth() - Math.max((mHit - pBlock), 0));

                    isPlayerAlive = (player.getPlayerCurrentHealth() > 0);

                    String pHealthMessage;
                    if (isPlayerAlive) pHealthMessage = "You have " + player.getPlayerCurrentHealth() + " health left!";
                    else pHealthMessage = "You died!";

                    System.out.println(mName + " has hit " + mHit);
                    System.out.println(pHealthMessage);

                    if(!isPlayerAlive) break;
                }
                round++;
                System.out.println("------------------------------");
            }

            if(!isPlayerAlive) break;
        }

        if(isPlayerAlive){
            int earnedMoney = (monsters.size() * monsters.get(0).getPrizeMoney());
            System.out.println("The money earned at this location: " + earnedMoney);
            player.setMoneyOfPlayer(player.getMoneyOfPlayer() + earnedMoney);

            if(getClass() == Cave.class)
                player.getPlayerInventory().setFoodState(true);
            else if(getClass() == Forest.class)
                player.getPlayerInventory().setFirewoodState(true);
            else if (getClass() == River.class) player.getPlayerInventory().setWaterState(true);
            else if(getClass() == Mine.class) {
                for (Monster monster : monsters){
                    int rewardId = getSnakeRewardId();

                    if(rewardId != 0) snakePrizeSelection(rewardId);
                }
            }
            return true;
        }
        else return false;
    }

    private int getIntegerFromMinToMaxFromUser(int min, int max, String repeatingMessage){
        int selection = -1;
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print(repeatingMessage);
            try {
                selection = scanner.nextInt();
                if (selection >= min && selection <= max)
                    break;
                else System.out.println("Invalid entry!");
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry!");
                scanner.next();
            }
        }

        return selection;
    }

    private int getSnakeRewardId(){
        Random random = new Random();
        int randomNumber = random.nextInt(200);
        if(randomNumber < 6) return 1;
        else if(randomNumber < 15) return 2;
        else if(randomNumber < 30) return 3;
        else if(randomNumber < 36) return 4;
        else if(randomNumber < 45) return 5;
        else if(randomNumber < 60) return 6;
        else if(randomNumber < 70) return 7;
        else if(randomNumber < 85) return 8;
        else if(randomNumber < 110) return 9;
        else return 0;
    }
    private void snakePrizeSelection(int rewardId){

        System.out.println("------------------------- Reward Selection -------------------------");

        String currWeaponName = (getPlayer().getPlayerInventory().getWeapon() == null)?"No Weapon" : getPlayer().getPlayerInventory().getWeapon().getWeaponName();
        String currentWeaponMessage = "Your current WEAPON: " + currWeaponName;

        String currArmorName = (getPlayer().getPlayerInventory().getArmor() == null)?"No Armor" : getPlayer().getPlayerInventory().getArmor().getArmorName();
        String currentArmorMessage = "Your current ARMOR: " + currArmorName;

        Weapon weapon;
        int selection;
        String repeatingMessage = "Do you want to take it? 1- Yes, 2- No!\nPlease enter 1 or 2 -> ";
        switch (rewardId) {
            case 1 -> {
                System.out.println(currentWeaponMessage);
                System.out.println("Your reward: Shotgun");
                selection = getIntegerFromMinToMaxFromUser(1, 2, repeatingMessage);
                if (selection == 1) {
                    weapon = new Shotgun();
                    getPlayer().getPlayerInventory().setWeapon(weapon);
                    System.out.println("Your new WEAPON : " + weapon.getWeaponName());
                } else System.out.println("Reward left!");
            }
            case 2 -> {
                System.out.println(currentWeaponMessage);
                System.out.println("Your reward: Sword");
                selection = getIntegerFromMinToMaxFromUser(1, 2,repeatingMessage);
                if (selection == 1) {
                    weapon = new Sword();
                    getPlayer().getPlayerInventory().setWeapon(weapon);
                    System.out.println("Your new WEAPON : " + weapon.getWeaponName());
                } else System.out.println("Reward left!");
            }
            case 3 -> {
                System.out.println(currentWeaponMessage);
                System.out.println("Your reward: Pistol");
                selection = getIntegerFromMinToMaxFromUser(1, 2,repeatingMessage);
                if (selection == 1) {
                    weapon = new Pistol();
                    getPlayer().getPlayerInventory().setWeapon(weapon);
                    System.out.println("Your new WEAPON : " + weapon.getWeaponName());
                } else System.out.println("Reward left!");
            }
            case 4 -> {
                System.out.println(currentArmorMessage);
                System.out.println("Your reward: Light Armor");
                selection = getIntegerFromMinToMaxFromUser(1, 2,repeatingMessage);
                if (selection == 1) {
                    Armor armor = new Armor(1, 1, 15, Armor.armorTypes.LIGHT);
                    getPlayer().getPlayerInventory().setArmor(armor);
                    System.out.println("Your new ARMOR : " + armor.getArmorName());
                } else System.out.println("Reward left!");
            }
            case 5 -> {
                System.out.println(currentArmorMessage);
                System.out.println("Your reward: Medium Armor");
                selection = getIntegerFromMinToMaxFromUser(1, 2,repeatingMessage);
                if (selection == 1) {
                    Armor armor = new Armor(2, 3, 25, Armor.armorTypes.MEDIUM);
                    getPlayer().getPlayerInventory().setArmor(armor);
                    System.out.println("Your new ARMOR : " + armor.getArmorName());
                } else System.out.println("Reward left!");
            }
            case 6 -> {
                System.out.println(currentArmorMessage);
                System.out.println("Your reward: Heavy Armor");
                selection = getIntegerFromMinToMaxFromUser(1, 2,repeatingMessage);
                if (selection == 1) {
                    Armor armor = new Armor(3, 5, 40, Armor.armorTypes.HEAVY);
                    getPlayer().getPlayerInventory().setArmor(armor);
                    System.out.println("Your new ARMOR : " + armor.getArmorName());
                } else System.out.println("Reward left!");
            }
            case 7 -> {
                System.out.println("You won 10 MONEY.");
                getPlayer().setMoneyOfPlayer(getPlayer().getMoneyOfPlayer() + 10);
                System.out.println("Your new MONEY balance: " + getPlayer().getMoneyOfPlayer());
            }
            case 8 -> {
                System.out.println("You won 5 MONEY.");
                getPlayer().setMoneyOfPlayer(getPlayer().getMoneyOfPlayer() + 5);
                System.out.println("Your new MONEY balance: " + getPlayer().getMoneyOfPlayer());
            }
            case 9 -> {
                System.out.println("You won 1 MONEY.");
                getPlayer().setMoneyOfPlayer(getPlayer().getMoneyOfPlayer() + 1);
                System.out.println("Your new MONEY balance: " + getPlayer().getMoneyOfPlayer());
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
}
