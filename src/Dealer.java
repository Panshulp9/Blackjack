public class Dealer {
    public boolean isOver16;
    public int cardTotal;
    public Card[]hand;
    public boolean isBust;

    public Dealer(){
        hand = new Card[2];
        cardTotal = 0;
        isBust = false;
        isOver16 = false;
    }
    public void printInfo(){
        System.out.println("The card total:" + cardTotal);
        System.out.println("is busted: " + isBust);
        System.out.println("is over 16: " + isOver16);
        for(int z = 0; z < hand.length; z++){
            System.out.println(hand[z]);
        }
    }
}
