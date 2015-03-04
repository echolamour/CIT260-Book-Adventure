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
    
    private void displayGoal(){
        System.out.println("*** displayGoal function called ***");
    }
    
    private void startChat(){
        System.out.println("*** startChat function called ***");
    }
    
    private void displayInventory(){
        System.out.println("*** displayInventory function called ***");
    }

    private void doAction(char selection) {
        switch (selection){
            case 'G':
                this.displayGoal();
                break;
            case 'A':
                this.startChat();
                break;
            case 'I':
                this.displayInventory();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
    }

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
