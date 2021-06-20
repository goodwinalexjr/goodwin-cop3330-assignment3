/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Goodwin
 */

package ex46;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class wordsInFileTest {

    @Test
    void words() throws IOException {
        Input in = new Input();
        wordsInFile wif = new wordsInFile();

        String input = in.input();
        List<String> actual = wif.words(input);
        List<String> expected = new ArrayList<String>();
        expected.add("badger");
        expected.add("mushroom");
        expected.add("snake");

        Assertions.assertLinesMatch(expected, actual);
    }
}