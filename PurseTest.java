package java;
public class PurseTest{
    public static void main(String[] args) {
        Purse myPurse = new Purse(0,0,0);
        myPurse.addNickels(3);
        myPurse.addDimes(1);
        myPurse.addQuarter(2);
        System.out.println(myPurse.getTotal());

    }
}