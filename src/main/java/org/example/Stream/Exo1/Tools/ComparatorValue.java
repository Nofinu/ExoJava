package org.example.Stream.Exo1.Tools;

import org.example.Stream.Exo1.Classes.Transaction;

import java.util.Comparator;


public class ComparatorValue implements Comparator<Transaction> {
    @Override
    public int compare(Transaction o1, Transaction o2) {
        return o1.getValue() - o2.getValue();
    }
}
