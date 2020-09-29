package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Linda Vinke
 *
 * Uitwerking van opdracht Bedrijf
 *
 * Doel: launcher van Bedrijf
 */
public class BedrijfsLauncher {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef de naam: ");
        String naam = keyboard.nextLine();
        System.out.print("Geef de woonplaats: ");
        String woonplaats = keyboard.nextLine();
        System.out.print("Geef de naam van de afdeling: ");
        String naamAfdeling = keyboard.nextLine();
        System.out.print("Geef de plaats van de afdeling: ");
        String plaatsAfdeling = keyboard.nextLine();
        boolean maandsalarisIncorret = true;

        while (maandsalarisIncorret){
            System.out.print("Geef het maandsalaris: ");
            double maandsalaris = keyboard.nextDouble();
            try {
                Werknemer werknemer = new Werknemer(naam, woonplaats,
                        new Afdeling(naamAfdeling, plaatsAfdeling), maandsalaris);
                System.out.print(werknemer);
                maandsalarisIncorret = false;
            } catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            } finally{
                System.out.println("Je invoer is op de juiste wijze afgehandeld.");
            }
        }









//
//        Afdeling[] afdelingen = new Afdeling[4];
//        afdelingen[0] = new Afdeling("Uitvoering", "Hilversum");
//        afdelingen[1] = new Afdeling("Support", "Amsterdam");
//        afdelingen[2] = new Afdeling("Management", "Almere");
//        afdelingen[3] = new Afdeling("Documentatie", "Gouda");
//
////        Werknemer baas = new Werknemer("Mark", "Den Haag",afdelingen[2], 10000);
////        Werknemer medewerker = new Werknemer("Caroline", "Delft", afdelingen[1], 4000);
////        Zzper assistent = new Zzper("Klaas", "Diemen", afdelingen[3], 50.00);
////        Zzper projectleider = new Zzper("Ronald", "Zaandam", afdelingen[0], 80.00);
////        assistent.huurIn(160);
////        projectleider.huurIn(320);
////
////        Persoon[] personen = new Persoon[4];
////        personen[0] = baas;
////        personen[1] = medewerker;
////        personen[2] = assistent;
////        personen[3] = projectleider;
//
//        ArrayList<Persoon> personen = new ArrayList<>();
//        personen.add(new Werknemer("Mark", "Den Haag", afdelingen[2], 10000));
//        personen.add(new Werknemer("Angelique", "Rotterdam", afdelingen[2], 5000));
//        personen.add(new Werknemer("Caroline", "Delft", afdelingen[1], 4000));
//        personen.add(new Zzper("Klaas", "Diemen", afdelingen[3], 50.00));
//        personen.add(new Zzper("Ronald", "Zaandam", afdelingen[0], 80.00));
//        personen.add(new Zzper("Jannie", "Utrecht", afdelingen[0], 60.00));
//        personen.add(new Zzper("Anne", "Zwolle", afdelingen[0], 40.00));
//        personen.add(new Vrijwilliger("Ambi", "Amsterdam", afdelingen[0]));
//        personen.add(new Vrijwilliger("Naledi", "Gaborone", afdelingen[1]));
//        personen.add(new Vrijwilliger("Ceren", "Istanboel", afdelingen[2]));
//        personen.add(new Vrijwilliger("Haining", "Shaoxing", afdelingen[3]));
//
//            for (Persoon persoon : personen) {
//                if (persoon instanceof Zzper) {
//                    ((Zzper) persoon).huurIn(320);
//                }
//                if (persoon instanceof Vrijwilliger) {
//                    ((Vrijwilliger) persoon).huurIn(160);
//                }
//            }
//        Collections.sort(personen);
//        for (Persoon persoon : personen) {
//            System.out.println(persoon);
//            toonJaarInkomen(persoon);
//        }
//
//        }
//
//    public static void toonJaarInkomen (Persoon persoon){
//            System.out.println(persoon.getNaam() + " verdient " + persoon.berekenJaarInkomen() + " per jaar");
//        }
////
////        for (int personenTeller = 0; personenTeller < personen.length; personenTeller++) {
////            toonJaarInkomen(personen[personenTeller]);
////        }

    }


}

