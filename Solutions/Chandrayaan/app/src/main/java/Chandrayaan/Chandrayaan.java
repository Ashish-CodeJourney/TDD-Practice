package Chandrayaan;

public class Chandrayaan {

    private int x;
    private int y;
    private int z;
    private String direction;

    public Chandrayaan(int x, int y, int z, String direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void executeCommand(char command) {
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
    
    private void moveForward() {
        switch (direction) {
            case "N":
                y += 1;
                break;
            case "E":
                x += 1;
                break;
            case "S":
                y -= 1;
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
            case "E":
                x -= 1;
                break;
            case "S":
                y += 1;
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
            case "E":
                direction = "N";
                break;
            case "S":
                direction = "E";
                break;
            case "W":
                direction = "S";
                break;
        }
    }
    
    private void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
        }
    }
    
    private void turnUp() {
        direction = "U";
    }
    
    private void turnDown() {
        direction = "D";
    }
    

    public int getX () {
        return x;
    }

    public int getY () {
        return y;
    }

    public int getZ () {
        return z;
    }

    public String getDirection () {
        return direction;
    }
}
