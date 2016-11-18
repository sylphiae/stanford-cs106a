import stanford.karel.SuperKarel;

public class CheckerboardKarelRewrite extends SuperDuperKarel {

	public void run() {
        int squaresTraveled = 0;
        while (true){
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
        for (int i = 0 ; i < squaresTraveled ; i++) {
            move();
        }
        faceDirection(Direction.EAST);
        move();
        }
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