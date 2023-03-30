package org.example.Matrice.Exo3;

public class Exo3 {

    public static void voiture(){
        String[][] tab = {{"voiture1","toto"},{"voiture4","titi"},{"voiture2","toto"},{"voiture3","titi"},{"voiture8","tata"}};
        int[] vendeurs = {0,0,0};

        for (String[] vente :tab) {
            if(vente[1] == "toto"){
                vendeurs[0]++;
            }
            if(vente[1] == "titi"){
                vendeurs[1]++;
            }
            if(vente[1] == "tata"){
                vendeurs[2]++;
            }
        }
        System.out.println("toto a vendu "+ vendeurs[0] +" voiture");
        System.out.println("titi a vendu "+ vendeurs[1] +" voiture");
        System.out.println("tata a vendu "+ vendeurs[2] +" voiture");

    }
}
