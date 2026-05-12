public class BasicGameApp {
    public Card[]deck;
    public Player p1;
    public Dealer d1;
    public boolean gameOn;

    public static void main(String[] args) {
        BasicGameApp a = new BasicGameApp();
    }
   public BasicGameApp() {
       System.out.println("Welcome to Blackjack!");
       gameOn = true;
       deck = new Card[52];
       String suits[] = {"Diamonds", "Spades", "Hearts", "Clubs"};


       //todo: fill the deck array with your favorite card
       int index = 0;
       for (int i = 0; i < suits.length; i++) {
           for (int x = 1; x <= 13; x++) {
               deck[index] = new Card(x, x, suits[i]);
               index++;
           }

       }
       printDeck();
   }
   public void printDeck(){
      for (int y = 0; y < deck.length; y++){
        deck[y].printInfo();
       }
    }


}
