public class CD implements Packable{
    private double weight =0.1;
    private String arstist;
    private String nameOfTheCD;
    private int yearOfPublication;
    public CD(String artist, String nameOfTheCD, int yearOfPublication) {
        this.arstist=artist;
        this.nameOfTheCD=nameOfTheCD;
        this.yearOfPublication=yearOfPublication;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return arstist + ": "+ nameOfTheCD +" ("+
                + yearOfPublication +")";
    }
}
