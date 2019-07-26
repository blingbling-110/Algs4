package com.qzj.C1_2;

import java.util.Date;

public class E08 {
    public static void exchange(int[] a, int[] b) {
        int[] t = a;
        a = b;
        b = t;
    }

    public static void main(String[] args) {
        int[] a = new int[8000000];
        int[] b = new int[5000000];
        exchange(a, b);
    }
}
