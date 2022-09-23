package F1;

import java.util.Scanner;

//In Bearbeitung von Kelschi

public class DRIVER {
    static Scanner scanner = new Scanner(System.in);
    int fahrerID;
    String fahrerVorname;
    String fahrerNachname;
    static int fahrerPunkte;
    int fahrerNummer;


    //Konstruktor
    public DRIVER(String fahrerVorname, String fahrerNachname, int fahrerPunkte, int fahrerNummer){
        this.fahrerID = fahrerID;
        this.fahrerVorname = fahrerVorname;
        this.fahrerNachname = fahrerNachname;
        this.fahrerPunkte = fahrerPunkte;
        this.fahrerNummer = fahrerNummer;
    }


    //Setter-Methoden
    public void setFahrerID(int fahrerID) {
        this.fahrerID = fahrerID;
    }

    public void setFahrerVorname(String fahrerVorname) {
        this.fahrerVorname = fahrerVorname;
    }

    public void setFahrerNachname(String fahrerNachname) {
        this.fahrerNachname = fahrerNachname;
    }

    public void setFahrerPunkte(int fahrerPunkte) {
        this.fahrerPunkte = fahrerPunkte;
    }

    public void setFahrerNummer(int fahrerNummer) {
        this.fahrerNummer = fahrerNummer;
    }


    //Getter_Methoden
    public int getFahrerID() {
        return fahrerID;
    }

    public String getFahrerVorname() {
        return fahrerVorname;
    }

    public String getFahrerNachname() {
        return fahrerNachname;
    }

    public int getFahrerPunkte() {
        return fahrerPunkte;
    }

    public int getFahrerNummer() {
        return fahrerNummer;
    }


    public static void fahrerErstellen(){
        System.out.println("Wie viele Fahrer sollen teilnehmen?");
        int anzahlFaher = scanner.nextInt();

        DRIVER[] driver = new DRIVER[anzahlFaher];
        anzahlFaher = anzahlFaher + 1;

        for(int i = 1; i < anzahlFaher; i++){
            System.out.println("Vorname von Fahrer " + i + ":");
            String vornameFahrer = scanner.next();
            System.out.println("Nachname von Fahrer " + i + ":");
            String nachnameFahrer = scanner.next();

            fahrerPunkte = 0;

            System.out.println("Fahrernummer von Fahrer " + i + ":");
            int fahrerNummer = scanner.nextInt();

            driver[i - 1] = new DRIVER(vornameFahrer, nachnameFahrer, fahrerPunkte, fahrerNummer);
        }
        System.out.println(java.util.Arrays.toString(driver));
   }

}
