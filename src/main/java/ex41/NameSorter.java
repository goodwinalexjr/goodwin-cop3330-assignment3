/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Goodwin
 */

package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NameSorter {

    //main class
    public static void main( String[] args ) throws FileNotFoundException {

        NameSorting ns = new NameSorting();
        //create map
        Map<Integer, String> names= new HashMap<Integer, String>();
        //get from input file
        //calculate total names
        int amount = inputData(names);

        //sort names
        Map<Integer, String> sortedNames = ns.sortNames(names, amount);
        //print sorted names
        outputdata(sortedNames, amount);
    }

    static int inputData(Map names) throws FileNotFoundException {
        File myObj = new File("src/main/java/ex41/exercise41_input.txt");
        Scanner file = new Scanner(myObj);
        int i = 0;
        //read the file
        while(file.hasNextLine()){

            //convert data in file to map array
            String data = file.nextLine();
            names.put(i, data);
            i++;

        }
        file.close();

        return i;
    }

    static void outputdata(Map sortedNames, int amount){
        System.out.println("Total of " + amount + " names");
        System.out.println("-----------------");
        for(int j = 0; j < amount; j++){
            System.out.println(sortedNames.get(j));
        }
    }
}
