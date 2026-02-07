
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        ArrayList<String> inputs = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.isEmpty()) {

            inputs.add(input);
            input = scanner.nextLine();

        }

        scanner.close();
        inputs.stream().forEach(name -> System.out.println(name));
    }
}
