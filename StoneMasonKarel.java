/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 *
 * This program now runs Karel successfully in the maps that are provided.
 */

public class StoneMasonKarel extends SuperDuperKarel {

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

    /*
    This is a helper function which turns Karel until it is facing in the desired compass direction.
     */

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


