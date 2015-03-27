/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.view;

import bookadventure.BookAdventure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Echo
 */
public abstract class View implements ViewInterface {
    private String promptMessage;
    
    protected final BufferedReader keyboard = BookAdventure.getInfile();
    protected final PrintWriter console = BookAdventure.getOutfile();
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display(){
        String value;
        
        do {
            this.console.println(this.promptMessage);
            value = this.getInput();
            this.doAction(value);
        }while (!value.equals("Q"));
        
    }
    
    @Override
    public String getInput() {
        boolean valid = false;
        String selection = null;
        
        while (!valid){
            this.console.println("\t\nEnter your selection below:");
            
            try {
                selection = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            selection = selection.trim();
            
            if (selection.length() < 1){
                this.console.println("\n*** Invalid Selection *** Try Again");
                continue;
                
            }
            break;
        }
        
        return selection;
    }
    
    public String getPromptMessage() {
        return promptMessage;
    }
    
    public void setPromptMessage(String message){
        this.promptMessage = message;
    }
}
