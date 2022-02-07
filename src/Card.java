public class Card {
    // PROPERTIES
    private String color;
    private char rank;
    private char symbol;
    private int value;
    private boolean playable;

    // CONSTRUCTORS
    public Card() {
    }

    public Card(String color, char rank, char symbol, int value, boolean playable) {
        this.color = color;
        this.rank = rank;
        this.symbol = symbol;
        this.value = value;
        this.playable = playable;
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }

    public char getRank() {
        return this.rank;
    }

    public char getSymbol() {
        return this.symbol;
    }

    public int getValue() {
        return this.value;
    }

    public boolean getPlayable() {
        return this.playable;
    }

    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }

    public void setRank(char rank) {
        this.rank = rank;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPlayable(boolean playable) {
        this.playable = playable;
    }

    // METHODS
    public String toString(){
        String report="";
        report=this.color + " " + this.rank + " " + this.symbol + " " + this.value + "\n"; 
        
        
        return report;
    }
    public boolean cardEqual(Card C){
        return this.value==C.value;
    }
}
