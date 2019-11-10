package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
//        int counter = 0;
//        String [] array = input.split("");
//        for(int i = 0; i< array.length; i++){
//            if(!array[i].equals(array[(array.length-1)-i]))
//                counter++;
//        }
//        return counter;
//    }
        String a;
        int countSubs = input.length();
        for (int i =0; i < input.length(); i++){
        for (int j = i+2; j<=input.length(); j++){
            a = input.substring(i,j);
            countSubs+= count (a);
        }
        }
        return countSubs;
    }
    public static int count (String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i))
                return 0;
        }
        return 1;
    }
}
