package org.example.Exercice2.Exo1.exo2_10;

import java.util.Scanner;

public class Exo10 {
    //calcul de la factorielle
    public static void Factorielle (){
        System.out.println("Entrer un nombre :");
        Scanner sc = new Scanner(System.in);
        int nbr = sc.nextInt();

        int somme = Facto(0,nbr);
        System.out.println("la factorielle de "+nbr+" vaut : "+somme);
    }

    public static int Facto (int nbr,int finalValue){
        int Factonbr = ++nbr ;
        int returnSomme=1;
        if(Factonbr<finalValue){
            returnSomme = Facto(Factonbr,finalValue);
        }
        returnSomme *= Factonbr;

        return returnSomme;
    }


    //calcul de la somme
    public static void CalculSomme (){
        System.out.println("Entrer un nombre :");
        Scanner sc = new Scanner(System.in);
        int nbr = sc.nextInt();

        int somme = Somme(0,nbr);
        System.out.println("la Somme de toute les valeur de 1 à "+nbr+" vaut : "+somme);
    }

    public static int Somme (int nbr,int finalValue){
        int Factonbr = ++nbr ;
        int returnSomme=1;
        if(Factonbr<finalValue){
            returnSomme = Somme(Factonbr,finalValue);
        }
        returnSomme += Factonbr;

        return returnSomme;
    }
}
