import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("end")) {
            int number = Integer.valueOf(input);
            System.out.println(number * number * number);
            input = scanner.nextLine();

        }
    }
}
