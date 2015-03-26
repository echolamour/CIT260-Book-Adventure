/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.control;

import bookadventure.BookAdventure;
import bookadventure.exceptions.GameControlException;
import bookadventure.exceptions.MapControlException;
import bookadventure.model.Constants;
import bookadventure.model.Game;
import bookadventure.model.Game.Item;
import bookadventure.model.InventoryItem;
import bookadventure.model.Map;
import bookadventure.model.Player;
import bookadventure.model.Scene;
import bookadventure.model.Scene.SceneType;
import bookadventure.view.View;
import java.awt.image.BufferedImage;

/**
 *
 * @author Echo
 */
public class GameControl extends View {

    public GameControl(String promptMessage) {
        super(promptMessage);
    }
     
    public static void createNewGame(Player player) throws bookadventure.exceptions.MapControlException, GameControlException {
        
        Game game = new Game();
        BookAdventure.setCurrentGame(game);
        
        game.setPlayer(player);
        
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorToStartingLocation(map);
        
        
        
    }

    public static InventoryItem[] createInventoryList() {
      
        InventoryItem[] inventory =
                new InventoryItem[Constants.Number_Of_Inventory_Items];
        
        InventoryItem water = new InventoryItem();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        inventory[Item.water.ordial()] = water;
        
        InventoryItem food = new InventoryItem();
        food.setDescription("Food");
        food.setQuantityInStock(0);
        food.setRequiredAmount(0);
        inventory[Item.food.ordial()] = food;
        
        InventoryItem armor = new InventoryItem();
        armor.setDescription("Armor");
        armor.setQuantityInStock(0);
        armor.setRequiredAmount(0);
        inventory[Item.armor.ordial()] = armor;
        
        InventoryItem shield = new InventoryItem();
        shield.setDescription("Shield");
        shield.setQuantityInStock(0);
        shield.setRequiredAmount(0);
        inventory[Item.shield.ordial()] = shield;
        
        InventoryItem sword = new InventoryItem();
        sword.setDescription("Sword");
        sword.setQuantityInStock(0);
        sword.setRequiredAmount(0);
        inventory[Item.swords.ordial()] = sword;
        
        InventoryItem axe = new InventoryItem();
        axe.setDescription("Axe");
        axe.setQuantityInStock(0);
        axe.setRequiredAmount(0);
        inventory[Item.axes.ordial()] = axe;
        
        InventoryItem bow = new InventoryItem();
        bow .setDescription("Bow ");
        bow .setQuantityInStock(0);
        bow .setRequiredAmount(0);
        inventory[Item.bows.ordial()] = bow ;
        
        InventoryItem ring = new InventoryItem();
        ring.setDescription("Ring");
        ring.setQuantityInStock(0);
        ring.setRequiredAmount(0);
        inventory[Item.ring.ordial()] = ring;
        
        InventoryItem herbs = new InventoryItem();
        herbs.setDescription("Herbs");
        herbs.setQuantityInStock(0);
        herbs.setRequiredAmount(0);
        inventory[Item.herbs.ordial()] = herbs;
        
        InventoryItem arrows = new InventoryItem();
        arrows.setDescription("Arrows");
        arrows.setQuantityInStock(0);
        arrows.setRequiredAmount(0);
        inventory[Item.arrows.ordial()] = arrows;
        
        return inventory;
                }
    
    public static InventoryItem[] getSortedInventoryList() throws GameControlException{
        InventoryItem[] originalInventoryList = BookAdventure.getCurrentGame().getInventory();
        
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++){
            for (int j = 0; j < inventoryList.length-1-i; j++){
                if (inventoryList[j].getDescription().
                        compareToIgnoreCase(inventoryList[j+1].getDescription()) <=0)
                {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;          
                }
            }
        }
        throw new GameControlException("Null Value, List Sorted"); 
           
    }
    
    /*This block of code is in the wrong place please delete
    private static Map createMap() throws MapControlException, GameControlExceptions{
        Map map = new Map(5,5);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }*/
    
    static Scene[] createScenes() throws MapControlException, GameControlException{
        BufferedImage image = null;
        
        Game game = BookAdventure.getCurrentGame();
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("\nWelcome to the book");
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription("\nCongratulations, you have defeated your enemy.");
        finishScene.setMapSymbol("FN");
        finishScene.setBlocked(false);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        throw new GameControlException("Null Value, Scene Created"); 
    }

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
            
        
       
    
   
    

    
        
        
        
   