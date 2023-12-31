public enum ColorCard {
    CLUBS(1),
    DIAMONDS(2),
    HEARTS(3),
    SPADES(4);
    private final int value;

    ColorCard(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
