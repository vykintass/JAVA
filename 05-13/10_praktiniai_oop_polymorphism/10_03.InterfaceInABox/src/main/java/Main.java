
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Box box = new Box(10);
        box.add(new Book("Dost", "crime", 2));
        box.add(new Book("robert", "cllean", 1));
        box.add(new Book("kent", "test", 0.5));


        box.add(new CD("pink", "dark", 1973));
        box.add(new CD("wgma", "nuvlea", 1975));
        box.add(new CD("park", "closer", 2012));

        System.out.println(box);

    }

}
