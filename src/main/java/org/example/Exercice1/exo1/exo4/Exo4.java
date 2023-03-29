package org.example.Exercice1.exo1.exo4;

import java.util.Scanner;

public class Exo4 {

    public static void getSign(){

        System.out.println("entrer une valeur :");
        Scanner sc = new Scanner(System.in);
        float nbr = sc.nextFloat();

        if (nbr <0){
            System.out.println("la valeur est négative");
        }
        else if (nbr == 0) {
            System.out.println("la valeur est egale a 0");
        }
        else{
            System.out.println("la valeur est positive");
        }
    }

}
