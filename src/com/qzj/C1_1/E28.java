package com.qzj.C1_1;

import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.Arrays;

public class E28 {
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

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        for (int i: whitelist) {
            System.out.print(i + " ");
        }
        System.out.println("");
        ArrayList<Integer> al = new ArrayList<>();
        al.add(whitelist[0]);
        for (int i = 1; i < whitelist.length; i++)
            if (whitelist[i] != whitelist[i - 1])
                al.add(whitelist[i]);
        for (Integer i: al) {
            System.out.print(i + " ");
        }
    }
}
