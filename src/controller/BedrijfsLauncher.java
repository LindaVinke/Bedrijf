package controller;

import model.Afdeling;
import model.Persoon;
import model.Werknemer;
import model.Zzper;

/**
 * @author Linda Vinke
 *
 * Uitwerking van opdracht Bedrijf
 *
 * Doel: launcher van Bedrijf
 */
public class BedrijfsLauncher {

    public static void main(String[] args) {
        Afdeling[] afdelingen = new Afdeling[4];
        afdelingen[0] = new Afdeling("Uitvoering", "Hilversum");
        afdelingen[1] = new Afdeling("Support", "Amsterdam");
        afdelingen[2] = new Afdeling("Management", "Almere");
        afdelingen[3] = new Afdeling("Documentatie", "Gouda");

        Werknemer baas = new Werknemer("Mark", "Den Haag",afdelingen[2], 10000);
        Werknemer medewerker = new Werknemer("Caroline", "Delft", afdelingen[1], 4000);
        Zzper assistent = new Zzper("Klaas", "Diemen", afdelingen[3], 50.00);
        Zzper projectleider = new Zzper("Ronald", "Zaandam", afdelingen[0], 80.00);
        assistent.huurIn(160);
        projectleider.huurIn(320);

        Persoon[] personen = new Persoon[4];
        personen[0] = baas;
        personen[1] = medewerker;
        personen[2] = assistent;
        personen[3] = projectleider;

        for (int personenTeller = 0; personenTeller < personen.length; personenTeller++) {
            toonJaarInkomen(personen[personenTeller]);
        }

//        System.out.println("Het aantal personen in het bedrijf is " + Persoon.aantalPersonen);
//        System.out.println(baas);
//        System.out.println(medewerker);
//        System.out.println(assistent);
//        System.out.printf("%s verdient %.2f per jaar\n", baas.getNaam(), baas.berekenJaarInkomen());
//        System.out.printf("%s verdient %.2f per jaar\n", medewerker.getNaam(), medewerker.berekenJaarInkomen());
//        System.out.printf("%s verdient %.2f per jaar\n", assistent.getNaam(), assistent.berekenJaarInkomen());
    }

    public static void toonJaarInkomen(Persoon persoon){
        System.out.println(persoon.getNaam() + " verdient " + persoon.berekenJaarInkomen() + " per jaar");
    }



//        Persoon baas = new Persoon("Mark", "Den Haag", 10000, afdelingen[2]);
//        Persoon medewerker = new Persoon("Caroline", "Delft", 4000, afdelingen[1]);
//        Persoon assistent = new Persoon("Klaas");
//
//        System.out.println("Het aantal personen in het bedrijf is " + Persoon.aantalPersonen);
//        System.out.printf("%s werkt in %s en woont in %s\n",
//                baas.getNaam(),
//                baas.getAfdeling().getAfdelingsPlaats(),
//                baas.getWoonplaats());
//        System.out.printf("%s werkt op de afdeling %s en verdient %.2f\n",
//                medewerker.getNaam(),
//                medewerker.getAfdeling().getAfdelingsNaam(),
//                medewerker.getMaandSalaris());
//        System.out.printf("%s werkt op de afdeling %s en woont in %s",
//                assistent.getNaam(),
//                assistent.getAfdeling().getAfdelingsNaam(),
//                assistent.getWoonplaats());
//    }

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
