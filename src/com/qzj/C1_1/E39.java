package com.qzj.C1_1;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class E39 {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int[] N_list = {1000, 10000, 100000, 1000000};
        int[] nums = null;
        int ave = 0;
        for (int N : N_list) {
            nums = doTest(T, N);
            for (int i: nums)
                ave += i;
            System.out.println(N + ": " + ave / T);
        }
    }

    public static int[] doTest(int T, int N) {
        int[] nums = new int[T];
        for (int t = 0; t < T; t++) {
            int[] a1 = new int[N];
            int[] a2 = new int[N];
            for (int i = 0; i < a1.length; i++) {
                a1[i] = StdRandom.uniform(100000, 1000000);
                a2[i] = StdRandom.uniform(100000, 1000000);
            }
            Arrays.sort(a2);
            for (int i : a1)
                if (BinarySearch.rank(i, a2) >= 0)
                    nums[t]++;
        }
        return nums;
    }
}
