package ex45;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class output {

    void output(String information) throws IOException {

        Scanner sc = new Scanner(System.in);

        //gets user information for filename
        System.out.print("What is the file name: ");
        String filename = sc.next();
        String location = "src/main/java/ex45/" + filename + ".txt";
        //write the edited version to file
        File file = new File(location);
        file.createNewFile();
        FileWriter filewriter = new FileWriter(location);
        filewriter.write(information);
        filewriter.close();


    }
}
