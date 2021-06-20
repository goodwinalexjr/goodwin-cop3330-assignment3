/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Goodwin
 */

package ex46;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

class WordCountTest {

    @Test
    void wordcount() throws IOException {
        WordCount wc = new WordCount();
        Input in = new Input();
        wordsInFile wif = new wordsInFile();

        String inputs = in.input();
        List<String> allwords = wif.words(inputs);
        int[] actual = wc.wordcount(allwords, inputs);
        int[] expected = {7, 2, 1};

        Assertions.assertArrayEquals(expected, actual);
    }
}