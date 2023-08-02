package src.game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    static Game game;

    public Game() {
        game = this;
    }

    public void startGame(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nWelcome to Adventure Game...\nPlease enter your name: ");

        String playerName = scanner.nextLine().trim();

        System.out.println("Welcome, " + playerName.toUpperCase() + "!");

        System.out.println("""
                ========================================== ADVENTURE GAME ==========================================
                * Clear the CAVE, FOREST, and RIVER of monsters to win the game.
                * At the beginning of the game, you must choose a CHARACTER to become stronger against the monsters.
                * You cannot change the CHARACTER you choose until the end of the game.
                * Later, if you want and have enough money, you can get Armor and WEAPONS from the TOOL SHOP.
                * There is also a MINE in the game that does not need to be cleared.
                * If you want to, you can go to the MINE and for every snake,
                you kill there you can get MONEY (25%), ARMOR (15%), or a WEAPON (15%).
                ====================================================================================================
                """);

        Player player = new Player(playerName);

        player.characterSelection();
    }

    public void gameOver(Player player, boolean isWin){
        if (isWin){
            System.out.println("Congratulations " + player.getPlayerName().toUpperCase() + "! You WIN...");

        }
        else {
            System.out.println("You LOST!!!");
        }

        int selection = getIntegerFromMinToMaxFromUser(1,2,"Do you want to play again? 1- Yes, 2- No!\nPlease enter 1 or 2 -> ");

        if(selection == 1) startGame();
        else System.out.println("Exiting Game. See You Again...");

    }

    private int getIntegerFromMinToMaxFromUser(int min, int max, String repeatingMessage){
        int selection;
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

}
