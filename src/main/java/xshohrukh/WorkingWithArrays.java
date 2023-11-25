package xshohrukh;

import java.util.Scanner;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int[] array; // reference
        array = new int[4];
        // new -> return memory address
        // int index = 4;
        // min_index >= 0; max_index = array length - 1
        // index  bounds
        // int nthElement = array[index];
        // System.out.println(nthElement);
        /*
        int -> 0
        short -> 0
        long -> 0
        boolean -> false
        String -> null
        */
        /*

        for (int i = 0; i < 4; i++) {
            System.out.println(array[i]);
        }*/
        /*Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(array[i]);
        }*/
        /*int arrayLength = array.length;
        System.out.println(arrayLength);*/
        // new int[10]; // reinitialize
        array[0] = 90;
        array[1] = 9;
        array[2] = 19;
        array[3] = 11;

        int[] array2 = new int[10];

        System.arraycopy(array, 2, array2, 4, 2);

//        for (int i = 0; i < array.length; i++) {
//            array2[i] = array[i];
//        }
        for ( int i : array2 ) {
            System.out.println(i);
        }


        /*System.out.println(array.length);
        //int[] array2 = new int[]{3,24,5,67,90};
        int[] array3 = {3, 24, 5, 67, 90};
        *//*for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }*//*
        for (int element : array3) {
            System.out.println(element);
        }*/
    }
}