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
       //printDeck();

       //give players cards
       p1.hand.add(deck.get(0));
       p1.hand.add(deck.get(1));

       //todo: Homework - give the dealer 2 cards

       Scanner s = new Scanner(System.in);
       System.out.println("What is your name?");
       String aName = s.nextLine();
    //   System.out.println(aName);
       p1.name = aName;
       p1.calculateTotal();
       System.out.println(p1.calculateTotal());
       p1.printInfo();
       System.out.println(d1.totalValue());
       playerMoves();
       dealerMoves();
       winGame();

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

   //public void printDeck() {
      // for (int y = 0; y < deck.size(); y++) {
        //   deck.get(y).printInfo();
      // }
  // }
   public void playerMoves(){
       Scanner Hit = new Scanner(System.in);
           while(p1.isUnder21 && !p1.isBust){
           System.out.println("Do you want to hit?");
           String wantHit = Hit.nextLine();
           if (wantHit.equals("yes")) {
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
       System.out.println("DEALER'S TURN");
       for (int c = 0; c < 2; c++){
           topCard++;
           d1.dHand.add(deck.get(topCard));
       }
       d1.totalValue();
       d1.printInfo();
       while(d1.cardTotal <= 16){
           System.out.println("The total value is " + d1.totalValue());
           d1.dHand.add(deck.get(topCard));
           d1.totalValue();
           d1.dHand.get(d1.dHand.size()-1).printInfo();
           System.out.println("The total value is " + d1.totalValue());
           topCard++;
           if (d1.cardTotal >= 21){
               d1.isBust = true;
           }
           if (d1.cardTotal >= 16){
               d1.isOver16 = true;
               break;
           }

       }
   }
   public void winGame(){
        if (p1.cardTotal > d1.cardTotal && !p1.isOver21){
            System.out.println(p1.name + " won!");
            gameOn = false;
        }
        if (d1.cardTotal >= p1.cardTotal && !d1.isBust){
            System.out.println("Dealer wins!");
            gameOn = false;
        }
        if (p1.is21){
            System.out.println(p1.name + " won!");
            gameOn = false;
        }
        if (d1.isBust){
            System.out.println(p1.name + " won!");
            gameOn = false;
        }
      while (!gameOn) {
          Scanner newRound = new Scanner(System.in);
          String restart = newRound.nextLine();
          if (restart.equals("yes")){
              BasicGameApp b = new BasicGameApp();
              gameOn = true;

          }
          else{
              break;
          }
      }
   }
}
