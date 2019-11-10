package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        Integer counter = 0;
        for (Integer i : ints){
            Integer newNumber = i % 2;
            if(!newNumber.equals(0)){
                counter++;
            }
        }
        Integer [] odds = new Integer[counter];
        Integer counter2 = 0;
        for (Integer i : ints){
            Integer newNumber = i % 2;
            if (!newNumber.equals(0)){
            odds[counter2] = i;
            counter2++;
            }
        }
        return odds;
    }
    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer counter = 0;
        for (Integer i : ints){
            Integer newNumber = i % 2;
            if(newNumber.equals(0)){
                counter++;
            }
        }
        Integer [] evens = new Integer[counter];
        Integer counter2 = 0;
        for (Integer i : ints){
            Integer newNumber = i % 2;
            if (newNumber.equals(0)){
                evens[counter2] = i;
                counter2++;
            }
        }
        return evens;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        Integer counter = 0;
        for (Integer i : ints){
            Integer newNumber = i % 3;
            if(!newNumber.equals(0)){
                counter++;
            }
        }
        Integer [] three = new Integer[counter];
        Integer counter2 = 0;
        for (Integer i : ints){
            Integer newNumber = i % 3;
            if (!newNumber.equals(0)){
                three[counter2] = i;
                counter2++;
            }
        }
        return three;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        Integer counter = 0;
        for (Integer i : ints){
            Integer newNumber = i % multiple;
            if(!newNumber.equals(0)){
                counter++;
            }
        }
        Integer [] deleteN = new Integer[counter];
        Integer counter2 = 0;
        for (Integer i : ints){
            Integer newNumber = i % multiple;
            if (!newNumber.equals(0)){
                deleteN[counter2] = i;
                counter2++;
            }
        }
        return deleteN;
    }
}
