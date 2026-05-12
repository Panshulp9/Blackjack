public class Card {
    public int value;
    public String name;
    public String suit;

    public Card(int CValue, int CName, String CSuit){
        value = CValue;

       if (CName == 0){
            name = "ace";
            value = 11;
        }
       if(CName == 1){
           name = "2";
           value = 2;
       }
       if(CName == 2){
           name = "3";
           value = 3;
       }
        if(CName == 3){
            name = "4";
            value = 4;
        }
        if(CName == 4){
            name = "5";
            value = 5;
        }
        if(CName == 5){
            name = "6";
            value = 6;
        }
        if(CName == 6){
            name = "7";
            value = 7;
        }
        if(CName == 7){
            name = "8";
            value = 8;
        }
        if(CName == 8){
            name = "9";
            value = 9;
        }
        if(CName == 9){
            name = "10";
            value = 10;
        }
        if(CName == 10){
            name = "Jack";
            value = 10;
        }
        if(CName == 11){
            name = "Queen";
            value = 10;
        }
        if(CName == 12){
            name = "King";
            value = 10;
        }









        suit = CSuit;
    }

    //todo: make a printInfo method that prints the card info

    public void printInfo(){
        System.out.println("The " + name + " of " + suit + " is worth " + value + " points.");
    }
}
