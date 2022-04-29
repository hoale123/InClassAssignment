package com.company;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public String findPresidentNumber(int x){
        switch (x){
            case 45:
                return "Donald Trump";
            case 46:
                return "Joe Biden";
            default:
                return "Grover Cleveland";
        }
    }
//    int a = 5;
//    int b = 10;
    public int divide(int a , int b){
        if (a == 0 || b == 0){
            return 0;
        }
        return a/b;
    }
}
