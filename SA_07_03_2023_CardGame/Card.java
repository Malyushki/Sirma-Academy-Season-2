public class Card {
    ColorCard color;
    Rank rang;

    public Card(ColorCard color, Rank rang) {
        this.color = color;
        this.rang = rang;
    }

    public int getValue() {
        return this.color.getValue() * this.rang.getValue();
    }

    @Override
    public String toString() {
        return String.format("%s of %s [%d]",rang,color,this.getValue());
    }
}
