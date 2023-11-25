package xshohrukh;

public class MultidementionalArray {
    public static void main(String[] args) {
        int[][] table = new int[3][6];

        for (int i = 0; i < 3; i++) {
            int[] row = table[i];
            for (int j = 0; j < 6; j++) {
                row[j] = (int) Math.round(Math.random() * 100);
            }
        }

        /*for (int i = 0; i < 3; i++) {
            int[] row = table[i];
            for (int j = 0; j < 6; j++) {
                int element = row[j];
                System.out.print(element + "\t");
            }
            System.out.println("");
        }*/

        /*for (int[] row : table) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }*/
        int[][] matrix = {
                {12, 4},// array 1
                {5, 4, 23,345, 123}, // array 2
                {9, 12}, //array 3
                {11} //array 4
        };

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}