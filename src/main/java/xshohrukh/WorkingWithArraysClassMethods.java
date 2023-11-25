package xshohrukh;

import java.util.Arrays;

public class WorkingWithArraysClassMethods {
    public static void main(String[] args) {
        int[] array = {12, 3, 4, 5, 32, 23, 56, 78, 90};
       /* String str = "[";
        for (int i = 0; i < array.length; i++) {
            str = str + array[i];
            if (i < array.length - 1) {
                str = str + ", ";
            }
        }
        str = str + "]";
        System.out.println(str);*/

        /*String str = Arrays.toString(array);
        System.out.println(str);
        int[][] matrix = {
                {12, 4, 6},
                {90, 12, 2},
                {34, 21, 65}
        };
        System.out.println(Arrays.toString(matrix));
        System.out.println(Arrays.deepToString(matrix));*/
        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array, 12);
        System.out.println(index);


        int[][] matrix2 = {
                {1,2},
                {4,5},
                {2,7}
        };
        System.out.println(Arrays.deepToString(matrix2));
    }
}