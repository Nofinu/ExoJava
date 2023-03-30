package org.example.ExercicesTableaux.Exo1;

public class Exo1 {

    public static void nbrOccurrence(){
        int[] tab = {1,2,5,15,14,1,2,12,18,20,1,23,54};

        int value = 1;
        int cpt = 0;

        for (int val:tab) {
            if(val == value){
                cpt ++;
            }
        }
        System.out.println("la valeur : "+value+" a "+cpt+" occurrence dans la liste");
    }
}
