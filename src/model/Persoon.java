package model;

/**
 * @author Linda Vinke
 *
 * Uitwerking van opdracht 2.1 Bedrijf (class)
 *
 * Doel: oefenen met OOP
 */
public class Persoon {
    private static double GRENSWAARDE_BONUS = 4500.00;

    public static int aantalPersonen = 0;
    private int personeelsNummer;
    private String naam;
    private String woonplaats;
    private double maandSalaris;
    private Afdeling afdeling;

    public Persoon(String naam, String woonplaats, double maandsalaris, Afdeling afdeling) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.maandSalaris = maandsalaris;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {this(naam, "Onbekend", 0, new Afdeling()); }

    public Persoon() {this("Onbekend"); }

    public double berekenJaarInkomen() {
        final double MAANDEN_PER_JAAR = 12;
        double jaarInkomen = maandSalaris * MAANDEN_PER_JAAR;
        return jaarInkomen;
    }

    public boolean heeftRechtOpBonus(){ return  maandSalaris >= GRENSWAARDE_BONUS;
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

    public double getMaandSalaris() {
        return maandSalaris;
    }

    public Afdeling getAfdeling() {
        return afdeling;
    }

    public static int getAantalPersonen() {
        return aantalPersonen;
    }

}

