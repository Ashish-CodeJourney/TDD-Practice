package fizzbuzz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int number;
        System.out.println("Enter a Number :");
        Scanner sc = new Scanner(System.in);

        try {
            number = sc.nextInt();
            FizzBuzz fizzbuzz = new FizzBuzz();
            System.out.println(fizzbuzz.play(number));
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter Integer Value");
        }
    }
}
