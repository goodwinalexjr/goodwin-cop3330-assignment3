/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Goodwin
 */

package ex42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ParsingDataTest {



    @Test
    void parseDataLast() throws FileNotFoundException {
        ParsingData pd = new ParsingData();
        App app = new App();

        Map<Integer, String> input= new HashMap<Integer, String>();
        int i = app.input(input);
        String actual = pd.parseDataLast(0, input);
        String expected = "Ling";

        assertEquals(expected, actual);

    }

    @Test
    void parseDataFirst() throws FileNotFoundException {
        ParsingData pd = new ParsingData();
        App app = new App();

        Map<Integer, String> input= new HashMap<Integer, String>();
        int i = app.input(input);
        String actual = pd.parseDataFirst(0, input);
        String expected = "Mai";

        assertEquals(expected, actual);
    }

    @Test
    void parseDataSalery() throws FileNotFoundException {
        ParsingData pd = new ParsingData();
        App app = new App();

        Map<Integer, String> input= new HashMap<Integer, String>();
        int i = app.input(input);
        int actual = pd.parseDataSalery(0, input);
        int expected = 55900;

        assertEquals(expected, actual);
    }
}