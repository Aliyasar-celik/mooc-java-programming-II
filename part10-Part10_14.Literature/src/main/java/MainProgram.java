
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> listOfBooks = new ArrayList<Book>();
        System.out.print("Input the name of the book, empty stops: ");
        String bookName = scanner.nextLine();

        while (!bookName.isEmpty()) {

            System.out.print("Input the age recommendation: ");
            int recommendedAgeForBook = Integer.valueOf(scanner.nextLine());

            listOfBooks.add(new Book(bookName, recommendedAgeForBook));

            System.out.print("Input the name of the book, empty stops: ");
            bookName = scanner.nextLine();

        }
        System.out.println(listOfBooks.size() + " books in total.");

        listOfBooks.stream()
                .sorted(Comparator.comparing(Book::getRecommendedAge)
                        .thenComparing(Book::getName))
                .forEach(System.out::println);

    }

}
