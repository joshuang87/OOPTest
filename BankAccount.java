public class BankAccount {
    
    private int accountNumber;
    private double accountBalance;
    private String accountHolder;

    protected BankAccount(int accountNumber,double accountBalance,String accountHolder) {

        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolder = accountHolder;

    }

    public int getAccountNumber() {
         return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber; 
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        this.accountBalance = accountBalance + amount;
    }

    public void withdraw(double amount) {
        this.accountBalance = accountBalance - amount;
    }

    public void displayDetail() {
        System.out.println("Account Number : " + accountNumber + "\nAccount Balance : RM " + accountBalance + "\nAccount Holder : " + accountHolder);
    }

}
