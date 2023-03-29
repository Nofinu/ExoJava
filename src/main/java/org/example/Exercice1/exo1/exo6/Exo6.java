package org.example.Exercice1.exo1.exo6;

import java.util.Scanner;

public class Exo6 {
    public static void getOrdreAlphabetique() {
        String[] nameArray = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("entrer un nom :");
            Scanner sc = new Scanner(System.in);
            nameArray[i] = sc.next().toLowerCase();
        }

        boolean test = testOrder(nameArray);

        if (test) {
            System.out.println("les noms sont dans l'ordre alphabetique");
        } else {
            System.out.println("les noms ne sont pas dans l'ordre alphabetique");
        }

         /*   if(nameArray[0].charAt(0)<nameArray[1].charAt(0) && nameArray[1].charAt(0)<nameArray[2].charAt(0)){
            System.out.println("les noms sont dans l'ordre alphabetique");
        }
        else{
            System.out.println("les noms ne sont pas dans l'ordre alphabetique");
        }
        */
    }

    public static boolean testOrder(String[] table) {

        boolean test = true;

        for (int i = 0; i < table.length - 2; i++) {
            int wordLength;

            if(table[i].length() < table[i+1].length()){
                wordLength = table[i].length();
            }else{
                wordLength = table[i+1].length();
            }

            for (int j = 0; j < wordLength; j++) {
                if (table[i].charAt(j) > table[i + 1].charAt(j)) {
                    test = false;
                    break;
                }
            }
            if(!test){
                break;
            }
        }
        return test;
    }
}
