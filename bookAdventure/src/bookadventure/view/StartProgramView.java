/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.view;

import bookadventure.control.ProgramControl;
import bookadventure.model.Player;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tashakrn9
 */
public class StartProgramView extends View {

    public StartProgramView(String promptMessage) {
        super(promptMessage);
    }
    


    public void startProgram() throws IOException {
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

    private String getPlayersName() throws IOException {
        boolean valid = false;
        String playersName = null;

        while(!valid){

            this.console.println("Enter the player's name below:");

            playersName = this.keyboard.readLine();
            playersName = playersName.trim();

            if (playersName.length() < 2) {
                this.console.println("Invalid name - the name must not be blank");
                continue;
            }
            break;
        }
        return playersName;
    }

    @Override
    public void doAction(String value) {
        try {
            startProgram();
        } catch (IOException ex) {
            Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void displayWelcomeMessage(Player player) {
        this.console.println("\n\n================================================");
        this.console.println("\tWelcome to the game " + player.getName());
        this.console.println("\tWe hope you have a lot of fun!");
        this.console.println("======================================================");
    }

    private void displayBanner() {
      this.console.println("\n\n******************************************");
      
      this.console.println("*                                             *"
              + "\n* This is the game of Book Adventure                 *"
              + "\n* In this game you will have the option to go into   *"
              + "\n* three various worlds that you will have goals to   *"
              + "\n* achieve.                                           *");
      
      this.console.println("*                                             *"
              + "\n* You will have a chance to meet other characters    *"
              + "\n* throughout your adventure to help you accomplish   *"
              + "\n* the main task, which depends on the choice you     *"
              + "\n* have made, it could either be find and kill the    *"
              + "\n* red queen, find and kill the ice queen, or destroy *"
              + "\n* the one ring. Your choice!                         *");
      
      this.console.println("*                                             *"
              + "\n* Good Luck and enjoy the adventure.                 *"
              + "\n*                                                    *");
      
      this.console.println("************************************************");
      
    }
}


