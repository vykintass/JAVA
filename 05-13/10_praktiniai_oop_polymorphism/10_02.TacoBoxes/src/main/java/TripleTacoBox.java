public class TripleTacoBox implements TacoBox {

    public int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        if (this.tacos == 0) {
            return;
        }
        this.tacos -= 1;
    }

    @Override
    public String toString() {
        return "TripleTacoBox{" +
                "tacos=" + tacos +
                '}';
    }
}
