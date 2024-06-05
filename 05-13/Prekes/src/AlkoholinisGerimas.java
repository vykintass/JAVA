public class AlkoholinisGerimas extends Preke{
    public AlkoholinisGerimas(String pavadinimas, double kaina) {
        super(pavadinimas, kaina);
    }

    public double PilnaKaina(int pvm) {
        return super.PilnaKaina(pvm);
    }

    @Override
    public int Pvm(int pvm) {

        return super.Pvm(pvm);
    }
}
