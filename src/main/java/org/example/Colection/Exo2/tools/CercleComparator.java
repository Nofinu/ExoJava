package org.example.Colection.Exo2.tools;

import org.example.Colection.Exo2.Cercle.Cercle;
import org.example.Colection.Exo2.enums.Order;

import java.util.Comparator;

public class CercleComparator implements Comparator<Cercle> {
    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }


    @Override
    public int compare(Cercle o1, Cercle o2) {
        switch (order){
            case X:
                return (int) (o1.getX()-o2.getX());
            case Y:
                return (int)(o1.getY()-o2.getY());
            case RAYON:
                return (int)(o1.getRayon()-o2.getRayon());
        }
        return 0;
    }
}
