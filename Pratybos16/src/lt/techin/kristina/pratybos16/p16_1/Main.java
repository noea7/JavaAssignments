package lt.techin.kristina.pratybos16.p16_1;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Kristina", 100);
        System.out.println(account);
        account.addMoney(100);
        account.takeMoney(300);
        account.takeMoney(50);
        System.out.println(account.getAccountBalance());
        System.out.println(account.getAccountHolderName());
    }
}
