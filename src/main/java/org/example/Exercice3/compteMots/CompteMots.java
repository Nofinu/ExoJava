package org.example.Exercice3.compteMots;

import java.util.Arrays;

public class CompteMots {

    public static void CompteurDeMots(){
        String phrase = "je suis une phrase qui comporte des mots";

        String[] tabPhrase = phrase.split(" ");
        System.out.println("la phrase contient "+tabPhrase.length + " mots");
    }
}
