public abstract class Preke {
    private String pavadinimas;
    private double kaina;

    public Preke(String pavadinimas, double kaina) {
        this.pavadinimas=pavadinimas;
        this.kaina=kaina;
    }
    public double PilnaKaina(int pvm){
        return kaina*(pvm/100)+kaina;
    }
    public int Pvm(int pvm){
        return pvm;
    }

    @Override
    public String toString() {
        return "Preke{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", kaina=" + kaina +
                '}';
    }
}
