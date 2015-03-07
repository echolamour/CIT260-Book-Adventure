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
public class ConversationView extends View {
    private boolean Sentence;

    public ConversationView(String promptMessage) {
        super(promptMessage);
    }
    
    public String getFeedback() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String Feedback = null;
        
        while (!valid){
            System.out.println("\t\nWhat is your response:");
            
            Feedback = keyboard.nextLine();
            Feedback = Feedback.trim();
            
            if (Feedback.length() < 1){
                System.out.println("\n*** Invalid answer *** Try Again");
                continue;
                
            }
            break;
        }
        
        return Feedback;
    }
    
    public void Show() {
        String value;
        
      
            System.out.println(this.Sentence);
            value = this.getFeedback();
            this.doAction(value);
    }

    @Override
    public void doAction(String value) {
       do {
           Show ();
            getFeedback ();
            
        }while (!value.equals("Q"));
        
    }
        
    }
    
    

  
    
