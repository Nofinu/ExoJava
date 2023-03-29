package org.example.Exercice1.exo1.exo2;

import java.util.Scanner;

public class Exo2 {
    public static void getExo2() {

        System.out.println("Quel est votre nom :");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Bonjour " + name);
    }
}
