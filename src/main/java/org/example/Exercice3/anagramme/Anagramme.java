package org.example.Exercice3.anagramme;

import java.util.Scanner;

public class Anagramme {

    public static void startAnagramme(){
        Scanner s = new Scanner(System.in);
        System.out.println("entrer le 1er mot");
        String mot1 = s.next().toLowerCase();
        System.out.println("entrer le 2eme mot");
        String mot2 = s.next().toLowerCase();

        boolean test = Anagrammefunction(mot1,mot2);

        System.out.println("Les 2 mots " + (test ? "sont des anagrammes ":"ne sont pas des anagramme"));
    }
    public static boolean Anagrammefunction(String mot1,String mot2){
        boolean test = true;

        if(mot1.length() != mot2.length()){
            return test=false;
        }

        for (int i = 0; i <mot1.length() ; i++) {
            for (int j = 0; j < mot2.length(); j++) {
                if (mot1.charAt(i) == mot2.charAt(j)) {
                    mot2 = mot2.replace(mot2.charAt(j), ' ');
                    break;
                }
            }
        }

        for (int i = 0; i < mot2.length(); i++) {
            if(mot2.charAt(i) != ' '){
                test = false;
                break;
            }
        }

        return test;
    }
}
