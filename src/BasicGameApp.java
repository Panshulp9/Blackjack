public class BasicGameApp {
    public Card[]deck;
    public Player p1;
    public Dealer d1;
    public boolean gameOn;

    public static void main(String[] args) {
        BasicGameApp a = new BasicGameApp();
    }
   public BasicGameApp(){
       System.out.println("Welcome to Blackjack!");
       gameOn = true;
       deck = new Card[52];

       //todo: fill the deck array with your favorite card
       for (int x = 0; x < 13; x++){
           deck[x] = new Card(9,x,"diamonds");
           deck[x].printInfo();
       }

    }

}
