/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Tashakrn9
 */
public enum Actor implements Serializable {
   
    Rabbit("The animal that can help you out in your journey."),
    MadHatter("The man that will tell you riddles to help where you need to go."),
    TheCat("The animal that will tell you riddles as well that will help on your way."),
    TheCatepillar("The smoker that will help you and give you items."),
    TheQueenofHearts("The boss of the game."),
    TheIceQueen("The boss for this game."),
    demons("your typical enemy."),
    critters("your friends that give you some help."),
    Legolas("Elf helper."),
    Gandalf("wizard Helper."),
    Gimili("dwarf helper."),
    Aragon("Human helper."),
    Saruman("Evil wizard."),
    orcs("enemy."),
    urukai("enemy."),
    gollum("helper/enemy."),
    Elron("elf helper."),
    galadriel("elf helper.");
    
    private final String description;
    private final Point coordinates;
    
    
    Actor(String description){
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    public String getDescription(){
        return description;
    }
    
    public Point getcoordinates(){
        return coordinates;
    }

    @Override
    public String toString() {
        return "Actor{" + "description=" + description + ", coordinates=" + coordinates + '}';
    }
    
    
    
    

    
}

   
    
    
    

