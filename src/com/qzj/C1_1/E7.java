package com.qzj.C1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class E7 {
    public static void main(String[] args) {
        char c = StdIn.readChar();
        if (c == 'a') {
            double t = 9.0;
            while (Math.abs(t - 9.0 / t) > .001)
                t = (t + 9.0 / t) / 2.0;
            StdOut.printf("%.5f\n", t);
        }
        if (c == 'b') {
            int sum = 0;
            for (int i = 1; i < 1000; i++)
                for (int j = 0; j < i; j++)
                    sum++;
            StdOut.println(sum);
        }
        if (c == 'c') {
            int sum = 0;
            for (int i = 1; i < 1000; i *= 2)
                for (int j = 1; j < 1000; j++)
                    sum++;
                StdOut.println(sum);
        }
    }
}
