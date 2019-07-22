package com.qzj.C1_1;

public class E19 {
    public static long F(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        return F(N - 1) + F(N - 2);
    }

    public static long F2(int N) {
        long[] a = new long[100];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= N; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[N];
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            System.out.println(N + " " + F2(N));
    }
}
