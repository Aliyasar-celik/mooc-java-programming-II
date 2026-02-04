import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        items = new ArrayList<Item>();
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() < 0) {
            return;
        }
        if (this.totalWeight() + item.getWeight() > capacity) {

            return;
        }

        items.add(item);

    }

    public int totalWeight() {

        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    @Override
    public boolean isInBox(Item item) {

        for (Item iterationItem : items) {
            if (iterationItem.equals(item)) {
                return true;
            }

        }
        return false;

    }

}
