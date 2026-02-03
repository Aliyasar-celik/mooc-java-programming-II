import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<Double>();
    }

    public void add(double status) {

        history.add(status);
    }

    public void clear() {

        history.clear();

    }

    public String toString() {

        return history.toString();

    }

    public double maxValue() {
        double maxValue = 0;

        for (double value : history) {

            if (maxValue < value) {

                maxValue = value;
            }
        }

        return maxValue;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }

        double minValue = this.history.get(0);

        for (double value : this.history) {

            if (minValue > value) {
                minValue = value;
            }
        }

        return minValue;
    }

    public double average() {

        if (this.history.isEmpty()) {
            return 0;
        }

        double sumOfTheValues = 0;

        for (double value : this.history) {

            sumOfTheValues += value;
        }

        return sumOfTheValues / (double) this.history.size();

    }
}
