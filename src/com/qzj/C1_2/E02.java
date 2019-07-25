package com.qzj.C1_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;

public class E02 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Interval1D[] intervals = new Interval1D[N];
        String[] input;
        for (int i = 0; i < N; i++) {
            input = StdIn.readLine().split(" ");
            intervals[i] = new Interval1D(
                    Double.parseDouble(input[0]),
                    Double.parseDouble(input[1]));
        }
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (intervals[i].intersects(intervals[j]))
                    System.out.println(intervals[i].toString()
                            + " " + intervals[j]);
    }
}
