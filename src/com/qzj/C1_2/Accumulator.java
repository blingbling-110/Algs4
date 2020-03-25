package com.qzj.C1_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Accumulator {
    private double m;
    private double s;
    private int N;

    public void addDatavalue(double x) {
        N++;
        s = s + 1.0 * (N - 1) / N * (x - m) * (x - m);
        m = m + (x - m) / N;
    }

    public double mean() {
        return m;
    }

    public double var() {
        return s / (N - 1);
    }

    public double stddev() {
        return Math.sqrt(this.var());
    }

    public static void main(String[] args) {
        double[] doubles = StdIn.readAllDoubles();
        Accumulator accumulator = new Accumulator();
        for (double x:
                doubles) {
            accumulator.addDatavalue(x);
        }
        StdOut.println("方差：" + accumulator.var());
        StdOut.println("标准差：" + accumulator.stddev());
    }
}
