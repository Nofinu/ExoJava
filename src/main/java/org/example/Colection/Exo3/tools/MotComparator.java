package org.example.Colection.Exo3.tools;

import org.example.Colection.Exo3.ListeTriee;

import java.util.Comparator;

public class MotComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

}
