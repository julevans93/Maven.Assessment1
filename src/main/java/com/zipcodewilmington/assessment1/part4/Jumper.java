package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        for (int i = j; i < k; i++){
            if (k % j == 0){
                return k;
            }
        }
        return j;
    }
}
