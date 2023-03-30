package org.example.structureIterative.Exo1;

import java.util.Scanner;

public class Exo1 {

    public static void Caisse() {

        Scanner s = new Scanner(System.in);
        int entry = -1;
        int totalPrix = 0;
        while (entry != 0) {
            System.out.println("scanner un article : (presser 0 pour terminer)");
            entry = s.nextInt();
            totalPrix += entry;
        }

        System.out.println("vous devez payer : " + totalPrix);

        entry = 0;
        while (entry < totalPrix) {
            System.out.println("combien paye le client :");
            entry = s.nextInt();
        }

        int totalRendre = entry - totalPrix;
        System.out.println("la caise dois rendre : " + totalRendre + "€");
        int E10 = totalRendre / 10;
        totalRendre %= 10;
        int E5 = totalRendre / 5;
        totalRendre %= 5;
        int E1 = totalRendre;

        System.out.printf("la caisse rends %d billet de 10€, %d billet de 5€ et %d piece(s) de 1€", E10, E5, E1);


    }
}
