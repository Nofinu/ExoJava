package org.example.Colection.Exo1;

import com.sun.source.doctree.InlineTagTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionFirst {

    public static void main() {
        List<Integer> tab = new ArrayList<>(Arrays.asList(1,2,3,4,5,-6,7,8,-9,10));
        //affichageNaturel(tab);
        //affichageInverse(tab);
        //affichagePair(tab);
        miseZero(tab);


    }


    public static void affichageNaturel (List<Integer> tab){
        System.out.println("--------fori---------");
        for (int i = 0; i < tab.size(); i++) {
            System.out.println(tab.get(i));
        }

        System.out.println("--------foreach---------");
        for (Integer i:tab) {
            System.out.println(i);
        }

        System.out.println("--------iterator---------");
        Iterator ite = tab.listIterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }

        System.out.println("--------DoWhile---------");
        int i =0;
        do {
            System.out.println(tab.get(i++));
        }while (i<tab.size());
    }

    public static void affichageInverse (List<Integer> tab){
        System.out.println("-----------fori---------");
        for (int i = tab.size(); i>0; i--) {
            System.out.println(i);

        }

        System.out.println("-------------while----------");
        int i = tab.size()-1;
        while (i>=0){
            System.out.println(tab.get(i--));
        }
    }

    public static void affichagePair (List<Integer> tab){
        System.out.println("-----------fori---------");
        for (int i = 0; i < tab.size(); i+=2) {
            System.out.println(tab.get(i));
        }

        System.out.println("-------------while----------");
        int i = 0;
        while (i<tab.size()){
            System.out.println(tab.get(i));
            i+=2;
        }
    }

    public static void miseZero (List<Integer> tab){
        System.out.println("-----------fori---------");
        for (int i = 0; i < tab.size(); i++) {
            if(tab.get(i)<0){
                tab.set(i,0);
            }
            System.out.println(tab.get(i));
        }

        System.out.println("--------iterattor---------");
        Iterator ite = tab.listIterator();
        while (ite.hasNext()){
            Integer val = (Integer) ite.next();
            if(val <0){
                tab.set(tab.indexOf(val),0);
            }
            System.out.println(val);
        }
    }
}


