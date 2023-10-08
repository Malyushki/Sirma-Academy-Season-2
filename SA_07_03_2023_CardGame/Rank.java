public enum Rank {
    ACE(11),
    KING(10 ),
    QUEEN(9 ),
    JACK(8);
    private final int value;

    Rank(int value1) {
        this.value = value1;
    }

    public int getValue() {
        return this.value;
    }
}
