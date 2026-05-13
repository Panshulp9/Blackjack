public class BasicGameApp {
    public Card[]deck;
    public Player p1;
    public Dealer d1;
    public boolean gameOn;
    public int cardIndex = 0;


    public static void main(String[] args) {
        BasicGameApp a = new BasicGameApp();
    }
   public BasicGameApp() {
       System.out.println("Welcome to Blackjack!");
       gameOn = true;
       deck = new Card[52];
       String suits[] = {"Diamonds", "Spades", "Hearts", "Clubs"};


       //todo: fill the deck array with your favorite card

       for (int i = 0; i < suits.length; i++) {
           for (int x = 0; x <= 12; x++) {
               deck[cardIndex] = new Card(x, x, suits[i]);
               cardIndex++;
           }

       }
       shuffle();
       printDeck();


   }

   //todo: Make a shuffle method inside the method. Go through every card aka for loop
    public void shuffle(){
        for (int y = 0; y < deck.length; y++){
            int randy = (int)(Math.random()*52);
            Card helper = deck[randy];
            deck[randy] = deck[y];
            deck[y] = helper;
        }
    }

   public void printDeck() {
       for (int y = 0; y < deck.length; y++) {
           deck[y].printInfo();
       }
   }


}
