package java;
public class SavingsAccounts extends BankAccount{
    private double interestRate;
    public SavingsAccounts(double rate){
        interestRate = rate;
    }
    //Metodo per aggiungere interesse al conto
    public void addInterest(){
        double interest = getBalance() * interestRate/100;
        deposit(interest);

    }
}