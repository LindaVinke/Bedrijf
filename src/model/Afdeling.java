package model;

/**
 * @author Linda Vinke
 * <p>
 * Uitwerking van opdracht Bedrijf
 * <p>
 * Doel: afdeling toevoegen
 */
public class Afdeling {
    private String afdelingsNaam;
    private String afdelingsPlaats;

    public Afdeling(String afdelingsNaam, String afdelingsPlaats) {
        this.afdelingsNaam = afdelingsNaam;
        this.afdelingsPlaats = afdelingsPlaats;
    }
    public Afdeling(){this("Onbekend", "Onbekend");
    }

    public String toString(){
        return "afdeling " + afdelingsNaam + "te " + afdelingsPlaats;
    }

    public String getAfdelingsNaam() {
        return afdelingsNaam;
    }

    public String getAfdelingsPlaats() {
        return afdelingsPlaats;
    }
}
