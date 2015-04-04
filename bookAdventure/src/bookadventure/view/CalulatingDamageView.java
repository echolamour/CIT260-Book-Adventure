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
public class CalulatingDamageView extends View {

    public CalulatingDamageView(String promptMessage) {
        super(promptMessage);
    }

    public double calulatingDamage(double attack, double defense, long strength) {
        double damage = (strength / ( attack - defense)) *  5;

                  return damage;
    }
    /*The function is also below
    private void doAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public void doAction(String value) {
        String object = null;
        GameMenuView gameMenuView = new GameMenuView(object);
        try {
            gameMenuView.display();
        }catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            gameMenuView.display();
        }
    }

    void displayStrength() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
       
    


    
