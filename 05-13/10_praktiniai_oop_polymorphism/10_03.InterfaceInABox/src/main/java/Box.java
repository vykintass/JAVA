import java.util.ArrayList;

public class Box implements Packable {
    private double maxCapacity;
    private ArrayList<Packable> items;

    public double weight() {
        double weight = 0;
        for (Packable pack : items) {
            weight = weight + pack.weight();
        }
        return weight;
    }


    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable pack) {
        if (this.weight() > this.maxCapacity) {
          return;
        }
        this.items.add(pack);
        this.maxCapacity-=pack.weight();
    }

    @Override
    public String toString() {
        return "Box: "+items.size()
                +" items, total weight "+weight()+" kg";
    }
}
