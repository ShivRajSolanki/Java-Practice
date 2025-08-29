/*Program to Simulate an ATM
Problem Statement: Create a BankAccount class with attributes accountHolder,
accountNumber, and balance. Add methods for:
● Depositing money.
● Withdrawing money (only if sufficient balance exists).
● Displaying the current balance. */
class BankAccount{
    String accountHolderName;
    int accountNumber;
    double Balance;
    public BankAccount(String accountHolderName, int accountNumber, double Balance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.Balance = Balance;
    }
    public void Deposite(double money){
        System.out.println(money+" Money has been deposited");
        Balance += money;
    }
    public void withdraw(double money){
        if(Balance >= money){
            Balance -= money;
            System.out.println(money+" money has been withdrew");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public void displayBalance(){
        System.out.println("Available Balance "+Balance);
    }

}
public class BankAccountDetails {
    public static void main(String args[]){
    BankAccount custmor1 = new BankAccount("Shivraj", 1234560, 10000);
    custmor1.Deposite(5000);
    custmor1.withdraw(8000);
    custmor1.displayBalance();
    
}
}