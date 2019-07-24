package com.qzj.C1_1;

import edu.princeton.cs.algs4.*;

import java.util.Arrays;
import java.util.Date;

public class BinarySearch {
    public  static int rank(int key, int[] a) {
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
        int c = 0;
        Date startDate = new Date();
        long startTime = startDate.getTime();
        while (!StdIn.isEmpty()) {
            //  读取键值，如果不存在于白名单中则将其打印
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0 && c < 300) {
                StdOut.println(key);
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
