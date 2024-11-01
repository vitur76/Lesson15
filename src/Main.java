//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Elefant elefant = new Elefant("Vasea", 100);
        elefant.adaugaAliment("frunze");
        elefant.adaugaAliment("iarbă");


        Lup lup = new Lup("Vova", 3);
        lup.adaugaAliment("carne");


        Leu leu = new Leu("Sss", 37);
        leu.adaugaAliment("carne");


        Jaguar jaguar = new Jaguar("Jag", 1);
        jaguar.adaugaAliment("carne");

        Jaguar jaguar2 = new Jaguar("Jag2", 3);
        jaguar2.adaugaAliment("varza");


        Zebra zebra = new Zebra("ZZZ", 54);
        zebra.adaugaAliment("iarbă");


        Zoo zoo = new Zoo();

        zoo.adaugaElefant(elefant);
        zoo.adaugaLup(lup);
        zoo.adaugaLeu(leu);
        zoo.adaugaJaguar(jaguar);
        zoo.adaugaJaguar(jaguar2);
        zoo.adaugaZebra(zebra);

        zoo.afiseazaToateAnimalele();

        System.out.println("Numărul total de animale: " + zoo.obtineNumarulTotalDeAnimale());

    }
}