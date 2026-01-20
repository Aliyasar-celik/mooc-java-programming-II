import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DictionaryOfManyTranslations {

    // the Exercise dictates English to Finnish
    private HashMap<String, ArrayList<String>> translationsHashMap;

    public DictionaryOfManyTranslations() {
        this.translationsHashMap = new HashMap<String, ArrayList<String>>();
    }

    public void add(String word, String translation) {

        this.translationsHashMap.putIfAbsent(word, new ArrayList<String>());

        ArrayList<String> translations = this.translationsHashMap.get(word);

        translations.add(translation);

    }

    public ArrayList<String> translate(String word) {

        if (this.translationsHashMap.containsKey(word)) {
            return this.translationsHashMap.get(word);
        }

        return new ArrayList<String>();

    }

    public void remove(String word) {

        this.translationsHashMap.remove(word);

    }

}
