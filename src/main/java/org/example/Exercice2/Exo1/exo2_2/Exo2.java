package org.example.Exercice2.Exo1.exo2_2;

import java.util.Scanner;

public class Exo2 {
    public static void getDivisibleBy3 (){
        System.out.println("entrer une valeur :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number%3 == 0){
            System.out.println("divisible par 3");
        }
        else{
            System.out.println("pas divisible par 3");
        }
    }
}
