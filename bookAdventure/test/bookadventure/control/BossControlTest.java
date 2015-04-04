/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.control;

import bookadventure.exceptions.BossControlException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tashakrn9
 */
public class BossControlTest {
    
    public BossControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of fightBoss method, of class BossControl.
     */
    @Test
    public void testFightBoss() throws BossControlException {
        System.out.println("fightBoss");
         /********************
         * Test case #1
         ********************/
        System.out.println("\tTest case #1");
        
        //input values
        double attack = 100.0;
        long strength = 150;
        double defense = 50.0;
        
        double expResult = 15.0;
        FightBoss instance = new FightBoss();
        
        double result = instance.fightBoss(attack, defense, strength);
        assertEquals(expResult, result, 0000.0001);
        
        /********************
         * Test case #2
         ********************/
        System.out.println("\tTest case #2");
        
        //input values
         attack = 100.0;
         strength = 150;
         defense = -1.0;
        
         expResult = -1.0;
      
        
         result = instance.fightBoss(attack, defense, strength);
        assertEquals(expResult, result, -1.0);
        
             
       
        
        /********************
         * Test case #5
         ********************/
        System.out.println("\tTest case #5");
        
        //input values
         attack = 50.0;
         strength = 150;
         defense = 700.0;
        
         expResult = -1.0;
      
        
         result = instance.fightBoss(attack, defense, strength);
        assertEquals(expResult, result, 000.0001);
        
        /********************
         * Test case #6
         ********************/
        System.out.println("\tTest case #6");
        
        //input values
         attack = 75.0;
         strength = 200;
         defense = 50.0;
        
         expResult = 40.0;
      
        
         result = instance.fightBoss(attack, defense, strength);
        assertEquals(expResult, result, 000.0001);
        
        /********************
         * Test case #7
         ********************/
        System.out.println("\tTest case #7");
        
        //input values
         attack = 100.0;
         strength = 150;
         defense = 50.0;
        
         expResult = 15.0;
      
        
         result = instance.fightBoss(attack, defense, strength);
        assertEquals(expResult, result, 000.0001);
        
        /********************
         * Test case #8
         ********************/
        System.out.println("\tTest case #8");
        
        //input values
         attack = 100.0;
         strength = 150;
         defense = 0.0;
        
         expResult = -1.0;
      
        
         result = instance.fightBoss(attack, defense, strength);
        assertEquals(expResult, result, 000.0001);
        
        /********************
         * Test case #9
         ********************/
        System.out.println("\tTest case #9");
        
        //input values
         attack = 100.0;
         strength = 200;
         defense = 60.0;
        
         expResult = 25.0;
      
        
         result = instance.fightBoss(attack, defense, strength);
        assertEquals(expResult, result, 000.0001);
        
        /********************
         * Test case #10
         ********************/
        System.out.println("\tTest case #10");
        
        //input values
         attack = 100.0;
         strength = 100;
         defense = 50.0;
        
         expResult = 10.0;
      
        
         result = instance.fightBoss(attack, defense, strength);
        assertEquals(expResult, result, 000.0001);
        
    }

    private static class FightBoss {

        public FightBoss() {
        }

        private double fightBoss(double attack, double defense, long strength) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
