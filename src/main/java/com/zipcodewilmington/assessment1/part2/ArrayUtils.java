package com.zipcodewilmington.assessment1.part2;

import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int counter =0;
        for(int i = 0; i < objectArray.length; i++){
            if(objectArray[i] == objectToCount){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        int i, j;
        for (i = j = 0; j < objectArray.length; j++)
            if (!objectToRemove.equals(objectArray[j])) objectArray[i++] = objectArray[j];
        objectArray = Arrays.copyOf(objectArray,i);
        return objectArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Integer[] integerArray = new Integer[objectArray.length];

        Arrays.sort(integerArray);

        int popular = integerArray[0];
        int counter1 = 1;
        int counter2 = 1;
        int maxCount = 1;

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] == integerArray[i+1])
                counter1++;
            for (int j = 0; j < i; j++){
                if (integerArray[j] == integerArray[j+1]){
                    counter2++;
                }
                if (counter1 > counter2){
                    return counter1;
                }
            }
        }
        return counter2;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Object[] n = new Object[objectArray.length + objectArrayToAdd.length];
        System.arraycopy(objectArray, 0, n, 0, objectArray.length);
        System.arraycopy(objectArrayToAdd, 0, n, objectArray.length, objectArrayToAdd.length);
        return n;
    }
}
