public class Card {
    public int value;
    public String name;
    public String suit;

    public Card(int CValue, int CName, String CSuit){
        value = CValue;

       if (CName == 0){
            name = "ace";
            value = 11;
        } else if(CName == 1){
           name = "2";
           value = 2;
       }

        suit = CSuit;
    }

    //todo: make a printInfo method that prints the card info

    public void printInfo(){
        System.out.println("The " + name + " of " + suit + " is worth " + value + " points.");
    }
}
