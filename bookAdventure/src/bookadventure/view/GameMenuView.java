/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.view;

import bookadventure.BookAdventure;
import bookadventure.control.GameControl;
import bookadventure.exceptions.GameControlException;
import bookadventure.model.InventoryItem;
import bookadventure.model.Map;
import bookadventure.model.Location;

/**
 *
 * @author Echo
 */
public class GameMenuView extends View {
    public GameMenuView(String promptMessage) {
        super(promptMessage);
    }

    //@Override
    public void doAction(char value) throws GameControlException {
        switch (value){
            case 'V'://View Map
                this.displayMap();
                break;
            case 'L'://List of Inventory Items
                this.viewInventory();
                break;
            case 'R'://Riddle
            case 'A'://Ask/Answer Question
            case 'G'://Give/Pick up item
            case 'C'://Charachter Progress
                this.viewProgress();
                break;
            case 'K'://Kill/Mercy
            case 'S'://Save Game
            case 'E'://Exit to Main Menu
            case 'Q'://Quit Game
                    
        }
    }

    private void viewProgress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewInventory() throws GameControlException {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" + "Quantity");
        
        for (InventoryItem inventoryItem : inventory){
            System.out.println(inventoryItem.getDescription() + "\t    "+ inventoryItem.getQuantityOfItem());
        }
    }

    private void displayMap() {
        Map map = BookAdventure.getCurrentGame().getMap();
        System.out.println("Map\n");
        for (int row =0; row < 5; row++){
            System.out.println("_______________\n");
            for(int column = 0; column < 5; column++){
                System.out.println("|");
                Location[][] locations = new Location[row][column];
                boolean visited = false;
                if (visited == true){
                    System.out.println("X");
                }
                else{
                    System.out.println(" ");
                }
                System.out.println("|");
            }
            System.out.println("_______________\n");
        }
    }   

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
