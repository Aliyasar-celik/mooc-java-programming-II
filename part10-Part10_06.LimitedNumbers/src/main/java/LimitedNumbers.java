
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        int input = Integer.valueOf(scanner.nextLine());

        while (input > 0) {

            inputs.add(input);
            input = Integer.valueOf(scanner.nextLine());

        }

        scanner.close();
        inputs.stream()
                .filter(i -> (i >= 1) && (i <= 5 ))
                .forEach(i -> System.out.println(i));

    }
}
