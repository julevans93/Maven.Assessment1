package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String result = "";
        for(int i = str.length() -1; i >= 0; i--){
            result = result + str.charAt(i);
        }
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String result = "";
        String outcome = "";

        for(int i = str.length() -1; i >= 0; i--){
            result = result + str.charAt(i);
        }
        outcome = result.substring(0,1).toUpperCase() + result.substring(1).toLowerCase();
        return outcome;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))) {
                result += Character.toUpperCase(str.charAt(i));
            }
                else{
                    result += Character.toLowerCase(str.charAt(i));}
        }
        return result;
    }
}

