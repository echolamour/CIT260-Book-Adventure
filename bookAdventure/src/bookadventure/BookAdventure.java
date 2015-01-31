/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure;

import bookadventure.model.Game;
import bookadventure.model.Location;
import bookadventure.model.Player;



/**
 *
 * @author Echo
 */
public class BookAdventure {
    private static double xCoordinate;
    private static double yCoordinate;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Location locationOne = new Location();
        Game gameOne = new Game();
        
        locationOne.setxCoordinate(xCoordinate);
        locationOne.setyCoordinate(yCoordinate);
        locationOne.setVisited(null);
        gameOne.setTotalTime(25.00);
        gameOne.setAttribute("unknown");
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
    }
    
}
