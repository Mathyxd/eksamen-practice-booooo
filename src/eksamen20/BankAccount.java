package eksamen20;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private AccountType accountType;

    public BankAccount(int accountNumber, int balance, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void transaction(int amount) {
        if (balance + amount < 0) {
            System.out.println("ikke nok penge på kontoen");
        } else {
            balance = balance + amount;
        }
    }

    public double calculateInterest(int years) {
        if (accountType == AccountType.SAVINGS) {
            return balance * 0.03 * years;
        } else if (accountType == AccountType.BUSINESS) {
            return balance * 0.02 * years;
        } else {
            return balance * 0.01 * years;
        }
    }


    @Override
    public String toString() {
        return accountNumber + " - " + balance + " - " + accountType;
    }
}
