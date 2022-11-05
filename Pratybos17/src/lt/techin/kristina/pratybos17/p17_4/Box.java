package lt.techin.kristina.pratybos17.p17_4;

import java.util.ArrayList;

public abstract class Box {
    public abstract void add (Item item);
    public abstract void add (ArrayList<Item> items);
    public abstract boolean isInBox (Item item);
}
