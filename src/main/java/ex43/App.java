package ex43;


import java.io.IOException;
import java.util.Scanner;

public class App {

    static String websiteName;
    static String Author;
    static String Javascript;
    static String css;
    static Scanner sc = new Scanner(System.in);

    static WebsiteGenerator wg = new WebsiteGenerator();


    //main goes here
    public static void main( String[] args ) throws IOException {
        //get input from the user
        input();
        //create folders for the website
        wg.createFolders(websiteName, Author, Javascript, css);
    }

    static void input(){
        //ask user for information
        System.out.print("Site name: ");
        websiteName = sc.nextLine();
        System.out.print("Author: ");
        Author = sc.nextLine();
        //ask user for extra folders
        System.out.print("Do you want a folder for JavaScript(y/n)? ");
        Javascript = sc.nextLine();
        System.out.print("Do you want a folder for CSS(y/n)? ");
        css = sc.nextLine();

    }
}
