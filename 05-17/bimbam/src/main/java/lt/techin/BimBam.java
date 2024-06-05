package lt.techin;

import java.sql.SQLOutput;

public class BimBam {


    public static void main(String[] args) {

        bimBam(15);
    }
    public static void bimBam(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("BimBam");
            } else if (i % 3 == 0) {
                System.out.println("Bim");
            } else if (i % 5 == 0) {
                System.out.println("Bam");
            } else {
                System.out.println(i);
            }
        }
    }


}
