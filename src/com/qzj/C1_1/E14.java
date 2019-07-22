package com.qzj.C1_1;

public class E14 {
    public static int lg(int N) {
        int n = 0;
        int p = 1;
        while (p <= N) {
            n++;
            p *= 2;
        }
        return n - 1;
    }

    public static void main(String[] args) {
        System.out.println(lg(1025));
    }
}
