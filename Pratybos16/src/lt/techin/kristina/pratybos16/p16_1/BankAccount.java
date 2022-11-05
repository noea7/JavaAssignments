package lt.techin.kristina.pratybos16.p16_1;

public class BankAccount {

    //private final String IBAN_NUMBER = "";
    //private final String ACCOUNT_OWNER = "";
    //private BigDecimal balance = new BigDecimal(0.0);

    private String accountHolderName;
    private int accountNumber;
    private double accountBalance;
    private static int numberOfAccounts = 0;

    public BankAccount(String accountHolderName, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.accountNumber = numberOfAccounts + 1;
        numberOfAccounts ++;
    }

    public BankAccount(String accountHolderName) {
        this(accountHolderName,0);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void addMoney (int amount) {
        if (amount > 0) {
            this.accountBalance += amount;
            System.out.println(amount + " eur added to the account. New balance: " + this.accountBalance + " eur");
        }
    }
    public void takeMoney (int amount) {
        if (amount > 0 && amount <= this.accountBalance) {
            this.accountBalance -= amount;
            System.out.println(amount + " eur withdrew from the account. New balance: " + this.accountBalance + " eur");
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
