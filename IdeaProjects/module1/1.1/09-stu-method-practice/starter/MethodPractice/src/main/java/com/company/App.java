package com.company;

public class App {


	// subtract
    public static int subtract(int a, int b){
        return a - b;
    }


	// subtractOrZero
//    public static int subtractOrZero(int a, int b){
//        int diff = a - b;
//        if(diff < 0){
//            return 0;
//        }else {
//            return diff;
//        }
//    }
    public static int subtractOrZero(int a, int b) {
        int diff = a - b;
        if (diff < 0) {
            return 0;
        } else {
            return diff;
        }
    }


	// max
    public static int max(int a, int b, int c){
        int max = a;
        if (b > max){
             max = b;
        }
        if (c > max){
             max = c;
        }
        return max;
    }



	// min
    public static int min(int a, int b, int c){
        int min = a;
        if (b < min){
             min = b;
        }
        if (c < min){
             min = c;
        }
        return min;
    }


	// isLarger

    public static boolean isLarger(int first, int second) {
        if (first > second) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] students = {"Andy", "Kevin", "Rachel H", "Matt", "Hoa"};

        for (String student : students){
            System.out.println(student + " has " + student.length() + " letters in their name.");
            System.out.println("Also, " + student + " is my favorite.");
        }
    }

}
