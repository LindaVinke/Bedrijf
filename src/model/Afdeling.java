package model;

/**
 * @author Linda Vinke
 * <p>
 * Uitwerking van opdracht 3.1 (dagdeel 3)
 * <p>
 * Doel:
 */
public class Afdeling {
    private String afdelingsNaam;
    private String afdelingsPlaats;

    public Afdeling(String afdelingsNaam, String afdelingsPlaats) {
        this.afdelingsNaam = afdelingsNaam;
        this.afdelingsPlaats = afdelingsPlaats;
    }
    public Afdeling(){this("Onbekend", "Onbekend");}

    public String getAfdelingsNaam() {
        return afdelingsNaam;
    }

    public String getAfdelingsPlaats() {
        return afdelingsPlaats;
    }
}
