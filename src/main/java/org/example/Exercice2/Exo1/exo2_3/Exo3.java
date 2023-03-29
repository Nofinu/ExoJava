package org.example.Exercice2.Exo1.exo2_3;

import java.util.Scanner;

public class Exo3 {

    public static void prixPhotocopies() {
        System.out.println("Nombre de photocopies");
        Scanner sc = new Scanner(System.in);
        int nbrPhoto = sc.nextInt();

        if (nbrPhoto < 10) {
            System.out.println("le prix pour " + nbrPhoto + " photocopies est de : " + (nbrPhoto * 0.15));
        } else if (nbrPhoto < 20) {
            System.out.println("le prix pour " + nbrPhoto + " photocopies est de : " + (nbrPhoto * 0.10));
        } else {
            System.out.println("le prix pour " + nbrPhoto + " photocopies est de : " + (nbrPhoto * 0.05));
        }
    }
}
