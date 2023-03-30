package org.example.ExercicesTableaux.ExoTableau;

import java.util.Scanner;
import java.util.Random;

public class ExoTableaux {

    public static void StartArray() {
        Scanner s = new Scanner(System.in);
        System.out.println("nombre d'elements du tableau :");
        int nbrElem = s.nextInt();

        int[] tabRndm1 = generateRandomArray(nbrElem);
        extendArray(tabRndm1);
    }

    public static int[] generateRandomArray(int nbrElems) {
        System.out.println("1er tableau : ");
        int[] tabRndm = new int[nbrElems];
        Random rndm = new Random();

        for (int i = 0; i < nbrElems; i++) {
            tabRndm[i] = rndm.nextInt(100);
            System.out.println(tabRndm[i]);
        }
        return tabRndm;
    }

    public static int[] extendArray(int[] tab) {
        System.out.println(" ");
        System.out.println("2eme tableau :");
        int[] tabReturn = new int[tab.length * 2];

        for (int i = 0; i < tabReturn.length; i++) {
            if(i<tab.length){
                tabReturn[i]=tab[i];
            }
            else{
                tabReturn[i] = tab[i-tab.length] * 2;
            }
            System.out.println(tabReturn[i]);
        }

        return tabReturn;
    }
}
