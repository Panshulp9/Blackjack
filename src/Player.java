import java.util.ArrayList;

public class Player {
    public int cardTotal;
    public boolean isBust;
    public boolean isHit;
    public String name;
    public boolean is21;
    public boolean isUnder21;
    public boolean isOver21;
    public boolean gameWon;
    ArrayList<Card> hand;

    public Player(){
        hand = new ArrayList<>();
        cardTotal = 0;
        isBust = false;
        isHit = false;
        name = "Player 1";
        is21 = false;
        isUnder21 = false;
        isOver21 = false;
        gameWon = false;
    }
    //todo: make a method called calculateTotal()
    public int calculateTotal(){
        int addedValue = 0;
        for (int d = 0; d < hand.size(); d++){
            addedValue = addedValue + hand.get(d).value;
        }
        cardTotal = addedValue;
        if (cardTotal == 21){
            is21 = true;
            isUnder21 = false;
            isOver21 = false;
        }
        if (cardTotal < 21){
            isUnder21 = true;
        }
        if (cardTotal > 21){
            isOver21 = true;
            is21 = false;
            isUnder21 = false;
            isBust = true;
        }
        return cardTotal;
    }

    public void printInfo(){
        System.out.println("The card total:" + cardTotal);
        System.out.println("is busted: " + isBust);
      //  System.out.println("is hit: " + isHit);
      //  System.out.println("name: " + name);
        for(int z = 0; z < hand.size(); z++){
            hand.get(z).printInfo();
        }
    }

}
