package lt.techin.kristina.pratybos18.p18_3;

import java.util.LinkedList;
import java.util.List;

public class ClientQueue {
    private static LinkedList<Client> clients = new LinkedList<>();

    public static List<Client> getClients() {
        return clients;
    }
    public static Client nextClient() {
        return clients.removeFirst();
    }
    public static void addClient(Client client) {
        clients.add(client);
    }
}
