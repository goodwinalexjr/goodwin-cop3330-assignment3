package ex41;


import java.util.*;

public class NameSorting {

    Map<Integer, String> tempNames= new HashMap<Integer, String>();


    Map<Integer, String> sortNames(Map names, int amount){
        //convert the key in the map to an array
        List<String> name = new ArrayList<>(names.values());
        //sort the array
        Collections.sort(name);
        //put the array back into a map
        for(int i = 0; i < amount; i++){

            tempNames.put(i, name.get(i));
        }

        return tempNames;

    }
}
