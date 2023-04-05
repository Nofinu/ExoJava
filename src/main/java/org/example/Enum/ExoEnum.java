package org.example.Enum;

import java.util.Scanner;

public class ExoEnum {

    public static void main() {

        Scanner s = new Scanner(System.in);
        boolean test =true;
        Priority priority = Priority.LOW ;
        do{
            System.out.println("entrer un message (A,B,C,D)");
            String entry = s.next().toUpperCase();
            switch (entry){
                case "A":
                     priority = Priority.HIGH;
                    break;
                case "B":
                     priority = Priority.MEDIUM;
                    break;
                case "C":
                case "D":
                     priority = Priority.LOW;
                    break;
                default:
                    test= false;
                    break;

            }

        }while(!test);
        System.out.println(priority);
    }
}
