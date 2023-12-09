package xshohrukh;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 25, 33, 20, 18};
//        System.out.println(bigNum(numbers));
//        System.out.println(sum(numbers));
//        System.out.println(sorted(numbers));
//        System.out.println(dubl(numbers));
//        System.out.println(Arrays.toString(maxAndMin(numbers)));
//        logicalOp(true, false);
//        System.out.println(chechPassword("Abcd123%"));
//        temp(32);
//        yuzaT(5, 10);
        age(1999, 11, 2);
    }

    static int bigNum(int[] num){
//        Arrays.sort(num);
        for (int i = 0; i < num.length - 1; i++){
            for (int j = i + 1; j < num.length; j++){
                if (num[i] > num[j]){
                    int a = num[i];
                    num[i] = num[j];
                    num[j] = a;
                }
            }
        }
        return num[num.length-2];
    }

    static int sum(int[] nums){
        int s = 0;

        for (int num : nums) {
            s += num;
        }
        return s;
    }

    static boolean sorted(int[] nums){
        int[] cnums = new int[nums.length];
        for (int i = 0; i < cnums.length; i++){
            cnums[i] = nums[i];
        }

        for (int i = 0; i < cnums.length - 1; i++){
            for (int j = i + 1; j < cnums.length; j++){
                if (cnums[i] > cnums[j]){
                    int a = cnums[i];
                    cnums[i] = cnums[j];
                    cnums[j] = a;
                }
            }
        }

        for (int i = 0; i < cnums.length; i++){
            if(cnums[i] != nums[i]){
              return false;
            }
        }
        return true;
    }

    static String dubl(int[] num){
        for (int i = 0; i < num.length - 1; i++){
            for (int j = i + 1; j < num.length; j++){
                if (num[i] > num[j]){
                    int a = num[i];
                    num[i] = num[j];
                    num[j] = a;
                }
            }
        }
        String result = "[";
        int po = 0;
        for (int i = 0; i < num.length - 1; i++){
            if(num[i] == num[i + 1] && num[i] != (po % 10)){
                result = result + num[i] + ",";
                po = num[i];
            }
        }
        result = result.substring(0, result.length() - 1);
        result += "]";
        return result;
    }

    static void sort(int[] nums){
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] > nums[j]){
                    int a = nums[i];
                    nums[i] = nums[j];
                    nums[j] = a;
                }
            }
        }
    }
    static int[] maxAndMin(int[] nums){
        sort(nums);
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    static void logicalOp(boolean a, boolean b){
        System.out.println("%b and %b = %b , %b or %b = %b".formatted(a, b, a && b, a, b, a || b));
    }

    static boolean chechPassword(String password){
        int[] k = new int[4];
        for (int i = 0; i < password.length(); i++){
            if( password.charAt(i) >= 'A' &&  password.charAt(i) <= 'Z')
                k[0]++;
            if( password.charAt(i) >= 'a' &&  password.charAt(i) <= 'z')
                k[1]++;
            if( password.charAt(i) >= '0' &&  password.charAt(i) <= '9')
                k[2]++;
            if( password.charAt(i) >= '!' &&  password.charAt(i) <= '/'
                ||  password.charAt(i) >= ':' &&  password.charAt(i) <= '@'
                ||  password.charAt(i) >= '[' &&  password.charAt(i) <= '`')
                k[3]++;
        }
        boolean result = (k[0] > 0 && k[1] > 0 && k[3] > 0 && k[3] > 0) ? true : false;
        return result;
    }

    static void temp(int f) {
        int s = (f - 32) * 5 / 9;
        System.out.println("Farengeyt = " + f);
        System.out.println("Selsiy = " + s);
    }

    static void yuzaT(int u, int k){
        System.out.println("Uzunlik = " + u);
        System.out.println("Kenglik = " + k);
        System.out.println("Yuza = " + k * u);
    }

    static void age(int y, int m, int d){
        int hYear = 2023;
        int hMonth = 12;
        int hDay = 9;
        int qD = (hDay - d + 30) / 30 < 1 ? 1 : 0;
        int resultD = (hDay - d + 30) % 30;
        int qM = (hMonth - m + 12 + qD) / 12 < 1 ? 1 : 0;
        int resultM = (hMonth - m + qD) % 12;
        int resultY = (hYear - y + qM);
        System.out.println("Yosh: " + resultY + " Oy: " + resultM + " Kun: " + resultD);
    }
}