/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.view;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tashakrn9
 */
public class ConversationView extends View {
    private boolean Sentence;

    public ConversationView(String promptMessage) {
        super(promptMessage);
    }
    
    public String getFeedback() throws IOException {
        boolean valid = false;
        String Feedback = null;
        
        while (!valid){
            this.console.println("\t\nWhat is your response:");
            
            Feedback = this.keyboard.readLine();
            Feedback = Feedback.trim();
            
            if (Feedback.length() < 1){
                this.console.println("\n*** Invalid answer *** Try Again");
                continue;
                
            }
            break;
        }
        
        return Feedback;
    }
    
    public void Show() throws IOException {
        String value;
        
      
            this.console.println(this.Sentence);
            value = this.getFeedback();
            this.doAction(value);
    }

    @Override
    public void doAction(String value) {
       do {
           try {
               Show ();
               getFeedback ();
           } catch (IOException ex) {
               Logger.getLogger(ConversationView.class.getName()).log(Level.SEVERE, null, ex);
           }
            
        }while (!value.equals("Q"));
        
    }
        
    }
    
    

  
    
