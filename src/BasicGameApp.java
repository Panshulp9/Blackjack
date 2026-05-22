import java.util.ArrayList;
import java.util.Scanner;

public class BasicGameApp {
    ArrayList<Card> deck;
    public Player p1;
    public Dealer d1;
    public boolean gameOn;
    public int topCard = 3;


    public static void main(String[] args) {
        BasicGameApp a = new BasicGameApp();
    }
   public BasicGameApp() {
       System.out.println("Welcome to Blackjack!");
       gameOn = true;
       deck = new ArrayList<>();
       String[] suits = {"Diamonds", "Spades", "Hearts", "Clubs"};
       //players
       p1 = new Player();
       d1 = new Dealer();


       //todo: fill the deck array with your favorite card

       for (int i = 0; i < suits.length; i++) {
           for (int x = 0; x <= 12; x++) {
               deck.add(new Card(x,x,suits[i]));
           }
       }
       shuffle();
       printDeck();

       //give players cards
       p1.hand.add(deck.get(0));
       p1.hand.add(deck.get(1));
       //todo: Homework - give the dealer 2 cards

       Scanner s = new Scanner(System.in);
       System.out.println("What is your name?");
       String aName = s.nextLine();
       System.out.println(aName);
       p1.name = aName;
       p1.calculateTotal();
       System.out.println(p1.calculateTotal());
       p1.printInfo();
       System.out.println(d1.totalValue());
       d1.printInfo();
       playerMoves();
       dealerMoves();

   }

   //todo: Make a shuffle method inside the method. Go through every card aka for loop
    public void shuffle(){
        for (int y = 0; y < deck.size(); y++){
            int randy = (int)(Math.random()*52);
            Card helper = deck.get(randy);
            deck.set(randy,deck.get(y));
            deck.set(y,helper);
        }
    }

   public void printDeck() {
       for (int y = 0; y < deck.size(); y++) {
           deck.get(y).printInfo();
       }
   }
   public void playerMoves(){
       Scanner Hit = new Scanner(System.in);
           while(p1.isUnder21 && !p1.isBust){
           System.out.println("Do you want to hit?");
           String wantHit = Hit.nextLine();
           System.out.println(wantHit);
           if (wantHit .equals("yes")) {
               p1.hand.add(deck.get(topCard));
               for(int i = 0; i < p1.hand.size(); i++){
                   p1.hand.get(i).printInfo();
               }
               System.out.println(p1.calculateTotal());
               if (p1.isOver21){
                   p1.isBust = true;
                   System.out.println("YOU LOST! 🫵");
               }
               if (p1.is21){
                   p1.gameWon = true;
               }
           }
               topCard++;
           if (wantHit.equals("no")){
               break;
           }
       }
   }
   public void dealerMoves(){
       for (int c = 0; c < 2; c++){
           d1.dHand.add(deck.get(topCard));
           topCard++;
       }
       System.out.println(d1.totalValue());
       d1.printInfo();
       while(!d1.isOver16){
           d1.dHand.add(deck.get(topCard));
           System.out.println(d1.totalValue());
           d1.dHand.get(topCard).printInfo();
           topCard++;
           if (d1.cardTotal >= 16){
               break;
           }

       }
   }
}
