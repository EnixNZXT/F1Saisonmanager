package F1;

import java.util.Scanner;

//In Bearbeitung von Kelschi

public class DRIVER {
    static Scanner scanner = new Scanner(System.in);
    String fahrerName;
    static int fahrerPunkte = 0;
    int fahrerNummer;


    //Konstruktor
    public DRIVER(String fahrerName, int fahrerNummer, int fahrerPunkte){
        this.fahrerName = fahrerName;
        this.fahrerNummer = fahrerNummer;
        this.fahrerPunkte = fahrerPunkte;
    }


    //Setter-Methoden
    public void setFahrerName(String fahrerName) {
        this.fahrerName = fahrerName;
    }

    public void setFahrerPunkte(int fahrerPunkte) {
        this.fahrerPunkte = fahrerPunkte;
    }

    public void setFahrerNummer(int fahrerNummer) {
        this.fahrerNummer = fahrerNummer;
    }


    //Getter_Methoden
    public String getFahrerName() {
        return fahrerName;
    }

    public int getFahrerPunkte() {
        return fahrerPunkte;
    }

    public int getFahrerNummer() {
        return fahrerNummer;
    }


    public static DRIVER[] fahrerErstellen(){
        System.out.println("Wie viele Fahrer sollen teilnehmen?");
        int anzahlFahrer = scanner.nextInt();

        DRIVER[] driver = new DRIVER[anzahlFahrer];

        for(int i = 0; i < anzahlFahrer; i++){
            System.out.println("Fahrername:");
            String fahrerName = scanner.next();

            System.out.println("Fahrernummer:");
            int fahrerNummer = scanner.nextInt();

            System.out.println("----------------\nFahrer wurde angelegt.\n----------------");

            driver[i] = new DRIVER(fahrerName, fahrerNummer, fahrerPunkte);

        }
        System.out.println("Folgende Fahrer wurden erstellt");

        for (DRIVER value : driver) {
            System.out.println("   Fahrer " + value.getFahrerNummer() + " (" + value.getFahrerName() + ") | Punktestand: " + value.getFahrerPunkte());
        }

        System.out.println("----------------");
        return driver;

    }

}
