package java;
public class CheckingAccount extends BankAccount{
    private int transitionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 2.0;

    public CheckingAccount(double initialBalance){
        super(initialBalance);
        transitionCount = 0;
    }
    //Incremento conto transizioni per i depositi
     public void deposit(double amount){
        transitionCount++;
        super.deposit(amount);
     }
      //Incremento conto transizioni per le detrazioni
     public void withdraw (double amount){
         transitionCount++;
         super.withdraw(amount);
     }
     //Metodo per la detrazione tasse
     public void deductFees(){
         if (transitionCount > FREE_TRANSACTIONS){
         double fees = TRANSACTION_FEE * (transitionCount - FREE_TRANSACTIONS);
         super.withdraw(fees);
         }
         
     }
}
