import java.util.Random;
public class Deck {
    // PROPERTIES
    private Card[] cards;
    // CONSTRUCTORS
    public Deck() {
        this.cards = new Card[52];
        this.makeDeck();
    }
    public Deck(int suits,int cardsPerSuit,boolean aceHighLow){

    }
    // ACCESSORS
    public Card[] getCards() {
        return this.cards;
    }

    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    // METHODS
    public void shuffleCards() {
        // Shuffle this.cards in a random order
        Random rand = new Random();
    }
    private void makeDeck(){
        int counter=0;
        for(int i=2;i<=14;i++){
            Card temp = new Card("red", 'h', 'h', i, true);
            this.cards[counter]= temp;
            counter++;
        }
        for(int i=2;i<=14;i++){
            Card temp = new Card("red", 'd', 'd', i, true);
            this.cards[counter]= temp;
            counter++;
        }
        for(int i=2;i<=14;i++){
            Card temp = new Card("black", 'c', 'c', i, true);
            this.cards[counter]= temp;
            counter++;
        }
        for(int i=2;i<=14;i++){
            Card temp = new Card("black", 's', 's', i, true);
            this.cards[counter]= temp;
            counter++;
        }
        
    }
}
