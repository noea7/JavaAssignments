package lt.techin.kristina.pratybos17.p17_4;

import java.util.ArrayList;

public class BoxWithMaximumWeight extends Box{
    private int maximumWeight;
    private ArrayList<Item> items = new ArrayList<>();

    @Override
    public void add(Item item) {
        items.add(item);
    }

    @Override
    public void add(ArrayList<Item> items) {
        this.items.addAll(items);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    public void boxWithMaximumWeight (int capacity) {

    }
}
