package org.example.Exercice2.Exo1.exo2_9;

import java.util.Scanner;

public class Exo9 {

    public static void mutiplicationTable (){
        System.out.println("Entrer un nombre :");
        Scanner sc = new Scanner(System.in);
        int nbr = sc.nextInt();

        for (int i = 1; i <=10 ; i++) {
            System.out.println(nbr+" x "+i+" = "+nbr*i);
        }
    }
}
