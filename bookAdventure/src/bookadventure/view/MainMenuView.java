/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.view;

import bookadventure.BookAdventure;
import bookadventure.control.GameControl;
import bookadventure.exceptions.GameControlException;
import bookadventure.exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.Scanner;

/**
 *
 * @author Tashakrn9
 */
public class MainMenuView extends View{
    private String object;

    public MainMenuView(String promptMessage) {
        super("\n"
            + "\n------------------------------------------------------"
            + "\n| Main Menu                                          |"
            + "\n------------------------------------------------------"
            + "\nN - Start New Game"
            + "\nG - Start Saved Game"
            + "\nF - Display Fight Menu"
            + "\nH - Getting Help on how to play the game"
            + "\nV - View Map"
            + "\nS - Save Game"
            + "\nQ - Quit Game"
            + "\n-------------------------------------------------------");
    }   

    
    private final String MENU = "\n"
            + "\n------------------------------------------------------"
            + "\n| Main Menu                                          |"
            + "\n------------------------------------------------------"
            + "\nN - Start New Game"
            + "\nG - Start Saved Game"
            + "\nF - Display Fight Menu"
            + "\nH - Getting Help on how to play the game"
            + "\nV - View Map"
            + "\nS - Save Game"
            + "\nQ - Quit Game"
            + "\n-------------------------------------------------------";
    
    private void doAction(char selection) throws MapControlException, GameControlException {
        switch (selection){
            case 'F':
                this.displayFightMenu();
                break;
            case 'N':
                this.startNewGame();
                break;
            case 'G':
                this.startExistingGame();
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
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;
        }
    }

   //Why is this in the main menu view?
    private void startNewGame() throws MapControlException, GameControlException {
         try {
        GameControl.createNewGame(BookAdventure.getPlayer());

        } catch (MapControlException | GameControlException ex) {
            System.out.println(ex.getMessage());
        }
            GameMenuView gameMenuView = new GameMenuView(object);
        gameMenuView.display();
    }
    
    private void displayFightMenu(){
        FightMenuView  fightMenu = new FightMenuView(object);
        fightMenu.display();
    }
    
    private void displayHelpMenu(){
        HelpMenuView helpMenu = new HelpMenuView(object);
        helpMenu.display();
    }
    
    private void displayViewMap(){
        this.console.println("*** displayViewMap function called ***");
    }
    
    private void saveGame(){

        System.out.println("*** saveGame function called ***");
    }
    
    @Override
    public void doAction(String obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
       switch (choice){
            case 'F':
                this.displayFightMenu();
            case 'G':
        {
            try {
                this.startNewGame();
            } catch (MapControlException | GameControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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

        this.console.println("\nEnter the file path for the file where the game "
                                + "is going to be saved.");
        String filepath = this.getInput();
        
        try{
            GameControl.saveGame(BookAdventure.getCurrentGame(), filepath);
        } catch(Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());

        }
       }
    }

     private void startExistingGame() {
         System.out.println("\n\nEnter the file path for the file.");
         
         String filepath = this.getInput();
         
        try{
             GameControl.getSavedGame(filepath);
        }
        catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
  
}
