public class Card {
    public int value;
    public String name;
    public String suit;

    Card(){
        value = (int)(Math.random()*11)+2;
    }
}
