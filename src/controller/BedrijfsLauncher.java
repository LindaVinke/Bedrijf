package controller;

import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
        File afdelingenBestand = new File("resources/Afdelingen.txt");
        ArrayList<Afdeling> afdelingen = new ArrayList<>();
        try {
            Scanner invoer = new Scanner(afdelingenBestand);
            while (invoer.hasNextLine()){
                String afdelingNaam = invoer.nextLine();
                String afdelingPlaats = invoer.nextLine();
                afdelingen.add(new Afdeling(afdelingNaam, afdelingPlaats));
            }
        } catch (FileNotFoundException nietGevonden) {
            System.out.println("Het bestand is niet gevonden.");
        }
        ArrayList<Persoon> personen = new ArrayList<>();
        File personenBestand = new File("resources/Personen.csv");
        try {
            Scanner invoer = new Scanner(personenBestand);
            while (invoer.hasNextLine()) {
                String[] regelArray = invoer.nextLine().split(",");
                String typePersoon = regelArray[0];
                String naam = regelArray[1];
                String woonplaats = regelArray[2];
                int indexArrayListAfdelingen = Integer.parseInt(regelArray[3]);
                double maandSalarisUurtariefNul = Double.parseDouble(regelArray[4]);
                switch (typePersoon) {
                    case "Werknemer":
                        personen.add(new Werknemer(naam, woonplaats, afdelingen.get(indexArrayListAfdelingen),
                                maandSalarisUurtariefNul));
                        break;
                    case "Zzper":
                        personen.add(new Zzper(naam, woonplaats, afdelingen.get(indexArrayListAfdelingen),
                                maandSalarisUurtariefNul));
                        break;
                    case "Vrijwilliger":
                        personen.add(new Vrijwilliger(naam, woonplaats, afdelingen.get(indexArrayListAfdelingen)));
                        break;
                }
            }
        }catch (FileNotFoundException nietGevonden) {
            System.out.println("Het bestand is niet gevonden.");
        }
        Collections.sort(personen);
        for (Persoon persoon : personen) {
            System.out.println(persoon);
        }

        File uitvoerBestand = new File("resources/PersonenPerAfdeling.txt");
        try {
            PrintWriter printWriter = new PrintWriter(uitvoerBestand);
            for (Afdeling afdeling: afdelingen) {
                printWriter.println("Afdeling: " + afdeling.getAfdelingsNaam());
                for (Persoon persoon: personen){
                    if (persoon.getAfdeling() == afdeling){
                        printWriter.println(("-- " + persoon));
                    }
                }
                printWriter.println();
            }
            printWriter.close();
        } catch (FileNotFoundException nietGemaakt) {
            System.out.println("Het bestand kan niet worden aangemaakt.");
        }


//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("Geef de naam: ");
//        String naam = keyboard.nextLine();
//        System.out.print("Geef de woonplaats: ");
//        String woonplaats = keyboard.nextLine();
//        System.out.print("Geef de naam van de afdeling: ");
//        String naamAfdeling = keyboard.nextLine();
//        System.out.print("Geef de plaats van de afdeling: ");
//        String plaatsAfdeling = keyboard.nextLine();
//        boolean maandsalarisIncorret = true;
//
//        while (maandsalarisIncorret){
//            System.out.print("Geef het maandsalaris: ");
//            double maandsalaris = keyboard.nextDouble();
//            try {
//                Werknemer werknemer = new Werknemer(naam, woonplaats,
//                        new Afdeling(naamAfdeling, plaatsAfdeling), maandsalaris);
//                System.out.print(werknemer);
//                maandsalarisIncorret = false;
//            } catch (IllegalArgumentException exception){
//                System.out.println(exception.getMessage());
//            } finally{
//                System.out.println("Je invoer is op de juiste wijze afgehandeld.");
//            }
//        }


    }


}

