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
import bookadventure.model.InventoryItem;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            + "\nR - Report of actors and locations"            
            + "\nP - Save file with inventory list"

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
            + "\nR - Report of actors and locations"
            + "\nP - Save file with inventory list"
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
            case 'R':
                this.displayReport();
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
        fightMenu.displayFight();
    }
    
    private void displayHelpMenu(){
        HelpMenuView helpMenu = new HelpMenuView(object);
        helpMenu.displayHelpMenu();
    }
    
    private void displayViewMap(){
        GameMenuView mapDisplay = new GameMenuView(object);
        mapDisplay.displayMap();
    }
    
    private void saveGame(){
        this.console.println("\nEnter the file path for the file where the game "
                                + "\nis going to be saved.");
        String filepath = this.getInput();
        
        try{
            GameControl.saveGame(BookAdventure.getCurrentGame(), filepath);
        } catch(Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());

        }
    }
    
    private void displayReport() {
        this.console.println("\n       List of Actors                          "
            + "\nName                             Location                     " 
            + "\nRabbit                              0, 1" 
            + "\nMadHatter                           2, 0" 
            + "\nTheCat                              0, 1" 
            + "\nTheCatepillar                       3, 1" 
            + "\nTheQueenofHearts                    1, 4" 
            + "\nTheIceQueen                         4, 0" 
            + "\ndemons                              4, 0" 
            + "\ncritters                            0, 1" 
            + "\nLegolas                             1, 3"
            + "\nGandalf                             0, 4" 
            + "\nGimili                              4, 2" 
            + "\nAragon                              2, 4" 
            + "\nSaruman                             3, 4" 
            + "\norcs                                3, 0" 
            + "\nurukai                              3, 0" 
            + "\ngollum                              4, 0" 
            + "\nElron                               1, 4"
            + "\ngaladriel                           3,1");                                                                          
     
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
            case 'R':
                this.displayReport();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;

        
       }
       
    
    }

    private void printInventory() throws GameControlException {
        this.console.println("\nEnter the file path for the file where the Inventory List is going to be saved.");
        String filepath = this.getInput();
        
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
                
        try(FileOutputStream fops = new FileOutputStream(filepath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(inventory);
        }
        catch(IOException e){
            throw new GameControlException(e.getMessage());
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

    
