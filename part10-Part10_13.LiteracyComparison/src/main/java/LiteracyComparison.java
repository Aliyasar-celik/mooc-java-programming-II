
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {

    public static void main(String[] args) {

        try {
            // reading the "presidents.txt" file line by line
            List<List<String>> data = Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(","))
                    .map(Arrays::asList) // Transforms each String[] into a List<String>
                    .sorted((p1, p2) -> {
                        return p1.get(5).compareTo(p2.get(5));
                    })
                    .collect(Collectors.toList()); // Collects everything into the outer List

            for (List<String> row : data) {

                System.out.println(row.get(3) + " (" + row.get(4) + "), "
                        + row.get(2).replace(" (%)", "").trim()
                        + ", " + row.get(5).trim());

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
