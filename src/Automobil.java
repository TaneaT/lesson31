import java.util.Objects;

public class Automobil implements Comparable<Automobil>{

    int anProducere;

    String denumire;

    public Automobil(String denumire, int anProducere){
        this.denumire = denumire;
        this.anProducere = anProducere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobil automobil = (Automobil) o;
        return anProducere == automobil.anProducere && Objects.equals(denumire, automobil.denumire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anProducere);
    }

    @Override
    public int compareTo(Automobil o) {
        if (anProducere < o.anProducere){
            return -1;
        }
        if (anProducere > o.anProducere){
        return 1;
        }

        return  0;
    }

    @Override
    public String toString() {
        return "anProducere=" + anProducere +
                ", denumire=" + denumire ;
    }


    public int getAnProducere() {
        return anProducere;
    }

    public String getDenumire() {
        return denumire;
    }
}
