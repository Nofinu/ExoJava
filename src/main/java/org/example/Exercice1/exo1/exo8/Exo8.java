package org.example.Exercice1.exo1.exo8;

import java.util.Scanner;

public class Exo8 {
    public static void TestEntry(){

        int nbr;

        do {
            System.out.println("entrer une valeur entre 1 et 3 :");
            Scanner sc = new Scanner(System.in);
            nbr = sc.nextInt();
        }while (nbr<1 || nbr>3);

    }
}
