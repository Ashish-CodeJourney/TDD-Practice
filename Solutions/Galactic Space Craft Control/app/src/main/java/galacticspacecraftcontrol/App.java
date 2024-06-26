/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package galacticspacecraftcontrol;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input initial coordinates and direction
        System.out.println("Enter initial x, y, z coordinates:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println("Enter initial direction (N, S, E, W, U, D):");
        String direction = scanner.next();

        // Initialize the Chandrayaan spacecraft
        Chandrayaan spacecraft = new Chandrayaan(x, y, z, direction);

        // Input commands
        System.out.println("Enter commands (f, b, l, r, u, d) without spaces:");
        String commandsInput = scanner.next();
        char[] commands = commandsInput.toCharArray();

        // Process the commands
        spacecraft.processCommands(commands);

        // Output the final position and direction
        System.out.println("Final Position: (" + spacecraft.getX() + ", " + spacecraft.getY() + ", " + spacecraft.getZ() + ")");
        System.out.println("Final Direction: " + spacecraft.getDirection());
    }
}
