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
 * @author Echo
 */
public class HelpMenuView extends View{

    public HelpMenuView(String promptMessage) {
        super("\n"
            + "\n------------------------------------------------------"
            + "\n| Help Menu                                          |"
            + "\n------------------------------------------------------"
            + "\nG - Goal of the Game"
            + "\nA - Ask/Answer Question"
            + "\nI - List of Inventory Items"
            + "\n-------------------------------------------------------");
    }
    
    private final String HELPMENU = "\n"
            + "\n------------------------------------------------------"
            + "\n| Help Menu                                          |"
            + "\n------------------------------------------------------"
            + "\nG - Goal of the Game"
            + "\nA - Ask/Answer Question"
            + "\nI - List of Inventory Items"
            + "\n-------------------------------------------------------";
    
    public void displayHelpMenu(){
        char selection = ' ';
        
        this.console.println(HELPMENU);
        
        String input = this.getInput();
        selection = input.charAt(0);
        
        this.doAction(selection);
    }
    
    private void displayGoal(){
        this.console.println("*** displayGoal function called ***");
    }
    
    private void startChat(){
        this.console.println("*** startChat function called ***");
    }
    
    private void displayInventory(){
        this.console.println("*** displayInventory function called ***");
    }

    private void doAction(char selection) {
        switch (selection){
            case 'g':
            case 'G':
                this.displayGoal();
                break;
            case 'a':
            case 'A':
                this.startChat();
                break;
            case 'i':
            case 'I':
                this.displayInventory();
                break;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;
        }
    }

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

