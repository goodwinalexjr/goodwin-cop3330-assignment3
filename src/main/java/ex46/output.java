/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Goodwin
 */

package ex46;

import java.util.List;

public class output {

    void output(int[] count, List<String> input){

        int x = 0;

        for(int i = 0; i < count.length; i++){
            int best = 0;
            for(int j = 0; j < count.length; j++){
                if(count[j] > best){
                    best = count[j];
                    x = j;
                }
            }
            System.out.printf("%8s\t", input.get(x) );
            for(int j = 0; j < count[x]; j++){
                System.out.print("*");
            }
            count[x] = 0;
            System.out.println();
        }

    }
}
