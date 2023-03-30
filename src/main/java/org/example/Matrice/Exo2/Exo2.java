package org.example.Matrice.Exo2;

import java.util.Arrays;

public class Exo2 {
    public static void Matrice2 (){
        int[][] matrice = new int[4][5];
        int cpt =1;
        int somme=0;
        float mean;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <5 ; j++) {
                matrice[i][j]=cpt++;
            }
        }

        for (int[] arr:matrice) {
            System.out.println(Arrays.toString(arr));
        }

        for (int[] arr:matrice) {
            for (int val : arr) {
                somme += val;
            }
        }
        System.out.println("somme :"+somme);
        mean = somme/(cpt-1);
        System.out.println("Moyenne :"+mean);
    }

}
