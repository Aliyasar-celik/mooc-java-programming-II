import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abbreviationsMap;

    public Abbreviations(){
        this.abbreviationsMap = new HashMap<String, String>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {

        abbreviationsMap.put(abbreviation, explanation);

    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbreviationsMap.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    }

    public String findExplanationFor(String abbreviation){

        return abbreviationsMap.get(abbreviation);
    }
}
