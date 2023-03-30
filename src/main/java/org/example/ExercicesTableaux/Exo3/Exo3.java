package org.example.ExercicesTableaux.Exo3;

public class Exo3 {
    public static void  inverseList (){
        int[] tab = {1,2,3,4,5,6,7,8,9};
        int tmp;
        for (int i = 0; i < tab.length/2; i++) {
            tmp = tab[i];
            tab[i]=tab[tab.length-(i+1)];
            tab[tab.length-(i+1)]=tmp;
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
