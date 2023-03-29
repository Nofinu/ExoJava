package org.example.Exercice3.compteurOccurence;

public class CompteurOccurence {
    public static void nbrOccurence(){
        String word = "untreslongmotsavecpleinsdelettre";
        int cpt = 0;
        char letter = 'e';

        for (int i = 0; i < word.length() ; i++) {
            if(word.charAt(i) == letter) {
                cpt++;
            }
        }

        System.out.printf("la lettre %s se repette %d fois",letter,cpt);
    }
}
