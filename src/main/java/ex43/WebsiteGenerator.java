/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Goodwin
 */

package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WebsiteGenerator {

    boolean createFolders(String websiteName, String Author, String Javascript, String css) throws IOException {
        //create the first folder with website name
        String mainLocation = "src/main/java/ex43/website" ;
        String websitename = mainLocation + "/" + websiteName;
        File website = new File(mainLocation);
        website.mkdir();
        File WebsiteName = new File(websitename);
        //print out succesfull
        boolean create = WebsiteName.mkdir();
        if(create){
            System.out.println("Created ./website/" + websiteName);
        }
        else{
            System.out.println("There was an error found");
        }
        //go to create index
        createIndex(websiteName, Author);

        //check to see if the user wanted extra fodlders and create if yes
        if(Javascript.equals("y") || Javascript.equals("Y")){
            String Java = mainLocation + "/js";
            File java = new File(Java);
            boolean javafile = java.mkdir();
            if(javafile){
                System.out.println("Created ./website/" + websiteName + "/js/");

            }
            else{
                System.out.println("There was an error found");
            }

        }
        if(css.equals("y") || css.equals("Y")){
            String CSS = mainLocation + "/css";
            File Css = new File(CSS);
            boolean cssfile = Css.mkdir();
            if(cssfile){
                System.out.println("Created ./website/" + websiteName + "/css/");

            }
            else{
                System.out.println("There was an error found");
            }

        }

        return create;
    }

    void createIndex(String websiteName, String Author) throws IOException {

        //create the index file
        String Indexpath = "src/main/java/ex43/website/" + websiteName + "/index.html";
        File indexhtml = new File(Indexpath);
        indexhtml.createNewFile();
        FileWriter indexwrite = new FileWriter(Indexpath);
        String indexwriten = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <"+websiteName+"></"+websiteName+">\n" +
                "  <meta name=\""+Author+"\" content=\"\">\n" +
                "  <meta name=\"description\" content=\"\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "\n" +
                "  <link href=\"css/style.css\" rel=\"stylesheet\">\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "\n" +
                "  <p>Hello, world!</p>\n" +
                "\n" +
                "  <script src=\"js/script.js\"></script>\n" +
                "</body>\n" +
                "\n" +
                "</html>";
        indexwrite.write(indexwriten);
        indexwrite.close();
        System.out.println("Created ./website/" + websiteName + "/index.html");



    }
}
