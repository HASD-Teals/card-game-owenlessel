public class CardGameClient {
    public static void main(String[] args) throws Exception {
        Deck test1 = new Deck();
        Deck test2 = new Deck();
        test1.shuffleCards();
        System.out.println(test1);
        test2.shuffleCards();
        System.out.println(test2);
        

        int matches=0;
        for(int i=0;i<test1.getNumCards();i++){
            if(test1.getCardAt(i)==test2.getCardAt(i)){
                System.out.println(test1.getCardAt(i));
                matches++;

            }
        }
        System.out.println(matches);
        

    }
}
