package controller;

import model.Persoon;

/**
 * @author Linda Vinke
 *
 * Uitwerking van opdracht 2.1 Bedrijf (launcher)
 *
 * Doel: oefenen met OOP
 */
public class BedrijfsLauncher {

    public static void main(String[] args) {

        System.out.println(Persoon.aantalPersonen);
        Persoon baas = new Persoon ("Mark", "Den Haag", 10000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(baas.getPersoneelsNummer());

        Persoon medewerker = new Persoon("Caroline", "Delft", 4000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(medewerker.getPersoneelsNummer());

        Persoon assistent = new Persoon("Klaas");
        Persoon manager = new Persoon();
        System.out.println(Persoon.aantalPersonen);

        String uitvoerString = " ";

        if (baas.heeftRechtOpBonus()){
            uitvoerString = " en heeft wel recht op een bonus. \n";
        } else {
            uitvoerString = " en heeft geen recht op een bonus. \n";
        }
        System.out.printf("%s verdient %.2f" + uitvoerString, baas.getNaam(), baas.getMaandSalaris());

        if (medewerker.heeftRechtOpBonus()){
            uitvoerString = " en heeft wel recht op een bonus. \n";
        } else {
            uitvoerString = " en heeft geen recht op een bonus. \n";
        }
        System.out.printf("%s verdient %.2f" + uitvoerString, medewerker.getNaam(), medewerker.getMaandSalaris());
    }
}
