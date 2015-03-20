/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.control;

import bookadventure.exceptions.MapControlException;
import bookadventure.model.Map;

/**
 *
 * @author Tashakrn9
 */
class MapControl {

    static Map createMap()throws MapControlException{
        throw new MapControlException("Error Creating Map");
    }

    static void moveActorToStartingLocation(Map map) throws MapControlException {
        throw new MapControlException("Error Moving Actor to Location");
    }
    
}
