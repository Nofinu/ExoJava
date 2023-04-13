package org.example.Stream.Exo1.Tools;

import org.example.Stream.Exo1.Classes.Transaction;

import java.util.Comparator;

public class ComparatorTransactionName implements Comparator<Transaction> {
    @Override
    public int compare(Transaction o1, Transaction o2) {
        return o1.getTrader().getName().compareTo(o2.getTrader().getName());
    }
}
