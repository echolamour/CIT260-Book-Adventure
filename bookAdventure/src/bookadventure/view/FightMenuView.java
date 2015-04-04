/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.view;

import bookadventure.control.BossControl;
import java.util.Scanner;

/**
 *
 * @author Tashakrn9
 */
public class FightMenuView extends View{
    private Object BossControl;
    private String object;

    public FightMenuView(String promptMessage) {
        super("\n"
            + "\n------------------------------------------------------"
            + "\n| Fight Menu                                          |"
            + "\n------------------------------------------------------"
            + "\nF - Fight"
            + "\nR - Strength"
            + "\nA - Attack"
            + "\nD - Defend"
            + "\n-------------------------------------------------------");
    }
    
     private void displayFight(){
        this.console.println("*** displayFight function called ***");
    }
    
    private void displayStrength(){
        BossControl bosscontrol = new BossControl(object);
        bosscontrol.displayStrength();
    }
    
    private void displayAttack(){
          BossControl bosscontrol = new BossControl(object);
        bosscontrol.displayAttack();
    }
    
    private void displayDefend(){
          BossControl bosscontrol = new BossControl(object);
        bosscontrol.displayDefend();
    }

    private void doAction(char selection) {
        switch (selection){
            case 'F':
                this.displayFight();
                break;
            case 'R':
                this.displayStrength();
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

   

    
    

