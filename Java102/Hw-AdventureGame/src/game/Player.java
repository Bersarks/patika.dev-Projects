package src.game;

import gameCharacters.*;
import inventories.Inventory;
import locations.Location;
import locations.dangerously.Cave;
import locations.dangerously.Forest;
import locations.dangerously.Mine;
import locations.dangerously.River;
import locations.secure.SafeHouse;
import locations.secure.ToolStore;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Player {

    private String playerName;
    private GameCharacter playerCharacter;
    private int playerDamage;

    private int playerArmorBlocking;
    private int playerCurrentHealth;
    private int playerOriginalHealth;
    private int moneyOfPlayer = 75;
    private final Inventory playerInventory;

    private final Scanner scanner = new Scanner(System.in);
    private boolean safeHouse = false;

    public Player(String playerName) {
        this.playerName = playerName;
        this.playerInventory = new Inventory(this);
    }

    public void characterSelection(){
        GameCharacter[] gameCharacters = {
                new Samurai(),
                new ChunLi(),
                new Knight(),
                new Xena()
        };

        boolean validInput = false;
        int selection = -1;
        while (!validInput) {
            System.out.println("Please choose your character. Your balance : " + moneyOfPlayer);
            for (GameCharacter c : gameCharacters)
                System.out.println(c);

            System.out.print("\nPlease select a character by ID: ");
            try {
                selection = scanner.nextInt();
                if (selection >= 1 && selection <= gameCharacters.length)
                    validInput = true;
                else System.out.println("Invalid entry!");
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry!");
                scanner.next();
            }
        }

        setPlayerCharacter(gameCharacters[selection - 1]);

        printPlayerInformation();

        selectLocation();

    }

    public void selectLocation(){

        Location location = null;
        int selection;
        List<Integer> selectableNumbers = new ArrayList<>();
        selectableNumbers.add(0);
        selectableNumbers.add(1);
        selectableNumbers.add(2);
        selectableNumbers.add(6);

        StringBuilder str = new StringBuilder();

        if(safeHouse)
            str.append("\n==================================== You are in the SAFE HOUSE =====================================\n");
        else
            str.append("\n------------------------------------- Where Do You Want To Go? -------------------------------------\n");

        str.append(this)
            .append("\n----------------------------------------------------------------------------------------------------")
            .append("\nLocations:")
            .append("\nID: 1 , Safe House (If you are wounded, you will heal here.)")
            .append("\nID: 2 , Tool Store (you can buy a weapon and armor)");

        if(!getPlayerInventory().getFoodState()){
            str.append("\nID: 3 , Cave (reward: food)");
            selectableNumbers.add(3);
        }
        if(!getPlayerInventory().getFirewoodState()){
            str.append("\nID: 4 , Forest (reward: firewood)");
            selectableNumbers.add(4);
        }
        if(!getPlayerInventory().getWaterState()){
            str.append("\nID: 5 , River (reward: water)");
            selectableNumbers.add(5);
        }

        str.append("\nID: 6 , Mine (reward: money, weapon, armor)")
                .append("\nID: 0 , Quit Game!");

        System.out.print(str);

        selection = getIntegerFromUser(selectableNumbers, "\nPlease enter the ID number of the location you want to go to : ");

        switch (selection){
            case 1 -> location = new SafeHouse(this);
            case 2 -> location = new ToolStore(this);
            case 3 -> location = new Cave(this);
            case 4 -> location = new Forest(this);
            case 5 -> location = new River(this);
            case 6 -> location = new Mine(this);
        }

        if(location == null) System.out.println("Exiting the game! See you again soon.");
        else goToTheLocation(location);
    }

    private void goToTheLocation(Location location){

        if(location.onLocation())
        {
            if(isPlayerWinTheGame())
            {
                Game.game.gameOver(this, true);
            }
            else {
                selectLocation();
            }
        }
        else
        {
            Game.game.gameOver(this, false);
        }
    }

    public void setSafeHouseState(boolean trueOrFalse){
        safeHouse = trueOrFalse;
    }
    private boolean isPlayerWinTheGame(){
        return getPlayerInventory().getFoodState() && getPlayerInventory().getFirewoodState() && getPlayerInventory().getWaterState();
    }

    private int getIntegerFromUser(List<Integer> selectableNumbers, String message){
        int selection = -1;
        if(selectableNumbers.isEmpty()) return selection;

        while (true)
        {
            System.out.print(message);
            try {
                selection = scanner.nextInt();
                if (selectableNumbers.contains(selection))
                    break;
                else System.out.println("Invalid entry!");
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry!");
                scanner.next();
            }
        }

        return selection;
    }

    public GameCharacter getPlayerCharacter() {
        return playerCharacter;
    }

    private void setPlayerCharacter(GameCharacter playerCharacter) {
        this.playerCharacter = playerCharacter;
        setPlayerDamage(getPlayerCharacter().getDamage());
        setPlayerOriginalHealth(getPlayerCharacter().getHealth());
        setPlayerCurrentHealth(getPlayerOriginalHealth());
        setMoneyOfPlayer(getMoneyOfPlayer() - playerCharacter.getCost());
    }

    public Inventory getPlayerInventory() {
        return playerInventory;
    }

    public int getPlayerDamage() {
        return playerDamage;
    }

    public void setPlayerDamage(int playerDamage) {
        this.playerDamage = playerDamage;
    }

    public int getPlayerArmorBlocking() {
        return playerArmorBlocking;
    }

    public void setPlayerArmorBlocking(int playerBlocking) {
        this.playerArmorBlocking = playerBlocking;
    }

    public int getPlayerCurrentHealth() {
        return playerCurrentHealth;
    }

    public void setPlayerCurrentHealth(int playerCurrentHealth) {
        this.playerCurrentHealth = playerCurrentHealth;
    }

    public int getPlayerOriginalHealth() {
        return playerOriginalHealth;
    }

    public void setPlayerOriginalHealth(int playerOriginalHealth) {
        this.playerOriginalHealth = playerOriginalHealth;
    }

    public int getMoneyOfPlayer() {
        return moneyOfPlayer;
    }

    public void setMoneyOfPlayer(int moneyOfPlayer) {
        this.moneyOfPlayer = moneyOfPlayer;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void recovery(){
        setPlayerCurrentHealth(getPlayerOriginalHealth());
    }

    private void printPlayerInformation(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CHARACTER: " + getPlayerCharacter().getCharacterName() +
                "\nWEAPON: " + ((getPlayerInventory().getWeapon() == null) ? "No Weapon!" : getPlayerInventory().getWeapon().getWeaponName()) +
                ", ARMOR: " + ((getPlayerInventory().getArmor() == null) ? "No Armor!" : getPlayerInventory().getArmor().getArmorName()) +
                ", ATTACK BLOCKING: " + ((getPlayerInventory().getArmor() == null) ? "0" : getPlayerInventory().getArmor().getAttackBlocking()) +
                "\nDAMAGE: " + getPlayerDamage() +
                ", HEALTH: " + getPlayerCurrentHealth() +
                "\nFOOD: " + ((getPlayerInventory().getFoodState()) ? "OK." : "None") +
                ", FIREWOOD: " + ((getPlayerInventory().getFirewoodState()) ? "OK." : "None") +
                ", WATER: " + ((getPlayerInventory().getWaterState()) ? "OK." : "None") +
                "\nMONEY: " + getMoneyOfPlayer();
    }
}
