package controller;

import model.Afdeling;
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

        Afdeling[] afdelingen = new Afdeling[4];
        afdelingen[0] = new Afdeling("Uitvoering", "Hilversum");
        afdelingen[1] = new Afdeling("Support", "Amsterdam");
        afdelingen[2] = new Afdeling("Management", "Almere");
        afdelingen[3] = new Afdeling("Documentatie", "Gouda");

        Persoon baas = new Persoon("Mark", "Den Haag", 10000, afdelingen[2]);
        Persoon medewerker = new Persoon("Caroline", "Delft", 4000, afdelingen[1]);
        Persoon assistent = new Persoon("Klaas");

        System.out.println("Het aantal personen in het bedrijf is " );
        System.out.printf("%s werkt in %s en woont in %s\n", baas.getNaam(),
                afdelingen[2].getAfdelingsPlaats(), baas.getWoonplaats());
        System.out.printf("%s werkt op de afdeling %s en verdient %.2f",
                medewerker.getNaam(), afdelingen[1].getAfdelingsNaam(), medewerker.getMaandSalaris());

    }

//        System.out.println(Persoon.aantalPersonen);
//        Persoon baas = new Persoon ("Mark", "Den Haag", 10000, new Afdeling());
//        System.out.println(Persoon.aantalPersonen);
//        System.out.println(baas.getPersoneelsNummer());
//
//        Persoon medewerker = new Persoon("Caroline", "Delft", 4000, new Afdeling());
//        System.out.println(Persoon.aantalPersonen);
//        System.out.println(medewerker.getPersoneelsNummer());
//
//        Persoon assistent = new Persoon("Klaas");
//        Persoon manager = new Persoon();
//        System.out.println(Persoon.aantalPersonen);
//
//        String uitvoerString = " ";
//
//        if (baas.heeftRechtOpBonus()){
//            uitvoerString = " en heeft wel recht op een bonus. \n";
//        } else {
//            uitvoerString = " en heeft geen recht op een bonus. \n";
//        }
//        System.out.printf("%s verdient %.2f" + uitvoerString, baas.getNaam(), baas.getMaandSalaris());
//
//        if (medewerker.heeftRechtOpBonus()){
//            uitvoerString = " en heeft wel recht op een bonus. \n";
//        } else {
//            uitvoerString = " en heeft geen recht op een bonus. \n";
//        }
//        System.out.printf("%s verdient %.2f" + uitvoerString, medewerker.getNaam(), medewerker.getMaandSalaris());
//    }
}
