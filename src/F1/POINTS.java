package F1;

import java.util.Arrays;

import static F1.DRIVER.scanner;

//In Bearbeitung von Kelschi
public class POINTS {
    static int pos1 = 25;
    static int pos2 = 18;
    static int pos3 = 15;
    static int pos4 = 12;
    static int pos5 = 10;
    static int pos6 = 8;
    static int pos7 = 6;
    static int pos8 = 4;
    static int pos9 = 2;
    static int pos10 = 1;
    static int posRest = 0;

    public static void punktevergabe(DRIVER[] driver){
        for (DRIVER value : driver) {
            System.out.println("Fahrer " + value.getFahrerNummer() + " (" + value.getFahrerName() + ") gib deine Platzierung ein:");
            int position = scanner.nextInt();

            switch (position) {
                case 1 -> {
                    int punkteErster = value.getFahrerPunkte() + pos1;
                    value.setFahrerPunkte(punkteErster);
                }
                case 2 -> {
                    int punkteZweiter = value.getFahrerPunkte() + pos2;
                    value.setFahrerPunkte(punkteZweiter);
                }
                case 3 -> {
                    int punkteDritter = value.getFahrerPunkte() + pos3;
                    value.setFahrerPunkte(punkteDritter);
                }
                case 4 -> {
                    int punkteVierter = value.getFahrerPunkte() + pos4;
                    value.setFahrerPunkte(punkteVierter);
                }
                case 5 -> {
                    int punkteFuenfter = value.getFahrerPunkte() + pos5;
                    value.setFahrerPunkte(punkteFuenfter);
                }
                case 6 -> {
                    int punkteSechster = value.getFahrerPunkte() + pos6;
                    value.setFahrerPunkte(punkteSechster);
                }
                case 7 -> {
                    int punkteSiebter = value.getFahrerPunkte() + pos7;
                    value.setFahrerPunkte(punkteSiebter);
                }
                case 8 -> {
                    int punkteAchter = value.getFahrerPunkte() + pos8;
                    value.setFahrerPunkte(punkteAchter);
                }
                case 9 -> {
                    int punkteNeunter = value.getFahrerPunkte() + pos9;
                    value.setFahrerPunkte(punkteNeunter);
                }
                case 10 -> {
                    int punkteZehnter = value.getFahrerPunkte() + pos10;
                    value.setFahrerPunkte(punkteZehnter);
                }
                default -> {
                    int punkteRest = value.getFahrerPunkte() + posRest;
                    value.setFahrerPunkte(punkteRest);
                }
            }

        }
        System.out.println("Die Punkte wurden erfolgreich aktualisiert!");
        System.out.println("----------------");

    }
    //Zitat Kevin: Darf ich mich mit mir Anal verbinden!? -> Antwort: Hooo jaaaa
    public static void ranking(DRIVER[] driver){
        System.out.println("Neuer Punktestand:");
        for (DRIVER value : driver) {
            System.out.println("   Fahrer " + value.getFahrerNummer() + " (" + value.getFahrerName() + ") | Punktestand: " + value.getFahrerPunkte());
        }
        System.out.println("----------------");
    }
}
