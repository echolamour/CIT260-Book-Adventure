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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;




/**
 *
 * @author Echo
 */
public class BookAdventure {
    
    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outfile = null;
    private static BufferedReader infile = null;

    private static PrintWriter logfile = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String object = null;
        StartProgramView startProgramView = null;
        try {
            BookAdventure.infile = new BufferedReader(new InputStreamReader(System.in));
            
            BookAdventure.outfile = new PrintWriter(System.out, true);
            
            String filePath = "log.txt";
            BookAdventure.logfile = new PrintWriter(filePath);
            
            startProgramView = new StartProgramView(object);
            startProgramView.display();
            return;
        }catch (Throwable e){
            System.out.println("Exception: " + e.toString() +
                                "\nCause: " + e.getCause() +
                                "\nMessage: " + e.getMessage());
            e.printStackTrace();
            startProgramView.display();
        }
        finally{
            try{
                if (BookAdventure.infile != null)
                    BookAdventure.infile.close();
                
                if (BookAdventure.outfile != null)
                    BookAdventure.outfile.close();
                
                if (BookAdventure.logfile != null)
                    BookAdventure.logfile.close();
            } catch (IOException ex){
                System.out.println("Error closing files");
                return;
            }
        }
    }

    public static PrintWriter getOutfile() {
        return outfile;
    }

    public static void setOutfile(PrintWriter outfile) {
        BookAdventure.outfile = outfile;
    }

    public static BufferedReader getInfile() {
        return infile;
    }

    public static void setInfile(BufferedReader infile) {
        BookAdventure.infile = infile;
    }
    
    
    //Ths function is interfering with displayMap() in GameMenuView
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        BookAdventure.currentGame = currentGame;
    }

    public static PrintWriter getLogfile() {
        return logfile;
    }

    public static void setLogfile(PrintWriter logfile) {
        BookAdventure.logfile = logfile;
    }
    
    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        BookAdventure.player = player;
    }
    
    
    private static double xCoordinate;
    private static double yCoordinate;

}

    /*private static StartProgramView newStartProgramView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
    
/*The following code was at one point part of the program, but now seems obsolete.
        
        
        Player playerOne = new Player();
        Map mapOne = new Map();
        Location locationOne = new Location();
        Game gameOne = new Game();
        InventoryItem itemOne = new InventoryItem();
        Scene sceneOne = new Scene();
        
        playerOne.setName(null);
        playerOne.setBestTime(25.00);
        mapOne.setxCount(xCoordinate);
        mapOne.setyCount(yCoordinate);
        locationOne.setxCoordinate(xCoordinate);
        locationOne.setyCoordinate(yCoordinate);
        locationOne.setVisited(false);
        gameOne.setTotalTime(25.00);
        gameOne.setAttribute("unknown");
        itemOne.setInventoryType(null);
        itemOne.setQuantityOfItem(2);
        sceneOne.setDescription(null);
        sceneOne.setBlocked(true);
        sceneOne.setAttribute(null);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
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
        */

