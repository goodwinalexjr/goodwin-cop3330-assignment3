/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alex Goodwin
 */

package ex42;

import java.util.Map;

public class ParsingData {
    char comma = ',';

    String parseDataLast(int i, Map input){
        //take map and turn it into a character array
        char[] temp = input.get(i).toString().toCharArray();
        int length = input.get(i).toString().length();
        int x = 0;

        //take that array and add into a temp array until a comma is found
        for(int j = 0; j < length; j++){
;
            if(Character.compare(temp[j], comma) == 0){
                break;
            }
            else {
                x++;
            }
        }
        char[] lastName = new char[x];
        for(int j = 0; j < x; j++) {
         lastName[j] = temp[j];
        }

        //return array as string

        return String.valueOf(lastName);
    }

    String parseDataFirst(int i,Map input){
        //take map and turn it into a character array
        char[] temp = input.get(i).toString().toCharArray();
        int length = input.get(i).toString().length();
        int x = 0;
        int y = 0;
        int z = 0;
        //take that array and add into a temp array until a comma is found
        for(int j = 0; j < length; j++){
            if(y == 0){
                if (Character.compare(temp[j], comma) == 0){
                    y++;
                }
                else{
                    z++;
                }
            }
            else {
                if (Character.compare(temp[j], comma) == 0) {
                    break;
                } else {
                    x++;
                }
            }
        }
        //when comma is found start on next line
        char[] firstName = new char[x];
        for(int j = 0; j < x; j++) {
            firstName[j] = temp[z+1];
            z++;
        }
        //return array as string
        return String.valueOf(firstName);
    }

    int parseDataSalery(int i,Map input){
        //take map and turn it into a character array
        char[] temp = input.get(i).toString().toCharArray();
        int length = input.get(i).toString().length();
        int x = 0;
        int y = 0;
        int z = 0;
        //take that array and add into a temp array until a comma is found
        for(int j = 0; j < length; j++){
            if(y != 2) {
                if (Character.compare(temp[j], comma) == 0) {
                    y++;
                    z++;
                } else {
                    z++;
                }
            }
            if(y == 2){
                    x++;
                }

        }
        //when comma is found start on next line
        char[] Sal = new char[x-1];

        for(int j = 0; j < x-1; j++) {

            Sal[j] = temp[z];
            z++;
        }
        //return array as int
        return Integer.parseInt(String.valueOf(Sal));
    }
}
