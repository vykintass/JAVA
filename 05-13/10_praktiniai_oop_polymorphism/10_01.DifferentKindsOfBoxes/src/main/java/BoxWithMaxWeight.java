import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int maxWeight;

    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();

    }
    @Override
    public void add(Item item) {
        if (this.weightOfItems() + item.getWeight() > this.maxWeight) {
            return;
        }
        this.items.add(item);
    }
    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

    private int weightOfItems() {
        int weight = 0;
        for (Item item : this.items) {
            weight = weight + item.getWeight();
        }
        return weight;
    }
}