package org.example.Matrice.Exo1;

import java.util.Arrays;

public class Exo1 {
    public static void Matrice1(){
        int[][] tabs ={{1,2,3,4},{27,32,55,18},{85,18,25},{102,35,48}};

        int max = 0;

        for (int[] tab:tabs) {
            for (int val:tab) {
                if(val>max){
                    max=val;
                }
            }
        }

        System.out.println(max);
    }
}
