package lt.techin.exam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Tasks {


    /* Paduotus duomenis kilometrais ir metrais konvertuoja į metrus ir rezultatą išveda į ekraną
     * pvz. kilometers = 4, meters = 67 =>
     * Atspausdina:
     * 4067 metrų
     */
    public static void convertToMeters(int kilometers, int meters) {
        System.out.println(kilometers * 1000 + meters + " metrų");
    }

    /*Kasininkė grąžą pirkėjui pabėrė centais ct. Reikia apskaičiuoti kiek tai yra eurų  ir centų .
     * pvz. 234 ct => atspausdina:
     * Gauta: 2 Eur ir 34 ct
     */
    public static void convertCentsToEuros(int cents) {
        System.out.println("Gauta: " + cents / 100 + " Eur ir " + cents % 100 + " ct");

    }


    /* Raskite skaičių a, b ir c vidurkį
     */
    public static double averageOf(int a, int b, int c) {
        return ((double) a + b + c) / 3;
    }


    /* Duoti trys skaičiai. Parašykite metodą, kuris nustatytų, ar bent vienas iš jų yra lyginis.
    Pvz.:
     a = 1, b = 3, c = 5 => false
     a = 1, b = 3, c = 6 => true

    * */
    public static boolean isEven(int a, int b, int c) {
        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            return true;
        }
        return false;
    }


    /*
     * Metodas parodo ar iš duotų trijų atkarpų (įvedami jų ilgiai) galima sudaryti trikampį.
     */
    public static boolean isTriangleValid(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a)
            return false;
        else
            return true;
    }


    /* Metodas spausdina  nelyginius skaičius nuo pateikto skaičiaus 'number' iki 1
     * pvz. number = 8 =>
     * 7
     * 5
     * 3
     * 1
     *  */
    public static void printOddNumbers(int number) {
        for (int i = number; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }


    /* Paskaičiuoti kiek masyve yra skaičių didesnių nei skaičius 'number'
     * Pvz. array =  {5, 2, 4, 1} number = 3 => 2
     */
    public static int countLargerThanNumber(int[] array, int number) {
        int max = number;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                count++;
            }
        }
        return count;
    }


    /* Surasti mažiausią skaičių ArrayListe
     * Pvz {6.7, 3.5, 8.2, 4.3} => 8.2
     */
    public static double findSmallest(ArrayList<Double> numbers) {
        Double min = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (min > numbers.get(i)) {
                min = numbers.get(i);
            }
        }
        return min;
    }


    /*
     * Paskaičiuokite kiek simbolių yra String'ų List'e
     */
    public static int countLettersInList(List<String> words) {
        int characters = 0;
        for (String str : words) {
            characters = characters + str.length();
        }
        return characters;
    }


    /* Paskaičiuoti kiek ArrayListe yra stringų, kuriuose yra žodis word
        pvz: {"iphone 12", "IPHONE 12", "samsung s23"} word = "iphone" => 2
     */
    public static int countStringsContainingWord(ArrayList<String> strings, String word) {
        int count = 0;
        for (String s : strings) {
            if (s.toUpperCase().contains(word.toUpperCase())) {
                count++;
            }
        }
        return count;

    }


    /*
     * Paskaičiuokite kiek liste elementų, kur savybė displayed yra true
     */
    public static int countDisplayedElements(List<Element> elements) {
        //return (int) elements.stream().filter(x->x.equals(true)).count();
        return (int) elements.stream().filter(Element::isDisplayed).count();

       // throw new UnsupportedOperationException("Parašykite implementaciją");
    }

    /*
     * Grąžinkite listą elementų kurių tekstas nėra tuščias arba sudarytas tik iš tarpų
     */
    public static List<Element> findElementsWithNonEmptyTexts(List<Element> elements) {
//        for (Element e:elements) {
//            if (e.getText().isEmpty() || e.equals(null)){
//                break;
//            }else {
//                elements.add(e);
//            }
//        }return elements;
      return elements.stream().filter(e-> !e.getText().isEmpty() && e != null).collect(Collectors.toList());
    }


    /*
     * Elementų tekste užrašytos prekių kainos, pvz. "$10.52"
     * Raskite didžiausią kainą
     */
    public static double findSumOfPrices(List<Element> elements) {
        double sum = 0.0;
        for (Element element : elements) {
            String s = element.getText();
            s = s.replaceAll("\\$", "");
            double price = Double.parseDouble(s);
            sum += price;
        }
        return sum;
    }
    public static void main(String[] args) {
        throw new UnsupportedOperationException("Parašykite implementaciją");
    }


}
