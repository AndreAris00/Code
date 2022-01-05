package java;
public class BankAccountTest{
    
    public static void main (String[] args){
        BankAccount myAccount = new BankAccount(0);
        SavingsAccounts myInterest = new SavingsAccounts(0.8);
        CheckingAccount myAcc = new CheckingAccount(2);
        myAccount.deposit (800);
        myAccount.withdraw (450);
        myInterest.deposit(800);
        myInterest.withdraw(450);
        myAcc.deposit(800);
        myAcc.withdraw(450);
        System.out.println("Il mio saldo è:" + myAccount.getBalance());
        myInterest.addInterest();
        System.out.println("Il mio saldo con interessi è :" + myInterest.getBalance());
        myAcc.deductFees();
        System.out.println("Il mio saldo con commissioni è :" + myAcc.getBalance());

    }
    
}