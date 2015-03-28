/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.view;

import bookadventure.BookAdventure;
import java.io.PrintWriter;

/**
 *
 * @author Echo
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = BookAdventure.getOutfile();
    private static final PrintWriter logFile = BookAdventure.getLogfile();
    
    public static void display(String className, String errorMessage){
        errorFile.println(
                      "------------------------------------------------------"
                    + "\n- ERROR - " + errorMessage
                    + "\n------------------------------------------------------");
        
        logFile.println(className + " - " + errorMessage);
    }
}
