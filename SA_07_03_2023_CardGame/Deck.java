import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
    }

    public void addCard(Card card) {
        this.deck.add(card);
    }

    public void printDeck() {
        int count=1;
        for (Card card : this.deck) {
            System.out.printf("%d.| %s%n",count,card);
            count++;
        }
    }

    public void shuffle() {
        Collections.shuffle(this.deck);

    }

    public Deck drawFive() {
        Deck draw = new Deck();
        for (int card = 1; card < 6; card++) {
            draw.addCard(this.deck.get(0));
            this.deck.remove(0);

        }
        return draw;
    }

    public Card draw(int index) {
        Card draw = this.deck.get(index);
        this.deck.remove(index);
        return draw ;
    }

    public static boolean compare(Card card1, Card card2) {
        return card1.getValue() > card2.getValue();
    }

    public static int sum(Deck deck) {

        return deck.getDeck().stream().mapToInt(Card::getValue).sum();
    }

    public List<Card> getDeck() {
        return deck;
    }

    public static Deck generateFullDeck() {
        Deck masterDeck = new Deck();
        for (int rank = 0; rank < 4; rank++) {
            for (int color = 0; color < 4; color++) {
                Card card = new Card(ColorCard.values()[color], Rank.values()[rank]);
                masterDeck.addCard(card);
            }
        }

        masterDeck.shuffle();
        return masterDeck;
    }
}
