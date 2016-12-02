import stanford.karel.SuperKarel;

public class CheckerboardKarelRewrite extends SuperDuperKarel {

    public void run() {
        while (true) {
            if (frontIsClear()) {
                faceDirection(Direction.NORTH);
                createsCheckerboard();
            } else if (rightIsBlocked()) {
                putBeeper();
                break;
            } else{
                break;
            }
        }
    }

    private void createsCheckerboard() {
        while (true) {
            if (frontIsClear()) {
                karelPutsChecker();
                karelSkipsSpace();
            } else {
                moveOver();
                break;
            }
        }
    }

    private void karelPutsChecker(){
        putBeeper();
        move();
    }

    private void karelSkipsSpace(){
        move();
    }

    private void moveOver() {
        if (facingNorth()) {
            faceDirection(Direction.EAST);
            move();
            faceDirection(Direction.SOUTH);
        } else {
            faceDirection(Direction.EAST);
            move();
            faceDirection(Direction.NORTH);
        }
    }

    /* This boolean was meant to check Karel's state but I'm not sure if it's actually necessary
    private boolean karelPlacedChecker() {
        this.
    }
    */

    /*
   This method moves Karel up a down the even "A" columns, creating a checkers pattern, then moves Karel east 1 square
    */
    private void karelMakesCheckerColumnA() {
        int squaresTraveled = 0;
        faceDirection(Direction.NORTH);
        while (true) {
            putBeeper();
            if (frontIsClear()) {
                move();
                squaresTraveled++;
            } else {
                //Leave the loop
                break;
            }
            if (frontIsClear()) {
                move();
                squaresTraveled++;
            } else {
                //Leave the loop
                break;
            }
        }

        turnAround();
        for (int i = 0; i < squaresTraveled; i++) {
            move();
        }
        faceDirection(Direction.EAST);
        move();
        faceDirection(Direction.NORTH);
    }

    /*
   This method moves Karel up a down the odd "B" columns, creating a checkers pattern, then moves Karel east 1 square
    */
    private void karelMakesCheckerColumnB() {
        int squaresTraveled = 0;
        faceDirection(Direction.NORTH);
        while (true) {
            if (frontIsClear()) {
                move();
                squaresTraveled++;
            } else {
                //Leave the loop
                break;
            }
            putBeeper();
            if (frontIsClear()) {
                move();
                squaresTraveled++;
            } else {
                //Leave the loop
                break;
            }
        }

        turnAround();
        for (int i = 0; i < squaresTraveled; i++) {
            move();
        }
        faceDirection(Direction.EAST);
        move();
        faceDirection(Direction.NORTH);
    }
}

/*
public class KarelExample {

    public void goKarelGo() {
        //Start at space X, 0 (Always assume start in the base position)

        //Go forward until we can't anymore
        boolean nextSpaceClear = true;
        int squaresTraveled = 0;
        while (true){
            //if the space doesn't have a beeper, put one down
            if (noBeeper()) {
                placeBeeper();
            }
            //If the next square is clear, move to it, otherwise stop.
            if (NextForwardSpaceIsClear()) {
                moveAhead();
                squaresTraveled++;
            } else {
                //Leave the loop
                break;
            }
        }
        //After we can't go forward, reset to 0 and move 4 right, then repeat
        turnAround();
        for (int i = 0 ; i < squaresTraveled ; i++) {
            moveAhead();
        }

        turnEast();
        for (int i = 0 ; i < 4 ; i++) {
            moveAhead();
        }
        turnNorth();
        goKarelGo();
    }

}
*/