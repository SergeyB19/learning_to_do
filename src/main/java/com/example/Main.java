package com.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        arr[0] = 10;
        arr[6] = 10;

        int result = arr[0] + arr[6];
        System.out.println(result);


        int res = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                res = res + 10;
            } else {
                res = res + i;
            }
        }
        System.out.println(res);

        int[] d = {2, 34, 2, 1};
        int summa = 0;

        for (int x : d) {
            summa = summa + x;
            System.out.print(x + " ");

        }
        System.out.print(summa + " ");


    }
}

