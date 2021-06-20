package ex45;



import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    //main class
    public static void main( String[] args ) throws IOException {

        WordFinder wf = new WordFinder();
        output o = new output();
        //get from input file
        String information = input();

        //convcert any word od utilize to use
        information = wf.finding(information);

        //write to a new file the edited version
        o.output(information);
    }

    static String input() throws IOException {

        Path filePath = Paths.get("src/main/java/ex45/exercise45_input.txt");

        //read the file
        String information = readfile(filePath);

        return information;

    }

    public static String readfile (Path path) throws IOException {
       String information = Files.readString(path);
       return information;

    }
}
