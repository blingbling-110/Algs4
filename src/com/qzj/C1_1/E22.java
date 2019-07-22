package com.qzj.C1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class E22 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int d) {
        System.out.println(new String(new char[d]).replace(
                '\0', ' ') +lo + ' ' + hi);
        d++;
        //如果key存在于a[]中，它的索引不会小于lo且不会大于hi
        if (lo > hi)
            return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid])
            return rank(key, a, lo, mid - 1, d);
        else if (key > a[mid])
            return rank(key, a, mid + 1, hi, d);
        else
            return mid;
    }

    public static void main(String[] args) {
        int[] w = In.readInts(args[0]);
        Arrays.sort(w);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, w) < 0)
                System.out.println(key);
        }
    }
}
