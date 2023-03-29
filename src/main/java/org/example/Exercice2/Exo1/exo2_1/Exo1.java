package org.example.Exercice2.Exo1.exo2_1;

import java.util.Scanner;

public class Exo1 {

    public static void getCategorie(){

        System.out.println("quel est l'age de l'enfant ?");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age<=7 && age>=6){
            System.out.println("Poussin");
        } else if (age>=8 && age<=9) {
            System.out.println("Pupille");
        } else if (age>=10 && age<=11) {
            System.out.println("Minime");
        } else if (age>=12) {
            System.out.println("Cadet");
        }
    }
}
