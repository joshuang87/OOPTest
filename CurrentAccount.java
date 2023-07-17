public class CurrentAccount extends BankAccount{
    
    private double overdraftLimit;

    protected CurrentAccount(int accountNumber,double accountBalance,String accountHolder,double overdraftLimit) {
        super(accountNumber, accountBalance, accountHolder);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= super.getAccountBalance()) {
            super.withdraw(amount);
        }
        else if (amount <= (super.getAccountBalance() + overdraftLimit)) {
            double overdraftAmount = amount - super.getAccountBalance();
            super.setAccountBalance(0);
            double chargeAmount = overdraftAmount * 0.03;
            System.out.println("Withdraw Successfully. Your overdraft amount is RM " + overdraftAmount + "\nBank will charge you 3% form your overdraft amount : RM " + chargeAmount);
        }
        else {
            System.out.println("Withdraw failed. Insufficient funds and overdraft limit exceeded.");
        }
    }
}
