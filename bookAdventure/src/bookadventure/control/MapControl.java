/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.control;

import bookadventure.exceptions.GameControlExceptions;
import bookadventure.exceptions.MapControlException;
import bookadventure.model.Map;
import bookadventure.model.Scene;

/**
 *
 * @author Tashakrn9
 */
class MapControl {

    
    static Map createMap()throws MapControlException, GameControlExceptions{
        Map map = new Map(5,5);
        
        Scene[] scenes = GameControl.createScenes();
        
        Scene.assignScenesToLocations(map, scenes);
        
        return map;
        //throw new MapControlException("Error Creating Map");
    }

    static void moveActorToStartingLocation(Map map) throws MapControlException {
        throw new MapControlException("Error Moving Actor to Location");
    }
    
}
