/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.view;

/**
 *
 * @author Echo
 */
public interface ViewInterface {
    public void display();
    public String getInput();

    /**
     *
     * @param value
     */
    public void doAction(String value);
}
