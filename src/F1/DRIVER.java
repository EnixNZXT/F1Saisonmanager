package F1;

import java.util.Scanner;

//In Bearbeitung von Kelschi

public class DRIVER {
    static Scanner scanner = new Scanner(System.in);
    String fahrerName;
    static int fahrerPunkte;
    int fahrerNummer;


    //Konstruktor
    public DRIVER(String fahrerName, int fahrerPunkte, int fahrerNummer){
        this.fahrerName = fahrerName;
        DRIVER.fahrerPunkte = fahrerPunkte;
        this.fahrerNummer = fahrerNummer;
    }


    //Setter-Methoden
    public void setFahrerName(String fahrerName) {
        this.fahrerName = fahrerName;
    }

    public void setFahrerPunkte(int fahrerPunkte) {
        DRIVER.fahrerPunkte = fahrerPunkte;
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


    public static void fahrerErstellen(){
        System.out.println("Wie viele Fahrer sollen teilnehmen?");
        int anzahlFahrer = scanner.nextInt();

        DRIVER[] driver = new DRIVER[anzahlFahrer];
        anzahlFahrer = anzahlFahrer + 1;

        for(int i = 1; i < anzahlFahrer; i++){
            System.out.println("Name von Fahrer " + i + ":");
            String fahrerName = scanner.next();

            fahrerPunkte = 0;

            System.out.println("Fahrernummer von Fahrer " + i + ":");
            int fahrerNummer = scanner.nextInt();

            driver[i - 1] = new DRIVER(fahrerName, fahrerPunkte, fahrerNummer);

        }

    }

}
