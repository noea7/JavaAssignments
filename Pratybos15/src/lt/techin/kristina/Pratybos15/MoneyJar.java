package lt.techin.kristina.Pratybos15;

public class MoneyJar {

    private int balance = 0;
    private int depositSum = 0;
    private int numberOfDeposits = 0;

    public MoneyJar(int amount) {
        if (amount <= 1000) {
            this.balance = amount;
        } else {
            this.balance = 1000;
            System.out.println("Maximum balance 1000 eur");
        }
    }

    public int getBalance() {
        return balance;
    }

    public void addMoney (int amount) {
        if (amount > 0 && this.balance+amount <= 1000) {
            this.balance += amount;
            depositSum += amount;
            numberOfDeposits++;
            System.out.println("Added " + amount + " eur. New balance " + this.balance + " eur.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
    public void removeMoney (int amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Removed " + amount + " eur. New balance " + this.balance + " eur.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
    public double getAverageDepositSum () {
        return (double) this.depositSum / this.numberOfDeposits;
    }

    @Override
    public String toString() {
        return "MoneyJar with " + balance + " Eur";
    }
}
