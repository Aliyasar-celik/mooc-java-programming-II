import java.util.ArrayList;

public class Box implements Packable {

    private double maxWeight;
    private ArrayList<Packable> items;

    public Box(double maxWeight) {

        this.maxWeight = maxWeight;
        this.items = new ArrayList<Packable>();

    }

    public void add(Packable item) {

        if (item.weight() + this.weight() <= this.maxWeight) {
            this.items.add(item);
        }

    }

    @Override
    public double weight() {

        double weight = 0;
        for (Packable item : items) {

            weight += item.weight();
        }

        return weight;

    }

    public String toString() {

        return "Box: " + this.items.size() + " items, " + "total weight " + weight() + " kg";
    }

}
