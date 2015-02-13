/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tashakrn9
 */
public class ProgressControlTest {
    
    public ProgressControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of showStats method, of class ProgressControl.
     */
    @Test
    public void testShowStats() {
        System.out.println("showStats");
        
        /********************
         * Test case #1
         ********************/
        System.out.println("\tTest case #1");
        
        //input values
        double total = 10.0;
        long time = 15;
        double complete = 3.0;
        
        double expResult = 5000.0;
        ProgressControl instance = new ProgressControl();
        
        double result = instance.showStats(total, time, complete);
        assertEquals(expResult, result, 0000.0001);
        
        /********************
         * Test case #2
         ********************/
        System.out.println("\tTest case #2");
        
        //input values
         total = 10.0;
         time = 15;
         complete = -1.0;
        
         expResult = -1.0;
      
        
         result = instance.showStats(total, time, complete);
        assertEquals(expResult, result, -1.0);
        
             
       
        
        /********************
         * Test case #5
         ********************/
        System.out.println("\tTest case #5");
        
        //input values
         total = 5.0;
         time = 15;
         complete = 7.0;
        
         expResult = -1.0;
      
        
         result = instance.showStats(total, time, complete);
        assertEquals(expResult, result, 000.0001);
        
        /********************
         * Test case #6
         ********************/
        System.out.println("\tTest case #6");
        
        //input values
         total = 5.0;
         time = 15;
         complete = 3.0;
        
         expResult = 2500.0;
      
        
         result = instance.showStats(total, time, complete);
        assertEquals(expResult, result, 000.0001);
        
        /********************
         * Test case #7
         ********************/
        System.out.println("\tTest case #7");
        
        //input values
         total = 10.0;
         time = 15;
         complete = 3.0;
        
         expResult = 5000.0;
      
        
         result = instance.showStats(total, time, complete);
        assertEquals(expResult, result, 000.0001);
        
        /********************
         * Test case #8
         ********************/
        System.out.println("\tTest case #8");
        
        //input values
         total = 10.0;
         time = 15;
         complete = 0.0;
        
         expResult = 0.0;
      
        
         result = instance.showStats(total, time, complete);
        assertEquals(expResult, result, 000.0001);
        
        /********************
         * Test case #9
         ********************/
        System.out.println("\tTest case #9");
        
        //input values
         total = 10.0;
         time = 15;
         complete = 10.0;
        
         expResult = 1500.0;
      
        
         result = instance.showStats(total, time, complete);
        assertEquals(expResult, result, 000.0001);
        
        /********************
         * Test case #10
         ********************/
        System.out.println("\tTest case #10");
        
        //input values
         total = 10.0;
         time = 0;
         complete = 3.0;
        
         expResult = 0.0;
      
        
         result = instance.showStats(total, time, complete);
        assertEquals(expResult, result, 000.0001);
        
    }
    
}
