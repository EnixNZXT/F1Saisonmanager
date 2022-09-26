package F1;

import java.util.Scanner;

import static F1.DRIVER.scanner;

//In Bearbeitung von Kelschi
public class POINTS {
    int pos1 = 25;
    int pos2 = 18;
    int pos3 = 15;
    int pos4 = 12;
    int pos5 = 10;
    int pos6 = 8;
    int pos7 = 6;
    int pos8 = 4;
    int pos9 = 2;
    int pos10 = 1;
    int posRest = 0;

    public void punktevergabe(DRIVER[] driver){
        for(int i = 0; i < driver.length; i++){
            System.out.println("Fahrer " + driver[i].getFahrerNummer() + " (" + driver[i].getFahrerName() + ") gib deine Platzierung ein:");
            int position = scanner.nextInt();
        }

    }
    //Zitat Kevin: Darf ich mich mit mir Anal verbinden!?
    public void ranking(){
    }
}
