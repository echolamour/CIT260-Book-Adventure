/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure;

import bookadventure.model.Game;
import bookadventure.model.Player;

/**
 *
 * @author Echo
 */
public class BookAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game gameOne = new Game();
        
        gameOne.setTotalTime(25.00);
        gameOne.setAttribute("unknown");
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
    }
    
}
