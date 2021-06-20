/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Goodwin
 */

package ex46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordCount {

    int[] wordcount(List<String> allWords, String input){

        input = input.replace("\n"," ").replace("\r", "");
        String[] word = input.split(" ");
        List<String> newset = new ArrayList<String>(Arrays.asList(word));
        int[] count = new int[allWords.size()];

        for(int i = 0; i < allWords.size(); i++){
            for(int j = 0; j < newset.size(); j++){
                if(allWords.get(i).equals(newset.get(j))){
                    count[i]++;
                }
            }
        }
        return count;
    }
}
