package model;

/**
 * @author Linda Vinke
 * <p>
 * Uitwerking van opdracht Bedrijf
 * <p>
 * Doel: vrijwilliger als subklasse van Persoon met de interface Oproepbaar
 */
public class Vrijwilliger extends Persoon implements Oproepbaar {
    private int urenGewerkt;

    public Vrijwilliger(String naam, String woonplaats, Afdeling afdeling) {
        super(naam, woonplaats, afdeling);
    }

    @Override
    public void huurIn(int uren) { urenGewerkt += uren;
    }

    @Override
    public double berekenJaarInkomen() {
        return 0;
    }

    public String toString() {
        return super.toString() + " en is een vrijwilliger";
    }
}
