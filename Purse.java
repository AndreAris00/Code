package java;

public class Purse {
    private int nickels;
    private int quarters;
    private int dimes;
    private static final double NICKELS_VALUE = 0.05;
    private static final double QUARTER_VALUE = 0.25;
    private static final double DIMES_VALUE = 0.1;

    //Inizializzo il borsellino 
    public Purse(int nickels, int quarter, int dimes){
        nickels = 0;
        quarters = 0;
        dimes = 0;
    }
    //Aggiungo nickels nel borsellino
    public void addNickels(int count){
    nickels = nickels + count;
    }
    //Aggiungo quarters nel borsellino
    public void addQuarter(int count){
    quarters = quarters + count;
    }
    //Aggiungo dimes nel borsellino
    public void addDimes(int count){
    dimes = dimes + count;
    }
    //Restituidco il totale
    public  double getTotal(){
        return nickels * NICKELS_VALUE + dimes * DIMES_VALUE + quarters * QUARTER_VALUE;
    }
}


