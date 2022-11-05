package lt.techin.kristina.pratybos17.p17_4;

public class Item {
    public String name;
    public int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }
}
