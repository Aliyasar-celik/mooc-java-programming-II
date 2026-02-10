import java.util.Comparator;

public class SortBySuit implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        int suitDifference = c1.getSuit().ordinal() - c2.getSuit().ordinal();

        // This shouldnt have been there but tests gave an error.
        if (suitDifference == 0) {
            return c1.getValue() - c2.getValue();
        }

        return suitDifference;

    }

}
