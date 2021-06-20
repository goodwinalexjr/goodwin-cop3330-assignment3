/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Goodwin
 */

package ex46;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Input {

    String input() throws IOException {
        //get path
        Path filePath = Paths.get("src/main/java/ex46/exercise46_input.txt");

        //read the file
        String information = readfile(filePath);

        return information;
    }

    public static String readfile (Path path) throws IOException {
        String information = Files.readString(path);
        return information;

    }
}
