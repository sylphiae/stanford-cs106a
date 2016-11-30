import stanford.karel.SuperKarel;

public class SuperDuperKarel extends SuperKarel {
    public void faceDirection(StoneMasonKarel.Direction direction) {
        switch(direction) {
            case NORTH:
                while (!facingNorth()) {
                    turnLeft();
                }
                break;
            case EAST:
                while (!facingEast()) {
                    turnLeft();
                }
                break;
            case SOUTH:
                while (!facingSouth()) {
                    turnLeft();
                }
                break;
            case WEST:
                while(!facingWest()) {
                    turnLeft();
                }
                break;
        }

    }

    public enum Direction {
        NORTH, EAST, SOUTH, WEST
    }
}
