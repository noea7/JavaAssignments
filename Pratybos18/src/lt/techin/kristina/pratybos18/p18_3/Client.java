package lt.techin.kristina.pratybos18.p18_3;

public class Client {
    int clientId;
    String clientName;

    public Client(int clientId, String clientName) {
        this.clientId = clientId;
        this.clientName = clientName;
    }

    public int getClientId() {

        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (clientId != client.clientId) return false;
        return clientName != null ? clientName.equals(client.clientName) : client.clientName == null;
    }

    @Override
    public int hashCode() {
        int result = clientId;
        result = 31 * result + (clientName != null ? clientName.hashCode() : 0);
        return result;
    }
}
