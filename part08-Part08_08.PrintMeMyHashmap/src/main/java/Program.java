
import java.util.HashMap;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("a", "b");
        hm.put("c", "d");
        hm.put("e", "f");
        printKeysWhere(hm, "a");
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        Set<String> keys = hashmap.keySet();

        for (String key : keys) {

            System.out.println(key);
        } // Output: [Apple, Banana]

    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        Set<String> keys = hashmap.keySet();

        for (String key : keys) {
            if (key.contains(text)) {

                System.out.println(key);

            } // Output: [Apple, Banana]
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        Set<String> keys = hashmap.keySet();

        for (String key : keys) {
            if (key.contains(text)) {

                System.out.println(hashmap.get(key));

            } // Output: [Apple, Banana]
        }

    }
}