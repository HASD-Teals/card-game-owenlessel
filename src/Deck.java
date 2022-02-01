public class Deck {
    // PROPERTIES
    private Card[] cards;
    // CONSTRUCTORS
    public Deck() {
        this.cards = new Card[52];
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
    }
    private void makeDeck(){
        
        
    }
}
