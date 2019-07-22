package com.qzj.C1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class E29 {
    public static int rank(int key, int[] a) {
        //  数组必须是有序的
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            //  被查找的键要么不存在，要么必然存在于a[lo..hi]之中
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static int rank2(int key, int[] a) {
        for (int i = 0; i < a.length; i++)
            if (a[i] >= key)
                return i;
        return a.length;
    }
    public static int count(int key, int[] a) {
        int n = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] == key)
                n++;
        return n;
    }

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        int key = StdIn.readInt();
        System.out.println(rank2(key, whitelist));
        System.out.println(count(key, whitelist));
    }
}
