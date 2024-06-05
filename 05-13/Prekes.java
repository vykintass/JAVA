public class Prekes extends Parduotuve{
    private String pavadinimas;
    private double kaina;

    public Prekes(String pavadinimas, double kaina) {
        super();
    }
    public double PilnaKaina(int pvm){
        return kaina*(pvm/100)+kaina;
    }
    public int Pvm(int pvm){
        return pvm;
    }
}
