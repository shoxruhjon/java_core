package xshohrukh.arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] arrayOne = {12, 213, 141, 12, 123};
        System.out.println(Arrays.toString(arrayOne));
        int[] arrayTwo = new int[]{1, 12, 3, 4, 15};
        System.out.println(Arrays.toString(arrayTwo));
        int[] arrayThree = new int[3];
        arrayThree[0] = 12;
        arrayThree[1] = 221;
        arrayThree[2] = 890;
        System.out.println(Arrays.toString(arrayThree));
    }
}
