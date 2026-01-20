
import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int number = Integer.valueOf(scanner.nextLine());
        while (number != 0) {
            if (number > 0) {

                numbers.add(number);
            }
            number = Integer.valueOf(scanner.nextLine());

        }
        int sumOfNumbers = 0;
        if (!numbers.isEmpty()) {
            for (int i : numbers) {
                sumOfNumbers += i;

            }
            System.out.println((float) sumOfNumbers / numbers.size());

        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
