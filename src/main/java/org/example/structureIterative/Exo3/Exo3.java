package org.example.structureIterative.Exo3;

public class Exo3 {

    public static void Decalage() {
        char[] tab = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};
        char first = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (i == tab.length - 1) {
                tab[i] = first;
            } else {
                tab[i] = tab[i + 1];
            }
        }
        System.out.println(tab);
    }
}
