package controller;

import model.Persoon;

/**
 * @author Linda Vinke
 *
 * Uitwerking van opdracht 1.1 Bedrijf (launcher)
 *
 * Doel: oefenen met OOP
 */
public class BedrijfsLauncher {

    public static void main(String[] args) {

        System.out.println(Persoon.aantalPersonen);
        Persoon baas = new Persoon ("Mark", "Den Haag", 10000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(baas.personeelsNummer);

        Persoon medewerker = new Persoon("Caroline", "Delft", 4000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(medewerker.personeelsNummer);

        Persoon assistent = new Persoon("Klaas");
        Persoon manager = new Persoon();
        System.out.println(Persoon.aantalPersonen);
        System.out.printf("%s verdient %.2f per jaar\n", baas.naam, baas.berekenJaarInkomen());
        System.out.printf("%s woont in %s\n", assistent.naam, assistent.woonplaats);
    }
}
