package com.qzj.C1_2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class E15 {
    public static int[] readInts(String fileName) {
        In in = new In(fileName);
        String allStrs = in.readAll();
        String[] strs = allStrs.split("\\s+");
        int[] ints = new int[strs.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strs[i]);
        }
        return ints;
    }

    public static void main(String[] args) {
        for (int i:
             readInts(args[0])) {
            StdOut.println(i);
        }
    }
}
