package com.zipcodewilmington.assessment1.part2;

import com.sun.xml.internal.fastinfoset.util.StringArray;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String [] words = sentence.split("\\s+");
            for (int i = 0; i < words.length; i++){
                words[i] = words[i].replaceAll("\\w]","");
            }

        return words;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String [] array = sentence.split(" ");
        String result = "";
        for (int i = 0; i < array.length; i++){
            result = array[0].toString();
        }
        return result;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String [] array = sentence.split(" ");
        String result = "";
        String reverse = "";
        for (int i = 0; i < array.length; i++){
            result = array[0].toString();
        }
        for (int j = result.length()-1; j >= 0; j--){
            reverse = reverse + result.charAt(j);
        }
        return reverse;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String [] array = sentence.split(" ");
        String result = "";
        String reverse = "";
        String outcome = "";
        for (int i = 0; i < array.length; i++){
            result = array[0].toString();
        }
        for (int j = result.length()-1; j >= 0; j--){
            reverse = reverse + result.charAt(j);
        }
        outcome = reverse.substring(0,1).toUpperCase() + reverse.substring(1).toLowerCase();
        return outcome;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        for (int i = 0; i < str.length(); i++){
            if (i == index){
            str.replace(str.charAt(i), ' ');
            }
        }
        return str;
    }

}
