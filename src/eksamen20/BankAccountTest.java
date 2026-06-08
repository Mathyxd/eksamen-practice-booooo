package eksamen20;

public class BankAccountTest {
    public void main() {
        BankAccount account1 = new BankAccount(1001,50,AccountType.BUSINESS);
        BankAccount account2 = new BankAccount(1002,5,AccountType.SAVINGS);
        BankAccount account3 = new BankAccount(1003,500,AccountType.CHECKING);


        account1.transaction(500);
        System.out.println(account1);

        System.out.println(account1.calculateInterest(5));
    }
}
