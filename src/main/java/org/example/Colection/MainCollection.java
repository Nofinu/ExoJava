package org.example.Colection;

import org.example.Colection.Exo1.CollectionFirst;
import org.example.Colection.Exo2.TriCercle;
import org.example.Colection.Exo3.ListeTriee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainCollection {

    public static void main(){
        //CollectionFirst.main();
        //TriCercle.main();

        List<String> list = new ArrayList<>(Arrays.asList("un","deux","trois","quatre"));
        ListeTriee listeTrie = new ListeTriee(list);

        listeTrie.trie();

        String entry="";
        Scanner s= new Scanner(System.in);

        while(!entry.equals("0")){
            System.out.println("entrer un mot :");
            entry = s.next();
            if(!entry.equals("0")){
                listeTrie.setList(entry);
                System.out.println(listeTrie);
            }
        }

        System.out.println(listeTrie);
    }
}
