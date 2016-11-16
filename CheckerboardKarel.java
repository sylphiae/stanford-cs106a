/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
        while (frontIsClear()) {
            karelPlacesCheckers();
            karelMovesOver();
        }
    }

    private void karelPlacesCheckers() {
        StoneMasonKarel.faceDirection(StoneMasonKarel.Direction.NORTH);
        while (frontIsClear()) {
            putBeeper();
            move();
        }
        if (noBeepersPresent()){
            putBeeper();
        }
        StoneMasonKarel.faceDirection(StoneMasonKarel.Direction.SOUTH);
        while (frontIsClear()) {
            move();
        }
    }
    private void karelMovesOver() {
        StoneMasonKarel.faceDirection(StoneMasonKarel.Direction.EAST);
        move();
    }
}
