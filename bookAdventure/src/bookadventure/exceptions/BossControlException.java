/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookadventure.exceptions;

/**
 *
 * @author Tashakrn9
 */
public class BossControlException extends Exception {

    public BossControlException() {
    }

    public BossControlException(String message) {
        super(message);
    }

    public BossControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public BossControlException(Throwable cause) {
        super(cause);
    }

    public BossControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
