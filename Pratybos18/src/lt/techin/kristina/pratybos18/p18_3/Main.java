package lt.techin.kristina.pratybos18.p18_3;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(1,"John");
        Client client2 = new Client(2,"Mary");
        Client client3 = new Client(3,"Ben");
        ClientQueue.addClient(client1);
        ClientQueue.addClient(client2);
        ClientQueue.addClient(client3);
        System.out.println(ClientQueue.getClients());
        System.out.println(ClientQueue.nextClient());
        System.out.println(ClientQueue.getClients());
    }
}
