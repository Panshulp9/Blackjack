import java.util.ArrayList;

public class Dealer {
    public boolean isOver16;
    public int cardTotal;
    public boolean isBust;
    ArrayList<Card> dHand;

    public Dealer(){
        dHand = new ArrayList<>();
        cardTotal = 0;
        isBust = false;
        isOver16 = false;
    }
    public int totalValue(){
        int vales = 0;
        for (int d = 0; d < dHand.size(); d++){
            vales = vales + dHand.get(d).value;
        }
        cardTotal = vales;
        return cardTotal;
    }
    public void printInfo(){
        System.out.println("The card total:" + cardTotal);
        System.out.println("is busted: " + isBust);
        System.out.println("is over 16: " + isOver16);
        for(int t = 0; t < dHand.size(); t++){
            dHand.get(t).printInfo();
        }
    }
}
