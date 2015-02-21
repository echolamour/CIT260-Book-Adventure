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
public class HelpMenuView {
    private void displayGoal(){
        System.out.println("*** displayGoal function called ***");
    }
    
    private void startChat(){
        System.out.println("*** startChat function called ***");
    }
    
    private void displayInventory(){
        System.out.println("*** displayInventory function called ***");
    }
    
    private final String MENU = "\n"
            + "\n------------------------------------------------------"
            + "\n| Help Menu                                          |"
            + "\n------------------------------------------------------"
            + "\nG - Goal of the Game"
            + "\nA - Ask/Answer Question"
            + "\nI - List of Inventory Items"
            + "\n-------------------------------------------------------";
    
    void displayHelpMenu() {
        
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
    
}
