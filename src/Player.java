public class Player {
    public int cardTotal;
    public boolean isBust;
    public Card[]hand;
    public boolean isHit;
    public String name;

    public Player(){
        hand = new Card[2];
        cardTotal = 0;
        isBust = false;
        isHit = false;
        name = "Player 1";
    }
    public void printInfo(){
        System.out.println("The card total:" + cardTotal);
        System.out.println("is busted: " + isBust);
        System.out.println("is hit: " + isHit);
        System.out.println(name);
        for(int z = 0; z < hand.length; z++){
            System.out.println(hand[z]);
        }
    }
}
