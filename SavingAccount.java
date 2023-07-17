public class SavingAccount extends BankAccount{
    
    private double interestRate;

    protected SavingAccount(int accountNumber,double accountBalance,String accountHolder,double interestRate) {
        
        super(accountNumber,accountBalance,accountHolder);
        this.interestRate = interestRate;

    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        System.out.println("Interest Rate : " + interestRate + "%" + "\nInterest : RM " + (super.getAccountBalance() * interestRate) / 100);
    }

    public void displayDetail() {
        super.displayDetail();
        System.out.println("Interest Rate : " + interestRate + "%" + "\nInterest Annually : RM " + (super.getAccountBalance() * interestRate) / 100);
    }
}
