
import java.util.ArrayList;
import java.util.List;

public class Animal {
    protected String nume;
    protected int varsta;
    protected List<String> alimente;

    public Animal(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        this.alimente = new ArrayList<>();
    }

    public void adaugaAliment(String aliment) {
        alimente.add(aliment);
    }

    public void afiseazaDetalii() {
        System.out.println("Nume: " + nume);
        System.out.println("Vârsta: " + varsta + " ani");
        System.out.println("Alimente: " + String.join(", ", alimente));
    }
}