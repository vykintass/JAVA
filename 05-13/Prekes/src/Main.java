import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {




//        Preke preke= new Preke("asas", 10);
//        System.out.println(preke.PilnaKaina(21));
//        System.out.println(preke);

        ArrayList<Preke> list = new ArrayList<Preke>();

        PaprastaPreke paprasta = new PaprastaPreke("paprasta", 10.0);
        System.out.println(paprasta);

        list.add(paprasta);

        AlkoholinisGerimas alus = new AlkoholinisGerimas("alus",2 );
        System.out.println(alus);
        list.add(alus);
        System.out.println(alus.PilnaKaina(6));

        Vynas baltas = new Vynas("Baltas", 9.99);
        System.out.println("Baltas vynas: "+baltas);
        System.out.println(baltas.PilnaKaina(21));
        list.add(baltas);

        System.out.println(list);
    }
}
