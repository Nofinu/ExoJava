package org.example.ExercicesTableaux.Exo2;

public class Exo2 {

    public static void ordonee (){
        int[] tab ={1,2,3,4,5,6,8,9,10,11,12,13};
        boolean test = true;

        for (int i = 0; i < tab.length-1; i++) {
            if(!(tab[i]<tab[i+1])){
                test =false;
                break;
            }
        }

        if(test){
            System.out.println("la liste est ordonnée");
        }
        else {
            System.out.println("la liste n'est pas ordonnée");
        }
    }


}
