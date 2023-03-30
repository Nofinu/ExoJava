package org.example.Tri.TriBulles;

public class TriBulles {

    public static void triBulles (){
        int[] tab = {1,8,12,54,13,85,17,72,112,84,1,26};

        for (int i = tab.length; i >0 ; i--) {
            for (int j = 0; j < i-1; j++) {
                if(tab[j]>tab[j+1]){
                    int tmp = tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=tmp;
                }
            }
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }


}
