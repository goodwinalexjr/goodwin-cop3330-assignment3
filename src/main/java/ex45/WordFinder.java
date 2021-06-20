package ex45;

public class WordFinder {

    String finding(String information){
        //replace the word utilize
        return replaceUtilize(information);


    }

    String replaceUtilize(String infomration){
        String replaced = infomration.replaceAll("utilize", "use");

        return replaced;
    }
}
