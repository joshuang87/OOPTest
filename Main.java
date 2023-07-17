public class Main {
    public static void main(String[] args) {
        
        System.out.println("BankAccount class method testing : \n");
        BankAccount bankAccount = new BankAccount(1234567, 8413.42, "Joshua");
        bankAccount.deposit(1000);
        bankAccount.displayDetail();

        System.out.println("\nSavingAccount class method testing : \n");
        SavingAccount savingAccount = new SavingAccount(324141, 87913.00, "Joshua", 3.0);
        savingAccount.displayDetail();

        System.out.println("\nCurrentAccount class method testing : \n");
        CurrentAccount currentAccount = new CurrentAccount(2131414, 32410, "Joshua", 1000);
        currentAccount.withdraw(33410);
    }
}