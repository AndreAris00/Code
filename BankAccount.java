/*

Implementare una classe BankAccount che permette di gestire 
un conto bancario contenente un saldo che può essere modificato 
da depositi e prelievi

costruttore

metodo deposit per versare denaro nel conto bancario

metodo withdraw preleva denaro dal conto bancario

metodo getBalance ritorna il saldo attuale 

*/

package java;
public class BankAccount{
    private double balance;
    public BankAccount(double initialbalance){
        balance = initialbalance;
    }
    //Assegno un valore al conto
    public BankAccount(){
        this(0);
    }
    //Questo metodo restituisce il bilancio
    public double getBalance(){
        return balance;
    }
    //Metodo utilizzato per accreditare soldi al conto
    public void deposit(double amount){
        double newBalance = (balance+amount);
        balance = newBalance;
        
    }
    //Metodo utilizzato per sottrarre soldi al conto
    public void withdraw(double amount){
        double newBalance = (balance-amount);
        balance = newBalance;
    }
}