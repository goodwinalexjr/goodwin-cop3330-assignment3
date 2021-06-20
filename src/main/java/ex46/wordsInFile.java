/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Goodwin
 */

package ex46;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class wordsInFile {

    List<String> words(String input){
        //split the words down to only the unique ones
        input = input.replace("\n"," ").replace("\r", "");
        String[] word = input.split(" ");
        List<String> allWords = new ArrayList<String>(Arrays.asList(word));

        for(int i = 1; i < allWords.size(); i++){
            for(int j = 0; j < i; j++){
                if(allWords.get(i).equals(allWords.get(j))){
                    allWords.remove(i);
                    i--;
                    break;
                }
            }
        }

        return allWords;
    }
}
