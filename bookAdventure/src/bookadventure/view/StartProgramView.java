/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.view;

import bookadventure.control.ProgramControl;
import bookadventure.model.Player;
import java.util.Scanner;

/**
 *
 * @author Tashakrn9
 */
public class StartProgramView extends View {

    public StartProgramView(String promptMessage) {
        super(promptMessage);
    }
    


    public void startProgram() {
        String object = null;
        
        // Display the banner screen
        this.displayBanner();

        // prompt the player to enter thier name Retrieve the name of the player
        String playersName = this.getPlayersName();

        // Create and save the player object
        Player player = ProgramControl.createPlayer(playersName);

        // Display a personalized welcome message
        this.displayWelcomeMessage(player);

        MainMenuView mainMenu;
        mainMenu = new MainMenuView(object);
        mainMenu.display();

    }

        private String getPlayersName() {
            boolean valid = false;
            String playersName = null;
            Scanner keyboard = new Scanner(System.in);

            while(!valid){

                System.out.println("Enter the player's name below:");

                playersName = keyboard.nextLine();
                playersName = playersName.trim();

                if (playersName.length() < 2) {
                    System.out.println("Invalid name - the name must not be blank");
                    continue;
                }
                break;
            }
            return playersName;
        }

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n================================================");
        System.out.println("\tWelcome to the game" + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("======================================================");
    }

    private void displayBanner() {
      System.out.println("\n\n******************************************");
      
      System.out.println("*                                             *"
              + "\n* This is the game of Book Adventure                 *"
              + "\n* In this game you will have the option to go into   *"
              + "\n* three various worlds that you will have goals to   *"
              + "\n* achieve.                                           *");
      
      System.out.println("*                                             *"
              + "\n* You will have a chance to meet other characters    *"
              + "\n* throughout your adventure to help you accomplish   *"
              + "\n* the main task, which depends on the choice you     *"
              + "\n* have made, it could either be find and kill the    *"
              + "\n* red queen, find and kill the ice queen, or destroy *"
              + "\n* the one ring. Your choice!                         *");
      
      System.out.println("*                                             *"
              + "\n* Good Luck and enjoy the adventure.                 *"
              + "\n*                                                    *");
      
      System.out.println("************************************************");
      
    }
}


