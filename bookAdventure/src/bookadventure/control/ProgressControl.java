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
public class ProgressControl {
    
    public double showStats(double total, double time, double complete) {
        
        
        
        if (total != 5 | 7 | 10) {
            return -1;
        }
       
       if (complete < 0 | > total) {
            return -1;
        }
        
        if (time < 0) {
            return -1;
        }
            
                if (complete == 0) {
            double score = 0;
                   
                }
                double score = (time / ( complete / total)) * 100;
                
                return score;
    }
}

   
   
    

