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
        if (command == 'f') {
            if (direction.equals("N")) {
                y += 1;
            }
        }
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
