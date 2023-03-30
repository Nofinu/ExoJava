package org.example.structureIterative.Exo2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exo2 {

    public static void NoteClasse() {

        Scanner s = new Scanner(System.in);
        System.out.println("nombre de note a rentrer :");
        int nbrnote = s.nextInt();

        float[] tabNote = new float[nbrnote];

        for (int i = 0; i < nbrnote; i++) {
            System.out.println("entrer la note n° " + i);
            tabNote[i] = s.nextFloat();
        }

        float noteMax = 0F;
        float noteMin = 20F;
        float Moyen = 0F;

        for (int i = 0; i < tabNote.length; i++) {
            if (tabNote[i] < noteMin) {
                noteMin = tabNote[i];
            }
            if (tabNote[i] > noteMax) {
                noteMax = tabNote[i];
            }
            Moyen += tabNote[i];
        }

        Moyen /= nbrnote;

        DecimalFormat df = new DecimalFormat("##.##");

        System.out.println("la note la plus basse est : " + noteMin);
        System.out.println("la note la plus haute est : " + noteMax);
        System.out.println("la moyenne est de : " + df.format(Moyen));


    }
}
