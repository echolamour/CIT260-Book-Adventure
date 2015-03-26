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
            + "\nG - Start Game"
            + "\nF - Display Fight Menu"
            + "\nH - Getting Help on how to play the game"
            + "\nV - View Map"
            + "\nS - Save Game"
            + "\nQ - Quit Game"
            + "\n-------------------------------------------------------");
    }   


    
   
    private void startNewGame() {
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
   
    @Override
    public void doAction(String obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
       switch (choice){
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
