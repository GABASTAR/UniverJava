package task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class arrs {
    public static void main() {
        Random rnd = new Random();
        Boolean flag = true;
        int n = 0;
        while (flag) {
            try {
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                n = Integer.parseInt(str);
                flag = false;
                sc.close();
            } catch (Exception e) {
                System.out.println("Incorrect input, try again");
            }
        }
        int[] arrInt = new int[n];
        int secArrNum = 0;
        for (int l = 0; l < arrInt.length; l++) {
            arrInt[l] = rnd.nextInt(n + 1);
            if (arrInt[l]%2 == 0) {
                secArrNum ++;
            }
            System.out.print(arrInt[l] + " ");
        }
        System.out.println();
        if (secArrNum > 0) {
            int[] secArr = new int[secArrNum];
            int nl = 0;
            for (int l = 0; l < arrInt.length; l++) {
                if (arrInt[l]%2 == 0) {
                    secArr[nl] = arrInt[l];
                    nl++;
                }
            }
            System.out.println(Arrays.toString(secArr));
        }
    }
}
