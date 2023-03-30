package org.example.Tri.TriSelection;

public class TriSelection {
    
    public static void triSelection(){
        int[] tab ={18,25,3,7,255,14,8,12,75,88};

        int plusPetit;
        int indexPlusPetit;
        int tmp;

        for (int i = 0; i < tab.length-1; i++) {
            plusPetit=tab[i];
            indexPlusPetit=i;
            for (int j = i; j < tab.length ; j++) {
                if(tab[j]<plusPetit){
                    plusPetit =tab[j];
                    indexPlusPetit = j;
                }
            }
            tmp=tab[i];
            tab[i]=plusPetit;
            tab[indexPlusPetit]=tmp;
        }

        for (int val: tab) {
            System.out.println(val);
        }
    }
}
