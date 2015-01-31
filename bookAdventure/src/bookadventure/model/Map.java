/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.model;

import java.io.Serializable;

/**
 *
 * @author Tashakrn9
 */
public class Map implements Serializable{
    private double xCount;
    private double yCount;

    public Map() {
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
    
    
    
    
    
    
}
