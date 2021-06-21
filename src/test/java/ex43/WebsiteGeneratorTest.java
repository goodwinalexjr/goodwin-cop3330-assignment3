/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Goodwin
 */

package ex43;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {

    @Test
    void createFolders() throws IOException {
        WebsiteGenerator wg = new WebsiteGenerator();
        String name = "Test";
        String author = "Joe";
        String js = "n";
        String css = "n";
        boolean actual = wg.createFolders(name, author, js, css);

        assertTrue(actual);
    }


}