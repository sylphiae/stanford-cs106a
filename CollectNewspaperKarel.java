/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

    public void run() {
        moveToNewspaper();
        pickUpNewspaper();
        returnToStart();
    }

    /*
    This method gets Karel to the newspaper
    */
    private void moveToNewspaper() {
        move();
        turnRight();
        move();
        turnLeft();
        move();
        move();
    }

    /*
    This method has Karel picking up the newspaper
     */
    private void pickUpNewspaper() {
        pickBeeper();
    }

    /*
    This method returns Karel to its starting position
     */
    private void returnToStart(){
        turnAround();
        move();
        move();
        move();
        turnRight();
        move();
        turnRight();
    }
}

