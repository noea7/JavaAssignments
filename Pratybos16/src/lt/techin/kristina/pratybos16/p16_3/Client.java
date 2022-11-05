package lt.techin.kristina.pratybos16.p16_3;


public class Client {
    private String name;
    private boolean isIndividual;
    private BankAccount[] accounts = new BankAccount[10];
    private int accountNumberCount = 0;

    public Client(String name, boolean isIndividual) {
        this.name = name;
        this.isIndividual = isIndividual;
    }

    public String getName() {
        return name;
    }

    public boolean isIndividual() {
        return isIndividual;
    }

    public void addAccount(BankAccount account){
        accounts[accountNumberCount] = account;
        accountNumberCount++;
    }

    public BankAccount[] getAccounts() {
        for (int i = 0; i < accountNumberCount; i++){
            System.out.println(accounts[i]);
        }
        return accounts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", isIndividual=" + isIndividual +
                '}';
    }
}
