
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        // reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }

        // working out the average
        double averageOfPositives = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(i -> i > 0)
                .average()
                .getAsDouble();

        double averageOfNegatives = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(i -> i < 0)
                .average()
                .getAsDouble();

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

        String positiveOrNegative = scanner.nextLine();

        if (positiveOrNegative.equalsIgnoreCase("n")) {

            // printing out the statistics
            System.out.println("Average of the negative numbers: " + averageOfNegatives);

        } else if (positiveOrNegative.equalsIgnoreCase("p")) {

            // printing out the statistics
            System.out.println("Average of the positive numbers: " + averageOfPositives);

        }

    }
}
