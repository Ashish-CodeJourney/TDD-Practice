package string.calculator;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        else {
            String[] parts = numbers.split(",|\n");
            int sum = 0;
            for (String part : parts) {
                sum += Integer.parseInt(part);
            }
            return sum;
        }
    }
}
