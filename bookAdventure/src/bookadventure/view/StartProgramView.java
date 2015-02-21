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
public class StartProgramView {
    
public StartProgramView() {
    }

public void startProgram() {
    
    // Display the banner screen
    this.displayBanner();
    
    // prompt the player to enter thier name Retrieve the name of the player
    String playersName = this.getPlayersName();
    
    // Create and save the player object
    Player player = ProgramControl.createPlayer(playersName);
    
    // Display a personalized welcome message
    this.displayWelcomeMessage(player);
    
    // Display the Main Menu
    MainMenuView mainMenu = new MainMenuView();
    mainMenu.displayMenu();

}

    public void displayBanner() {
        System.out.println("\n\n**************************************************");
        
        System.out.println("*                                                *"
                + "\n* This is the game of Book Adventure                    *"
                + "\n* In this game you will travel through                  *"
                + "\n* throught three diffent book worlds of                 *" 
                + "\n* your choosing, once you complete the                  *"
                + "\n* quest of that book you can then return                *"
                + "\n* to the real world.                                    *");
        
        System.out.println("*                                                *"
                + "\n* You will first go to a library and there              *"
                + "\n* you will find three different books, the              *"
                + "\n* book choice is yours to make, the choice              *"
                + "\n* of the book determines the difficulty of              *"
                + "\n* the game, there are Alice in Wonderland,              *"
                + "\n* The Lion, the Witch, and the Wardrobe, and            *"
                + "\n* the last book is Lord of the Rings. Each book         *"
                + "\n* has a certain quest, one of the books you have        *"
                + "\n* the choice to destroy the ring, another you have      *"
                + "\n* the choice to kill the red queen and another you      *"
                + "\n* have the choice to kill the ice queen.                *");
        
        System.out.println("*                                                *"
                + "\n* Good luck and have fun in this adventure.             *"
                + "\n*                                                       *");
        
        System.out.println("******************************************************");
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

    private void displayWelcomeMessage(Player player) {
       System.out.println("\n\n=================================================");
       System.out.println("\tWelcome to the game " + player.getName());
       System.out.println("\tWe hope you have a lot of fun!");
       System.out.println("==============================================");
    }
}


