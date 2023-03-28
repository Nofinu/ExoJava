package org.example.exo4;

import java.util.Scanner;

public class Exo4 {

    public static void getSign(){
        float nbr;
        System.out.println("entrer une valeur :");
        Scanner sc = new Scanner(System.in);
        nbr = sc.nextFloat();

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
