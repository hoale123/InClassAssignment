package com.company;

public class SumArrays {

    // sum of two array
    public static int sum(int a[], int b[]){
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < a.length;i++){
            sumA = sumA + a[i];
        }

        for (int i = 0; i < b.length;i++){
            sumB = sumB + b[i];
        }

        return sumA + sumB;
    }


    //compare two array.
    public static int[] arrayify(int length, int startingNumber){
            if(length < 1){
                int[] array = {};
                return array;
            }
//            length = 5
            int[] newArray = new int[length];
//            {0,0,0,0,0}

        for(int i = 0; i < length; i++){
            //length[0] = startingNumber(3) + i (0)= 3 {3}
            //length[1] = startingNumber(3) + i (1) = 4 {4}
            newArray[i] = startingNumber;
//            [0] = {3}
//            [1] = {4}
//            {3,4}
            startingNumber++;
        }
        return newArray;
    }

}
