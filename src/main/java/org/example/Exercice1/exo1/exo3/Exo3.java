package org.example.Exercice1.exo1.exo3;

import java.util.Scanner;

public class Exo3 {
    public static void getPrixTTC (){

        System.out.println("Prix Hors Taxe :");
        Scanner sc = new Scanner(System.in);
        float prixHT = sc.nextFloat();

        System.out.println("Nombre d'articles : :");
        Scanner sc2 = new Scanner(System.in);
        int nbrArticle=sc2.nextInt();

        System.out.println("TVA :");
        Scanner sc3 = new Scanner(System.in);
        float TVA=sc3.nextFloat();

        System.out.println("le prix TTC est de " + (prixHT*(1+TVA))*nbrArticle);

    }
}
