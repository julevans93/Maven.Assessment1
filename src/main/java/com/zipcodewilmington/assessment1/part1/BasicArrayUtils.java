package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {

        return stringArray[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        String result = "";
        for(int i = 0; i <= stringArray.length; i++){
            result = stringArray[1].toString();
        }
        return result;
    }

    /**
     * @param stringArray an array of String objects
     * @return the last element in the array
     */
    public static String getLastElement(String[] stringArray) {
        String result = "";
        for(int i = 0; i <= stringArray.length; i++){
          result = stringArray[stringArray.length-1].toString();
        }
        return result;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second to last element in the array
     */
    public static String getSecondToLastElement(String[] stringArray) {
        String result = "";
        for(int i = 0; i <= stringArray.length; i++){
            result = stringArray[stringArray.length-2].toString();
        }
        return result;
    }
}
