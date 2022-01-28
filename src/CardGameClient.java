public class CardGameClient {
    public static void main(String[] args) throws Exception {
        Card C1 = new Card("red", 'K', 'L', 13, true);
        Card C2 = new Card("red", 'K', 'L', 13, true);

        System.out.println(C1.cardEqual(C2));

    }
}
