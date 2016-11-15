/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

    public void run() {
        while (frontIsClear()){
            karelRestoresColumn();
            moveKarelEast();
        }
        karelRestoresColumn();
        faceDirection(Direction.EAST);
    }

    /*
    This method moves Karel east to the next column
     */
    private void moveKarelEast() {
        faceDirection(Direction.EAST);
            move();
            move();
            move();
            move();
    }

    private enum Direction {
        NORTH, EAST, SOUTH, WEST
    }

    /*
    This is a helper function which turns Karel until it is facing in the desired compass direction.
     */

    private void faceDirection(Direction direction){
        switch(direction){
            case NORTH:
                while (!facingNorth()){
                    turnLeft();
                }
                break;
            case EAST:
                while (!facingEast()){
                    turnLeft();
                }
                break;
            case SOUTH:
                while (!facingSouth()){
                    turnLeft();
                }
                break;
            case WEST:
                while(!facingWest()){
                    turnLeft();
                }
                break;
        }

    }

    /*
   This method has Karel restore the column
    */
    private void karelRestoresColumn() {
        faceDirection(Direction.NORTH);
        while (frontIsClear()) {
            if (noBeepersPresent()) {
                putBeeper();
            }
            move();
        }
        if (noBeepersPresent()){
            putBeeper();
        }
        faceDirection(Direction.SOUTH);
        while (frontIsClear()) {
            move();
        }
    }
}


