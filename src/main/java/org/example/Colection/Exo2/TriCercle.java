package org.example.Colection.Exo2;

import org.example.Colection.Exo2.Cercle.Cercle;
import org.example.Colection.Exo2.enums.Order;
import org.example.Colection.Exo2.tools.CercleComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriCercle {

    public static void main(){
        Cercle cercle1 = new Cercle(8,1,5);
        Cercle cercle2 = new Cercle(2,2,1);
        Cercle cercle3 = new Cercle(1,1,13);

        List<Cercle> list = new ArrayList<>();
        list.add(cercle1);
        list.add(cercle2);
        list.add(cercle3);

        Order order1 = Order.X;
        Order order2 = Order.RAYON;

        trieOrderCercle(order1,list);
        trieOrderCercle(order2,list);

    }


    public static void trieOrderCercle(Order order, List<Cercle> liste){
        System.out.println("order by : " +order);
        CercleComparator cercleComparator = new CercleComparator();
        cercleComparator.setOrder(order);
        Collections.sort(liste,cercleComparator);
        for (Cercle c:liste) {
            c.affiche();
        }
    }

}
