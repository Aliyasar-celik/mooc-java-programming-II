import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> debtListHashMap;

    public IOU() {
        this.debtListHashMap = new HashMap<String, Double>();
    }

    public void setSum(String toWhom, double amount) {
        this.debtListHashMap.put(toWhom, amount);

    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.debtListHashMap.getOrDefault(toWhom, 0.0);
    }

}
