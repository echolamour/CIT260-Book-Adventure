/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.control;

import bookadventure.BookAdventure;
import bookadventure.model.Player;

/**
 *
 * @author Tashakrn9
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        if (name == null){
        return null;
    }
    Player player = new Player();
    player.setName(name);
    
    BookAdventure.setPlayer(player);
    return player;
    }
}
