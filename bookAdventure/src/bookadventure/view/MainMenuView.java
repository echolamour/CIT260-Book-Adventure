/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.view;

import bookadventure.BookAdventure;
import bookadventure.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Tashakrn9
 */
public class MainMenuView {
    
   
    private void startNewGame(){
        GameControl.createNewGame(BookAdventure.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
    private void displayFightMenu(){
        FightMenuView  fightMenu = new FightMenuView();
        fightMenu.displayFightMenu();
    }
    
    private void displayHelpMenu(){
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }
    
    private void displayViewMap(){
        System.out.println("*** displayViewMap function called ***");
    }
    
    private void saveGame(){
        System.out.println("*** saveGame function called ***");
    }
    
    private final String MENU = "\n"
            + "\n------------------------------------------------------"
            + "\n| Main Menu                                          |"
            + "\n------------------------------------------------------"
            + "\nG - Start Game"
            + "\nF - Display Fight Menu"
            + "\nH - Getting Help on how to play the game"
            + "\nV - View Map"
            + "\nS - Save Game"
            + "\nQ - Quit Game"
            + "\n-------------------------------------------------------";
    
    void displayMenu() {
        
        char selection = ' ';
        do{
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        
        }while (selection != 'E');
        
    }


    private String getInput() {
        boolean valid = false;
        String Input = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            System.out.println("Enter your choice below:");
            
            Input = keyboard.nextLine();
            Input = Input.trim();
            
            if (Input.length() < 1) {
                System.out.println("Invalid choice - the input must not be blank");
                continue;
            }
            break;
        }
        return Input;
    }

    private void doAction(char selection) {
        switch (selection){
            case 'F':
                this.displayFightMenu();
            case 'G':
                this.startNewGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'V':
                this.displayViewMap();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
    }
    
}