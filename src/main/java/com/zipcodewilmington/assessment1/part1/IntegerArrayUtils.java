package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum = 0;
        for(int i = 0; i <= intArray.length; i++){
            sum += i;
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int result = 1;
        for(int i : intArray){
            result *= i;
        }
        return result;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        double counter = 0;
        double sum = 0;
        for(int i : intArray){
            sum += i;
        }
        for(int i : intArray){
            counter ++;
        }
        return sum / counter;
    }
}
