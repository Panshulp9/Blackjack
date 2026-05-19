public class Dealer {
    public boolean isOver16;
    public int cardTotal;
    public Card[] dHand;
    public boolean isBust;

    public Dealer(){
        dHand = new Card[2];
        cardTotal = 0;
        isBust = false;
        isOver16 = false;
    }
    public int totalValue(){
        int vales = 0;
        for (int d = 0; d < dHand.length; d++){
            vales = vales + dHand[d].value;
        }
        cardTotal = vales;
        return cardTotal;
    }
    public void printInfo(){
        System.out.println("The card total:" + cardTotal);
        System.out.println("is busted: " + isBust);
        System.out.println("is over 16: " + isOver16);
        for(int t = 0; t < dHand.length; t++){
            dHand[t].printInfo();
        }
    }
}
