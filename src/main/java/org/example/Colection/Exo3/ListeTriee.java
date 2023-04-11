package org.example.Colection.Exo3;

import org.example.Colection.Exo3.tools.MotComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListeTriee {

    private List<String> list = new ArrayList<>();

    public ListeTriee() {
    }

    public ListeTriee(List<String> list) {
        this.list = list;
    }



    public void setList(String mot) {
        this.list.add(mot);
        trie();
    }

    public void trie (){
        MotComparator comparator =new MotComparator();
        Collections.sort(this.list,comparator);
    }

    @Override
    public String toString() {
        return "list :" + list ;
    }
}
