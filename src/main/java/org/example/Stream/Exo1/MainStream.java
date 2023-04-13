package org.example.Stream.Exo1;

import org.example.Stream.Exo1.Classes.Trader;
import org.example.Stream.Exo1.Classes.Transaction;
import org.example.Stream.Exo1.Tools.ComparatorName;
import org.example.Stream.Exo1.Tools.ComparatorValue;

import java.util.*;
import java.util.stream.Collectors;

public class MainStream {

    public static void main() {
        Trader toto = new Trader("toto","Cambridge");
        Trader tata = new Trader("tata","Milan");
        Trader titi = new Trader("titi","Cambridge");
        Trader tutu = new Trader("tutu","Cambridge");

        List<Transaction> transactions = Arrays.asList(new Transaction(toto,2011,600),new Transaction(toto,2012,300),
                new Transaction(tata,2012,1000),new Transaction(tata,2011,500),
                new Transaction(titi,2012,710),new Transaction(titi,2012,700),
                new Transaction(tutu,2012,950),new Transaction(tutu,2022,900));

        //recuperation des transaction en 2011
        ComparatorValue valComp = new ComparatorValue();
        List<Transaction> transaction2011= transactions.stream()
                .filter(t ->t.getYear() == 2011)
                .sorted(valComp)
                .collect(Collectors.toList());

        System.out.println(transaction2011);


        //recuperation des ville des traders
        Set<String> villes = transactions.stream()
                .map(t -> t.getTrader().getCity()).collect(Collectors.toSet());

        System.out.println(villes);

        //recuperations des noms des traders
        Set<String> noms = transactions.stream()
                .map(t -> t.getTrader().getName()).sorted().collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(noms);

        //test si un trader est a Milan
        boolean testMilan = transactions.stream()
                .map(t -> t.getTrader().getCity()).anyMatch( c->(c == "Milan"));
        System.out.println(testMilan);

        //valeur de transaction la plus elevée
        Optional<Integer> valMax = transactions.stream()
                .map(t -> t.getValue()).max(Integer::compare);

        System.out.println(valMax.get());

        //trouver tout les trader de Cambridge
        ComparatorName compName = new ComparatorName();
        List<Trader> CambridgeTrader = transactions.stream()
                .map(t-> t.getTrader())
                .filter(t -> t.getCity().equals("Cambridge"))
                .sorted(compName)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(CambridgeTrader);

        //trouver tout les transaction des trader de cambridge
        List<Integer> valTransactionCambridge = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(t -> t.getValue()).collect(Collectors.toList());

        System.out.println(valTransactionCambridge);

        //valeur de transaction la moins elevée
        Optional<Integer> valMin = transactions.stream()
                .map(t -> t.getValue()).min(Integer::compare);

        System.out.println(valMin.get());

//        //trader qui on augmenter la valeur de leurs transactions
//
//        String traderName= "";
//        Integer traderValue= 0;
//
//        List<Trader> traderAugmente = transactions.stream()
//                .map(t->{
//                    traderName ="zea";
//                    if(t.getTrader().getName().equals(traderName)){
//                        if(t.getValue()> traderValue){
//                            return t.getTrader();
//                        }
//                    }
//                    else{
//                        traderName = t.getTrader().getName();
//                        traderValue =t.getValue();
//                    }
//                    return null;
//                }).collect(Collectors.toList());
//
//        System.out.println(traderAugmente);

    }
}
