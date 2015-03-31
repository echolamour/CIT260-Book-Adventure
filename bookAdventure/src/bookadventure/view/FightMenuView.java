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
public class FightMenuView extends View{

    public FightMenuView(String promptMessage) {
        super("\n"
            + "\n------------------------------------------------------"
            + "\n| Fight Menu                                          |"
            + "\n------------------------------------------------------"
            + "\nF - Fight"
            + "\nR - Run"
            + "\nA - Attack"
            + "\nD - Defend"
            + "\n-------------------------------------------------------");
    }
    
     public void displayFight(){
        this.console.println("*** displayFight function called ***");
    }
    
    private void displayRun(){
        this.console.println("*** displayRun function called ***");
    }
    
    private void displayAttack(){
        this.console.println("*** displayAttack function called ***");
    }
    
    private void displayDefend(){
        this.console.println("*** displayDefend function called ***");
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
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;
        }
    }

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

   

    
    

