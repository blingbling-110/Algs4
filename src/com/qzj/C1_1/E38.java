package com.qzj.C1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.Date;

public class E38 {
    public static int rank(int key, int[] a) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == key)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] wl = In.readInts(args[0]);
        int c = 0;
        Date startDate = new Date();
        long startTime = startDate.getTime();
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, wl) < 0 && c < 300) {
                System.out.println(key);
                c++;
            }else if (c == 300)
                break;
        }
        Date endDate = new Date();
        long endTime = endDate.getTime();
        System.out.println("找出300个用时："
                + (endTime - startTime) / 1000 + "秒");
    }
}
