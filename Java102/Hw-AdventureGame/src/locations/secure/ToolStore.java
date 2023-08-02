package locations.secure;

import game.Player;
import inventories.armors.Armor;
import inventories.weapons.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ToolStore extends NormalLocation{

    Scanner scanner = new Scanner(System.in);

    public ToolStore(Player player) {
        super(player, "TOOL STORE",2);
    }

    @Override
    public boolean onLocation() {
        getPlayer().setSafeHouseState(false);
        toolStoreMenu();
        return true;
    }

    private void toolStoreMenu(){
        String str = """

                ==================================== You are in the TOOL STORE =====================================

                ID: 0 , Destination Selection Menu,
                ID: 1 , Buy An Armor,
                ID: 2 , Buy A Weapon.""";
        System.out.println(str);

        int selection = getIntegerFromZeroToMaxFromUser(2, "\nPlease enter the ID number of your choice : ");

        if(selection == 1)
        {
            Armor[] armors = {
                    new Armor(1,1,15, Armor.armorTypes.LIGHT),
                    new Armor(2,3,25, Armor.armorTypes.MEDIUM),
                    new Armor(3,5,40, Armor.armorTypes.HEAVY)
            };

            System.out.println("---------- ARMORS ----------");
            for (Armor a : armors)
                System.out.println(a);
            System.out.println("Your money: " + getPlayer().getMoneyOfPlayer());
            int selectedArmor = getIntegerFromZeroToMaxFromUser(3, "Please enter the ID number of the armor you have selected or enter 0 to cancel the operation: ");

            if(selectedArmor >= 1)
            {
                if(getPlayer().getMoneyOfPlayer() >= armors[selectedArmor - 1].getCost()){
                    getPlayer().getPlayerInventory().setArmor(armors[selectedArmor - 1]);
                    getPlayer().setMoneyOfPlayer(getPlayer().getMoneyOfPlayer() - armors[selectedArmor - 1].getCost());
                    System.out.println("You have a new Armor now.");
                }
                else {
                    System.out.println("You do not have enough money. Your money: " + getPlayer().getMoneyOfPlayer() + " < Armor cost: " + armors[selectedArmor - 1].getCost());
                }
            }
        }
        else if (selection == 2)
        {
            Weapon[] weapons = {
                    new Knife(),
                    new Sword(),
                    new Pistol(),
                    new Shotgun()
            };

            System.out.println("---------- WEAPONS ----------");
            for (Weapon w : weapons)
                System.out.println(w);
            System.out.println("Your money: " + getPlayer().getMoneyOfPlayer());
            int selectedWeapon = getIntegerFromZeroToMaxFromUser(4, "Please enter the ID number of the weapon you have selected or enter 0 to cancel the operation: ");

            if(selectedWeapon >= 1)
            {
                if(getPlayer().getMoneyOfPlayer() >= weapons[selectedWeapon - 1].getWeaponCost()){
                    getPlayer().getPlayerInventory().setWeapon(weapons[selectedWeapon - 1]);
                    getPlayer().setMoneyOfPlayer(getPlayer().getMoneyOfPlayer() - weapons[selectedWeapon - 1].getWeaponCost());
                    System.out.println("You have a new Weapon now.");
                }
                else {
                    System.out.println("You do not have enough money. Your money: " + getPlayer().getMoneyOfPlayer() + " < Weapon cost: " + weapons[selectedWeapon - 1].getWeaponCost());
                }
            }
        }
    }

    private int getIntegerFromZeroToMaxFromUser(int max, String repeatingMessage){
        int selection;
        while (true)
        {
            System.out.print(repeatingMessage);
            try {
                selection = scanner.nextInt();
                if (selection >= 0 && selection <= max)
                    break;
                else System.out.println("Invalid entry!");
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry!");
                scanner.next();
            }
        }

        return selection;
    }



}
