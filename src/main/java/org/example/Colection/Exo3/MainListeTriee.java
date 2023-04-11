package org.example.Colection.Exo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainListeTriee {
    public static void main(){
        List<String> list = new ArrayList<>(Arrays.asList("un","deux","trois","quatre"));
        ListeTriee listeTrie = new ListeTriee(list);

        listeTrie.trie();

        String entry="";
        Scanner s= new Scanner(System.in);

        while(!entry.equals("0")){
            System.out.println("entrer un mot ou 0 pour quitter :");
            entry = s.next();
            if(!entry.equals("0")){
                listeTrie.setList(entry);
                System.out.println(listeTrie);
            }
        }

        System.out.println(listeTrie);
    }
}
