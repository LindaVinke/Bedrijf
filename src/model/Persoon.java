package model;

/**
 * @author Linda Vinke
 *
 * Uitwerking van opdracht Bedrijf
 *
 * Doel: beschrijving abstract class
 */
public abstract class Persoon implements Comparable<Persoon>{
    public static int aantalPersonen;
    protected final static String DEFAULTWAARDE_NAAM = "Onbekend";
    protected int personeelsNummer;
    protected String naam;
    protected String woonplaats;
    protected Afdeling afdeling;

    public Persoon(String naam, String woonplaats, Afdeling afdeling) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.afdeling = afdeling;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {this(naam, "Onbekend", new Afdeling()); }

    public Persoon() { this(DEFAULTWAARDE_NAAM); }

    public abstract double berekenJaarInkomen();

    @Override
    public int compareTo(Persoon anderPersoon){
        return this.naam.compareTo(anderPersoon.naam);
    }

    public String toString() {
        return naam + " woont in " + woonplaats + " en werkt op " + afdeling;
    }

    public int getPersoneelsNummer() {
        return personeelsNummer;
    }
    public String getNaam() {
        return naam;
    }
    public String getWoonplaats() {
        return woonplaats;
    }

    public Afdeling getAfdeling() {
        return afdeling;
    }

    public static int getAantalPersonen() {
        return aantalPersonen;
    }
}

