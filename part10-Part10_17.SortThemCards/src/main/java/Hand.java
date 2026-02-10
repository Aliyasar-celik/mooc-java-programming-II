import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();

    }

    public void add(Card card) {

        cards.add(card);
    }

    public void print() {

        this.cards.stream()
                .forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    public void sortBySuit() {

        SortBySuit sortBySuitSorter = new SortBySuit();
        Collections.sort(this.cards, sortBySuitSorter);

    }

    public int totalValue() {

        int totalValue = this.cards
                .stream()
                .mapToInt(v -> v.getValue())
                .sum();

        return totalValue;
    }

    @Override
    public int compareTo(Hand hand) {

        return this.totalValue() - hand.totalValue();

    }
}
