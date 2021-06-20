/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Goodwin
 */

package ex46;

import java.io.IOException;
import java.util.List;

public class App {

    //main goes here
    public static void main( String[] args ) throws IOException {

        Input in = new Input();
        wordsInFile wif = new wordsInFile();
        WordCount wc = new WordCount();
        output out = new output();
        //get information from file
        String input = in.input();
        //go through file and get each word and put into a array
        List<String> allWords = wif.words(input);
        //count each word in the file
        int[] count = wc.wordcount(allWords, input);
        System.out.println();
        //sort the count from the highest amount to the lowest amount and print
        out.output(count, allWords);
    }
}
