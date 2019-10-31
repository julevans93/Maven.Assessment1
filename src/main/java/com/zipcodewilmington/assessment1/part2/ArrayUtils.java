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
        for (Object o : objectArray) {
            if(o.equals(objectToCount)){
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
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        ArrayList<Integer> removeList = new ArrayList<>(Arrays.asList(objectArray));
        while(removeList.remove(objectToRemove)){}
        return removeList.toArray(new Integer [removeList.size()]);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
       int maxCount = 0;
       Object mostCommon = 0;
        for (Object x: objectArray){
          int most = getNumberOfOccurrences(objectArray, x);
          if(most > maxCount){
              maxCount = most;
              mostCommon = x;
          }
       }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int minCount = 1;
        Object leastCommon = 0;
        for (Object x: objectArray){
            int min = getNumberOfOccurrences(objectArray, x);
            if(min <= minCount){
                minCount = min;
                leastCommon = x;
            }
        }
        return leastCommon;
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
