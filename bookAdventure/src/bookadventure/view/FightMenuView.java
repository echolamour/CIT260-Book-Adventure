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
    private Object CalulatingDamageView;
    private String object;

    public FightMenuView(String promptMessage) {
        super("\n"
            + "\n------------------------------------------------------"
            + "\n| Fight Menu                                          |"
            + "\n------------------------------------------------------"
            + "\nR - Strength"
            + "\nA - Attack"
            + "\nD - Defend"
            + "\n-------------------------------------------------------");
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

   

    
    

