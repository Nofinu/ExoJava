package org.example.Exercice1.exo1;

import java.util.Scanner;

public class Exo1 {
    public static void getCarre(){
        float nbr;
        System.out.println("entrer une valeur :");
        Scanner sc = new Scanner(System.in);
        nbr = sc.nextFloat();
        System.out.println("le carré de : "+nbr +" vaut : "+nbr*nbr);

    }
}
