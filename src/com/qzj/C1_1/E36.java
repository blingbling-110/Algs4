package com.qzj.C1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class E36 {
    public static void shuffle(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            //将a[i]和a[i..N - 1]中任意一个元素交换
            int r = i + StdRandom.uniform(N - i);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static void main(String[] args) {
        int M = StdIn.readInt();
        int N = StdIn.readInt();
        int[] a = new int[M];
        int[][] r = new int[M][M];
        for (int n = N; n > 0; n--) {
            for (int i = 0; i < a.length; i++)
                a[i] = i;
            shuffle(a);
            for (int j = 0; j < a.length; j++)
                r[a[j]][j]++;
        }
        for (int[] rs: r) {
            for (int i: rs)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
