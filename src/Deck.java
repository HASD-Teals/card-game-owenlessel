import java.util.Random;

public class Deck {
    // PROPERTIES
    private Card[] cards;

    // CONSTRUCTORS
    public Deck() {
        this.cards = new Card[52];
        this.makeDeck();
    }

    public Deck(int suits, int cardsPerSuit, boolean aceHighLow) {

    }

    // ACCESSORS
    public Card[] getCards() {
        return this.cards;
    }

    public int getNumCards() {
        return cards.length;
    }

    public Card getCardAt(int position) {
        return this.cards[position];
    }

    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    // METHODS
    public void shuffleCards() {
        // Shuffle this.cards in a random order
        Random rand = new Random();
        for (int i = 0; i < cards.length; i++) {
            int j = rand.nextInt(cards.length - 1);
            Card temp = cards[j];
            cards[j] = cards[i];
            cards[i] = temp;
        }
    }

    private void makeDeck() {
        int counter = 0;
        Card temp = null;
        for (int i = 2; i <= 14; i++) {
            if (i == 10) {
                temp = new Card("red", 't', 'h', i, true);
            } else if (i == 11) {
                temp = new Card("red", 'j', 'h', i, true);
            } else if (i == 12) {
                temp = new Card("red", 'q', 'h', i, true);
            } else if (i == 13) {
                temp = new Card("red", 'k', 'h', i, true);
            } else if (i == 14) {
                temp = new Card("red", 'a', 'h', i, true);
            } else {
                String s = "" + i + "";
                temp = new Card("red", s.charAt(0), 'h', i, true);
            }
            this.cards[counter] = temp;
            counter++;
        }
        for (int i = 2; i <= 14; i++) {
            if (i == 10) {
                temp = new Card("red", 't', 'd', i, true);
            } else if (i == 11) {
                temp = new Card("red", 'j', 'd', i, true);
            } else if (i == 12) {
                temp = new Card("red", 'q', 'd', i, true);
            } else if (i == 13) {
                temp = new Card("red", 'k', 'd', i, true);
            } else if (i == 14) {
                temp = new Card("red", 'a', 'd', i, true);
            } else {
                String s = "" + i + "";
                temp = new Card("red", s.charAt(0), 'd', i, true);
            }
            this.cards[counter] = temp;
            counter++;
        }
        for (int i = 2; i <= 14; i++) {
            if (i == 10) {
                temp = new Card("black", 't', 'c', i, true);
            } else if (i == 11) {
                temp = new Card("black", 'j', 'c', i, true);
            } else if (i == 12) {
                temp = new Card("black", 'q', 'c', i, true);
            } else if (i == 13) {
                temp = new Card("black", 'k', 'c', i, true);
            } else if (i == 14) {
                temp = new Card("black", 'a', 'c', i, true);
            } else {
                String s = "" + i + "";
                temp = new Card("black", s.charAt(0), 'c', i, true);
            }
            this.cards[counter] = temp;
            counter++;
        }
        for (int i = 2; i <= 14; i++) {
            if (i == 10) {
                temp = new Card("black", 't', 's', i, true);
            } else if (i == 11) {
                temp = new Card("black", 'j', 's', i, true);
            } else if (i == 12) {
                temp = new Card("black", 'q', 's', i, true);
            } else if (i == 13) {
                temp = new Card("black", 'k', 's', i, true);
            } else if (i == 14) {
                temp = new Card("black", 'a', 's', i, true);
            } else {
                String s = "" + i + "";
                temp = new Card("black", s.charAt(0), 's', i, true);
            }
            this.cards[counter] = temp;
            counter++;
        }
    }

    public int suit() {
        return (this.suit());

    }

    public int rank() {
        return (this.rank());
    }

    public String toString() {
        String deckReport = "";
        // for (int i = 0; i < cards.length; i++) {
        // deckReport = deckReport
        // + (cards[i].getSymbol() + " " + cards[i].getRank() + " " +
        // cards[i].getColor() + "\n");
        // }
        for (Card card : cards) {
            deckReport += card.toString();
        }
        return deckReport;
    }
}
