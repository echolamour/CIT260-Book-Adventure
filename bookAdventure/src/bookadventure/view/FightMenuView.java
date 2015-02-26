/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.view;

import java.util.Scanner;

/**
 *
 * @author Tashakrn9
 */
public class FightMenuView {
    
     private void displayFight(){
        System.out.println("*** displayFight function called ***");
    }
    
    private void displayRun(){
        System.out.println("*** displayRun function called ***");
    }
    
    private void displayAttack(){
        System.out.println("*** displayAttack function called ***");
    }
    
    private void displayDefend(){
        System.out.println("*** displayDefend function called ***");
    }
    
    private final String MENU = "\n"
            + "\n------------------------------------------------------"
            + "\n| Fight Menu                                          |"
            + "\n------------------------------------------------------"
            + "\nF - Fight"
            + "\nR - Run"
            + "\nA - Attack"
            + "\nD - Defend"
            + "\n-------------------------------------------------------";
    
    void displayFightMenu() {
        
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
            
            System.out.println("Enter your fight or flee choice below:");
            
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
                this.displayFight();
                break;
            case 'R':
                this.displayRun();
                break;
            case 'A':
                this.displayAttack();
                break;
            case 'D':
                this.displayDefend();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
    }
}

   

    
    

