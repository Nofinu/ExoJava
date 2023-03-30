package org.example.Exercice3.pyramide;

public class Pyramide {

    public static void  pyramide (){
        int number = 5;
        int cpt =1;

        for (int i = 1; i < number*2; i++) {
            for (int j = 0; j < cpt; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
            if(i<number){
                cpt++;
            }
            else{
                cpt--;
            }

        }
    }
}
