/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure;

import bookadventure.model.Actor;
import bookadventure.model.Game;
import bookadventure.model.InventoryItem;
import bookadventure.model.Location;
import bookadventure.model.Map;
import bookadventure.model.Player;
import bookadventure.model.Scene;
import bookadventure.view.StartProgramView;




/**
 *
 * @author Echo
 */
public class BookAdventure {
   
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        BookAdventure.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        BookAdventure.player = player;
    }
    
    
    private static double xCoordinate;
    private static double yCoordinate;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        Player playerOne = new Player();
        Actor actorOne = new Actor();
        Map mapOne = new Map();
        Location locationOne = new Location();
        Game gameOne = new Game();
        InventoryItem itemOne = new InventoryItem();
        Scene sceneOne = new Scene();
        
        playerOne.setName(null);
        playerOne.setBestTime(25.00);
        actorOne.setName(null);
        mapOne.setxCount(xCoordinate);
        mapOne.setyCount(yCoordinate);
        locationOne.setxCoordinate(xCoordinate);
        locationOne.setyCoordinate(yCoordinate);
        locationOne.setVisited(null);
        gameOne.setTotalTime(25.00);
        gameOne.setAttribute("unknown");
        itemOne.setInventoryType(null);
        itemOne.setQuantityOfItem(2);
        sceneOne.setDescription(null);
        sceneOne.setBlocked(true);
        sceneOne.setAttribute(null);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
    }

    private static StartProgramView newStartProgramView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
