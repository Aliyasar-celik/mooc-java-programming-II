import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {

        SortBySuit sortBySuitSorter = new SortBySuit();
        if (sortBySuitSorter.compare(c1, c2) == 0) {

            return c1.getValue() - c2.getValue();
        }

        return sortBySuitSorter.compare(c1, c2);
    }

}
