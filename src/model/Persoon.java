package model;

/**
 * @author Linda Vinke
 *
 * Uitwerking van opdracht 1.1 Bedrijf (class)
 *
 * Doel: oefenen met OOP
 */
public class Persoon {
    public static int aantalPersonen = 0;
    public int personeelsNummer;
    public String naam;
    public String woonplaats;
    public double maandSalaris;

    public Persoon(String naam, String woonplaats, double maandsalaris) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.maandSalaris = maandsalaris;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this.naam = naam;
        this.woonplaats = "Onbekend";
        this.maandSalaris = 0;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon() {
        this.naam = "Onbekend";
        this.woonplaats = "Onbekend";
        this.maandSalaris = 0;
        this.personeelsNummer = ++aantalPersonen;
    }

    public double berekenJaarInkomen() {
        final double MAANDEN_PER_JAAR = 12;
        double jaarInkomen = maandSalaris * MAANDEN_PER_JAAR;
        return jaarInkomen;
    }
}
