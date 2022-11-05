package lt.techin.kristina.pratybos16.p16_3;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Kristina", true);
        BankAccount account1 = new BankAccount(client1,0);
        account1.addMoney(100.0);
        client1.getAccounts();
        System.out.println(account1.getClient());
        Client client2 = new Client("Some Company", false);
        BankAccount account2 = new BankAccount(client2,1000);
        System.out.println(account2.getBalance());
        account2.transferMoney(900,account1);
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        Client client3 = new Client("Mindaugas",true);
        BankAccount account3 = new BankAccount(client3,0,true);
        account3.transferMoney(100,account1);
        account3.addMoney(500);
        account3.transferMoney(100,account1);
        account1.transferMoney(50,account3);
        BankAccount account4 = new BankAccount(client1,0,true);
        client1.getAccounts();
        account4.withdrawMoney(100);
        account1.withdrawMoney(100);
    }
}
