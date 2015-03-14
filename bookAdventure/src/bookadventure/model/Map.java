/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.model;

import bookadventure.control.GameControl;
import java.io.Serializable;

/**
 *
 * @author Tashakrn9
 */
public class Map implements Serializable{
    private double xCount;
    private double yCount;
    private Location[][] locations;
    public Map() {
    }
    
    public Map(int noOfRows, int noOfColumns){
        if (noOfRows < 1 || noOfColumns < 1){
            System.out.println("The number of rows & columns must be > zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row =0; row < noOfRows; row++){
            for(int column = 0; column < noOfColumns; column++){
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                locations[row][column] = location;
            }
        }
    }
    
    

    public double getxCount() {
        return xCount;
    }

    public void setxCount(double xCount) {
        this.xCount = xCount;
    }

    public double getyCount() {
        return yCount;
    }

    public void setyCount(double yCount) {
        this.yCount = yCount;
    }

    @Override
    public String toString() {
        return "Map{" + "xCount=" + xCount + ", yCount=" + yCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.xCount) ^ (Double.doubleToLongBits(this.xCount) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.yCount) ^ (Double.doubleToLongBits(this.yCount) >>> 32));
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.xCount) != Double.doubleToLongBits(other.xCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.yCount) != Double.doubleToLongBits(other.yCount)) {
            return false;
        }
        return true;
    }    

    Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
