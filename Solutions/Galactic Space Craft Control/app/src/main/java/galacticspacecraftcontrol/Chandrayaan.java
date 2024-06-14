package galacticspacecraftcontrol;

public class Chandrayaan {
    private int x, y, z;
    private String direction;

    public Chandrayaan(int x, int y, int z, String direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void processCommands(char[] commands) {
        for (char command : commands) {
            switch (command) {
                case 'f':
                    moveForward();
                    break;
                case 'b':
                    moveBackward();
                    break;
                case 'l':
                    turnLeft();
                    break;
                case 'r':
                    turnRight();
                    break;
                case 'u':
                    turnUp();
                    break;
                case 'd':
                    turnDown();
                    break;
            }
        }
    }

    private void moveForward() {
        switch (direction) {
            case "N":
                y += 1;
                break;
            case "S":
                y -= 1;
                break;
            case "E":
                x += 1;
                break;
            case "W":
                x -= 1;
                break;
            case "U":
                z += 1;
                break;
            case "D":
                z -= 1;
                break;
        }
    }

    private void moveBackward() {
        switch (direction) {
            case "N":
                y -= 1;
                break;
            case "S":
                y += 1;
                break;
            case "E":
                x -= 1;
                break;
            case "W":
                x += 1;
                break;
            case "U":
                z -= 1;
                break;
            case "D":
                z += 1;
                break;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
                break;
            case "W":
                direction = "S";
                break;
            case "U":
                // No change in direction
                break;
            case "D":
                // No change in direction
                break;
        }
    }

    private void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "S":
                direction = "W";
                break;
            case "E":
                direction = "S";
                break;
            case "W":
                direction = "N";
                break;
            case "U":
                // No change in direction
                break;
            case "D":
                // No change in direction
                break;
        }
    }

    private void turnUp() {
        if (direction.equals("N") || direction.equals("S") || direction.equals("E") || direction.equals("W")) {
            direction = "U";
        }
    }

    private void turnDown() {
        if (direction.equals("N") || direction.equals("S") || direction.equals("E") || direction.equals("W")) {
            direction = "D";
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public String getDirection() {
        return direction;
    }
}
