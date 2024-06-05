public class CustomTacoBox implements TacoBox {

    private int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
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
        return "CustomTacoBox{" +
                "tacos=" + tacos +
                '}';
    }
}
