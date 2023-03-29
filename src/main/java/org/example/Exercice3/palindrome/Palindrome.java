package org.example.Exercice3.palindrome;

import java.util.Scanner;

public class Palindrome {

    public static void startPalindrome (){
        System.out.println("entrer un mot :");
        Scanner s = new Scanner(System.in);
        String word = s.next().toLowerCase();

        boolean test = testPalindrome(word);

        System.out.printf("le mot %s "+ (test?"est un palindrome":"n'est pas un palindrome"),word);


    }

    public static boolean testPalindrome(String word){
        boolean test = true;
        for (int i = 0; i < Math.round(word.length()/2); i++) {
            if(word.charAt(i) != word.charAt(word.length()-(i+1))){
                test =false;
                break;
            }
        }
        return test;
    }
}
