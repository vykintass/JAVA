
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox triple = new TripleTacoBox();

        CustomTacoBox custom = new CustomTacoBox(10);
        System.out.println(custom);
        custom.eat();
        custom.tacosRemaining();
        System.out.println(custom);
    }
}
