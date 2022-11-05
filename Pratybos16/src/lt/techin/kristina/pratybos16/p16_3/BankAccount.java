package lt.techin.kristina.pratybos16.p16_3;

public class BankAccount {

    Client client;
    private double balance = 0;
    private double creditLimit = 0;
    private boolean isUsd;
    private static double usdToEur = 1;
    private static double eurToUsd = 1;


    public BankAccount(Client client, double creditLimit, boolean isUsd) {
        this.client = client;
        setCreditLimit(creditLimit);
        client.addAccount(this);
        this.isUsd = isUsd;
    }
    public BankAccount(Client client, double creditLimit) {
        this(client,creditLimit,false);
    }


    public Client getClient() {
        return client;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
    public String getCurrency() {
        if (isUsd) {
            return "Usd";
        } else {
            return "Eur";
        }
    }

    public void setCreditLimit(double creditLimit) {
        if (client.isIndividual()) {
            this.creditLimit = 0;
            if (creditLimit != 0) {
                System.out.println("An Individual can only have a debit account. Credit limit = 0");
            }
        } else if (creditLimit >=0) {
            this.creditLimit = creditLimit;
        }
    }

    public void addMoney (double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Added " + amount + ' ' + getCurrency() + " to account. New balance is " + balance + ' ' + getCurrency());
        }
    }

    public void withdrawMoney (double amount) {
        if (amount > 0 && amount<=balance + creditLimit) {
            this.balance -= amount;
            System.out.println("Withdrew " + amount + ' ' + getCurrency() + " from the account. New balance is " + balance + ' ' + getCurrency());
        } else {
            System.out.println("Invalid amount");
        }
    }
    public void transferMoney (double amount, BankAccount account) {
        if (amount > 0 && amount<=balance + creditLimit) {
            double amountTransferred;
            boolean isConverted;
            //if money is transferred to the same currency account, no conversion is applied
            if (this.isUsd == account.isUsd) {
                amountTransferred = amount;
                isConverted = false;
            } else if (this.isUsd) {
                amountTransferred = amount * BankAccount.usdToEur;
                isConverted = true;
            } else {
                amountTransferred = amount * BankAccount.eurToUsd;
                isConverted = true;
            }
            this.balance -= amount;
            account.balance += amountTransferred;
            System.out.print("Transferred " + amount + ' ' + getCurrency() +
                    " from the account to " + account.client.getName());
            if (isConverted) {
                System.out.print(". Converted " + amount + ' ' + this.getCurrency() + " to " + amountTransferred
                        + " " + account.getCurrency());
            }
            System.out.print(". New balance is " + this.balance + ' ' + getCurrency());
            System.out.println();
        } else {
            System.out.println("Invalid amount");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "client = " + client +
                ", balance = " + balance +
                ", creditLimit = " + creditLimit +
                ", currency = " + getCurrency() +
                '}';
    }
}
