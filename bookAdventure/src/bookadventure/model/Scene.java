/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.model;

import bookadventure.exceptions.GameControlExceptions;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Echo
 */
public class Scene implements Serializable{
    private String description;
    private boolean blocked;
    private String attribute;

    public Scene() {
    }

    public enum SceneType
    {
        start,
        river,
        forest,
        party,
        house,
        mine,
        hill,
        dam,
        town,
        ford,
        castle,
        marsh,
        garden,
        mountain,
        waterfall,
        finish,
    }
    
    public static void assignScenesToLocations(Map map, Scene[] scenes) throws GameControlExceptions{
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.river.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.garden.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.hill.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.house.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.dam.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.river.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.ford.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.castle.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.party.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.waterfall.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.house.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.ford.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.town.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.marsh.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.hill.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.house.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.mine.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.castle.ordinal()]);
        
        
        
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + (this.blocked ? 1 : 0);
        hash = 67 * hash + Objects.hashCode(this.attribute);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        if (!Objects.equals(this.attribute, other.attribute)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", blocked=" + blocked + ", attribute=" + attribute + '}';
    }

    public void setMapSymbol(String fn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
