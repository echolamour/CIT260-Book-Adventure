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
public class CalulatingDamageView {
    
    void displayFightMenu() {
        
        char selection = ' ';
        do{
            
            System.out.println("Strength, Attack, Defense");
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction();
        
        }while (selection != 'E');
        FightMenuView  fightMenu = new FightMenuView();
    fightMenu.displayFightMenu();

    }


    private String getInput() {
        boolean valid = false;
        String Input = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            System.out.println("Enter your Strength:");
             System.out.println("Enter your Attack:");
              System.out.println("Enter your Defense:");
            
            Input = keyboard.nextLine();
            Input = Input.trim();
            
            if (Input.length() < 1 | Input.length() < 4) {
                System.out.println("Invalid choice - the input must not be blank");
                continue;
            }
            break;
        }
        return Input;
    }

    private double doAction(double attack, double defense, long strength) {
        double damage = (strength / ( attack - defense)) *  5;

                  return damage;
    }

    private void doAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        }
    


    
