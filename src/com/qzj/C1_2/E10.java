package com.qzj.C1_2;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdDraw;

public class E10 {
    public static void main(String[] args) {
        VisualCounter e = new VisualCounter(24, 18);
        int i = 0;
        for (; i < 14; i++)
            e.increment();
        for (; i < 26; i++)
            e.decrement();
    }
}
