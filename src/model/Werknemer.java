package model;

/**
 * @author Linda Vinke
 *
 * Uitwerking van opdracht
 *
 * Doel: Werknemer als subklasse van Persoon
 */
public class Werknemer extends Persoon {
    private static final double GRENSWAARDE_BONUS = 4500.00;
    private double maandsalaris;

    public Werknemer(String naam, String woonplaats, Afdeling afdeling, double maandsalaris) {
        super(naam, woonplaats, afdeling);
        this.setMaandsalaris(maandsalaris);
    }

    public Werknemer(String naam) {
        super(naam);
        this.setMaandsalaris(maandsalaris);
    }

    public Werknemer() { this(DEFAULTWAARDE_NAAM);
    }

    public boolean heeftRechtOpBonus(){ return maandsalaris >= GRENSWAARDE_BONUS;
    }

    @Override
    public double berekenJaarInkomen() {
        if (heeftRechtOpBonus()) {
            return 13 * maandsalaris;
        } else {
            return 12 * maandsalaris;
        }
    }

    @Override
    public String toString() {
        String rechtOpBonus;
        if (heeftRechtOpBonus()) {
            rechtOpBonus = " met recht op een bonus";
        } else {
            rechtOpBonus = " zonder recht op bonus";
        }
        return super.toString() + "en is een werknemer" + rechtOpBonus;
    }

    public void setMaandsalaris(double maandsalaris) throws IllegalArgumentException {
        if (maandsalaris <= 0) {
            throw new IllegalArgumentException("Het maandsalaris mag niet negatief zijn");
        }
        this.maandsalaris = maandsalaris;
    }
}




