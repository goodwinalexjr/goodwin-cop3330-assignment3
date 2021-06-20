/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Goodwin
 */

package ex46;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {

    @Test
    void input() throws IOException {
        Input detector = new Input();

        String actual = detector.input();
        String expected = "badger badger badger\n" +
                "badger mushroom\n" +
                "mushroom snake badger badger\n" +
                "badger";

        Assertions.assertEquals(expected, actual);
    }
}