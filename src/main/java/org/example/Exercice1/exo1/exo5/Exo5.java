package org.example.Exercice1.exo1.exo5;

import java.util.Scanner;

public class Exo5 {

    public static void getSignOfProduct(){

        System.out.println("entrer la 1er valeur");
        Scanner sc = new Scanner(System.in);
        float nbr1 = sc.nextFloat();

        System.out.println("entrer la 2eme valeur");
        Scanner sc2 = new Scanner(System.in);
        float nbr2 = sc2.nextFloat();

        if(nbr1<0){
            if (nbr2 < 0) {
                System.out.println("Produit Positif");
            }
            else {
                System.out.println("Produit négatif");
            }
        }
        else{
            if(nbr2<0){
                System.out.println("Produit Négatif");
            }
            else{
                System.out.println("Produit Positif");
            }
        }
    }


}
