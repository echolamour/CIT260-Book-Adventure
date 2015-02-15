/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.control;

/**
 *
 * @author Tashakrn9
 */
public class BossControl {
    
    public double fightBoss(double attack, double defense, long strength) {
        
        
        if (attack != 50 && attack != 75 && attack != 100 && attack != 100 && attack != 150 && attack != 200) {
            return -1;
        }

        if (defense < 0 || defense > attack) {
            return -1;
        }

        if  (defense < 50) {
            return -1;
        }

        if (strength < defense) {
            return -1;
        }
        double damage = (strength / ( attack - defense)) *  5;

                  return damage;
    }
    
}
