/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Goodwin
 */

package ex41;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class NameSortingTest {

    @Test
    void sortNames() throws FileNotFoundException {
        NameSorter nser = new NameSorter();
        NameSorting nsing = new NameSorting();

        Map<Integer, String> names= new HashMap<Integer, String>();

        int amount = nser.inputData(names);
        Map<Integer, String> actual = nsing.sortNames(names, amount);
        Map<Integer, String> expected = new HashMap<Integer, String>();
        expected.put(0, "Johnson, Jim");
        expected.put(1, "Jones, Aaron");
        expected.put(2, "Jones, Chris");
        expected.put(3, "Ling, Mai");
        expected.put(4, "Swift, Geoffrey");
        expected.put(5, "Xiong, Fong");
        expected.put(6, "Zarnecki, Sabrina");

        List<String> expectedd = Collections.singletonList(expected.toString());
        List<String> actuall = Collections.singletonList(actual.toString());

        Assertions.assertLinesMatch(expectedd, actuall);


    }
}