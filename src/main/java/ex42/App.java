/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Goodwin
 */

package ex42;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {


    static ParsingData pd = new ParsingData();
    //main code here
    public static void main( String[] args ) throws FileNotFoundException {

        Map<Integer, String> input= new HashMap<Integer, String>();
        //input function here and how many inputs in the map
        int inputAmount = input(input);
        System.out.printf("Last        First      Salary\n");
        System.out.println("------------------------------");
        for(int i = 0; i < inputAmount; i++) {
            //parse data for last name function/class here
            String lastName = pd.parseDataLast(i, input);
            //parse data for first name function/class here
            String firstName = pd.parseDataFirst(i, input);
            //parse data for salary function/class here
            int salery = pd.parseDataSalery(i, input);
            //output data function here
            output(lastName, firstName, salery);
        }

    }

    static int input(Map<Integer, String> input) throws FileNotFoundException {
        //get information from file
        File myObj = new File("src/main/java/ex42/exercise42_input.txt");
        Scanner file = new Scanner(myObj);
        int i = 0;
        //load into a map
        while(file.hasNextLine()){

            //convert data in file to map array
            String data = file.nextLine();
            input.put(i, data);
            i++;

        }
        //return the amount of inputs
        return i;
    }

    static void output(String Last, String First, int Salery){
        //get the parsed information from main
        //print the information
        System.out.printf("%10s%10s%10d\n", Last, First, Salery);
    }

}
