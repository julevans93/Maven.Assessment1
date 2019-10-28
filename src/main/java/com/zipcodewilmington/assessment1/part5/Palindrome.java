package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        int counter = 0;
        String [] array = input.split("");
        for(int i = 0; i< array.length; i++){
            if(!array[i].equals(array[(array.length-1)-i]))
                counter++;
        }
        return counter;
    }
}
