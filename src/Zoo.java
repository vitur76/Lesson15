import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Elefant> elefanti;
    private List<Lup> lupi;
    private List<Leu> lei;
    private List<Jaguar> jaguari;
    private List<Zebra> zebre;

    public Zoo() {
        this.elefanti = new ArrayList<>();
        this.lupi = new ArrayList<>();
        this.lei = new ArrayList<>();
        this.jaguari = new ArrayList<>();
        this.zebre = new ArrayList<>();
    }

    public void adaugaElefant(Elefant elefant) {
        elefanti.add(elefant);
    }

    public void adaugaLup(Lup lup) {
        lupi.add(lup);
    }

    public void adaugaLeu(Leu leu) {
        lei.add(leu);
    }

    public void adaugaJaguar(Jaguar jaguar) {
        jaguari.add(jaguar);
    }

    public void adaugaZebra(Zebra zebra) {
        zebre.add(zebra);
    }

    public void afiseazaToateAnimalele() {
        System.out.println("Elefanți:");
        for (Elefant elefant : elefanti) {
            elefant.afiseazaDetalii();
        }

        System.out.println("Lupi:");
        for (Lup lup : lupi) {
            lup.afiseazaDetalii();
        }

        System.out.println("Lei:");
        for (Leu leu : lei) {
            leu.afiseazaDetalii();
        }

        System.out.println("Jaguari:");
        for (Jaguar jaguar : jaguari) {
            jaguar.afiseazaDetalii();
        }

        System.out.println("Zebre:");
        for (Zebra zebra : zebre) {
            zebra.afiseazaDetalii();
        }
    }


    public int obtineNumarulTotalDeAnimale() {
        return elefanti.size() + lupi.size() + lei.size() + jaguari.size() + zebre.size();
    }


}
