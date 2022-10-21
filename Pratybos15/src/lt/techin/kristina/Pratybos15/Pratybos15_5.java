package lt.techin.kristina.Pratybos15;

public class Pratybos15_5 {

    public static void main(String[] args) {
        MoneyJar moneyJar = new MoneyJar(100);
        System.out.println(moneyJar);
        moneyJar.addMoney(10);
        moneyJar.addMoney(20);
        moneyJar.removeMoney(50);
        moneyJar.removeMoney(1000);
        System.out.println(moneyJar.getBalance());
        System.out.println(moneyJar.getAverageDepositSum());
        System.out.println(moneyJar);
    }
}
