/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.control;

import bookadventure.exceptions.BossControlException;

/**
 *
 * @author Tashakrn9
 */
public class BossControl {

    public BossControl(String object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public double calulatingDamage(double attack, double defense, long strength) {
        double damage = (strength / ( attack - defense)) *  5;

                  return damage;
    }
    public double fightBoss(double attack, double defense, long strength) throws BossControlException {
        
        
        
        if (attack != 50 && attack != 75 && attack != 100 && attack != 150 && attack != 200) {
            throw new BossControlException("Can not attack"
                                           + "because attack is either to low or to high.");
        }

        if (defense < 0 || defense > attack) {
            throw new BossControlException("Can not defend"
                                           + "because it is not possible to have a defense"
                                           + " less then zero or that the defense.");
        }

        if  (defense < 50) {
            throw new BossControlException("Can not defend"
                                           + "because defense is less then 50.");
        }

        if (strength < defense) {
            throw new BossControlException("Can not have less strength then defense"
                                           + "it is not possible in a game.");
        }
        double damage = (strength / ( attack - defense)) *  5;

                  return damage;
    }

    public void displayStrength() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void displayAttack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void displayDefend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}



