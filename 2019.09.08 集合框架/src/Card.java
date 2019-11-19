public class Card {
    public int rank;
    public String suit;

    public Card(int rank,String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String v;
        if(rank == 1) {
            v = "A";
        } else {
            v = String.valueOf(rank);
        }
        return String.format("[%s,%d]",suit,rank);
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(!(obj instanceof Card)) {
            return false;
        }
        if(obj == this) {
            return true;
        }
        Card o = (Card)obj;
        return rank == o.rank && suit.equals(o.suit);
    }
}
