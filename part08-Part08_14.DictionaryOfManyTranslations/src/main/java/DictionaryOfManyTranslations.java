import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translationsHashMap;

    public DictionaryOfManyTranslations() {
        this.translationsHashMap = new HashMap();
    }

    public void add(String word, String translation) {

        this.translationsHashMap.putIfAbsent(word, new ArrayList<String>());

    }

    public ArrayList<String> translate(String word) {


    }

}
