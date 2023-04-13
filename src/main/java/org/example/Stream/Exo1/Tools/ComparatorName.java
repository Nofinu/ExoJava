package org.example.Stream.Exo1.Tools;

import org.example.Stream.Exo1.Classes.Trader;

import java.util.Comparator;

public class ComparatorName implements Comparator<Trader> {
    @Override
    public int compare(Trader o1, Trader o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
