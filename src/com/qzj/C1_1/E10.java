package com.qzj.C1_1;

public class E10 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = i * i;
        for (int i: a) {
            System.out.println(i);
        }
    }
}
