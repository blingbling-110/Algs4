package com.qzj.C1_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdRandom;

public class E03 {
    static class I2D {
        public double xlo;
        public double xhi;
        public double ylo;
        public double yhi;
        public Interval2D i;
        public double t;
        public I2D(double lo, double hi) {
            xlo = StdRandom.uniform(lo, hi);
            xhi = StdRandom.uniform(lo, hi);
            if (xlo > xhi) {
                t = xlo;
                xlo = xhi;
                xhi = t;
            }
            ylo = StdRandom.uniform(lo, hi);
            yhi = StdRandom.uniform(lo, hi);
            if (ylo > yhi) {
                t = ylo;
                ylo = yhi;
                yhi = t;
            }
            i = new Interval2D(new Interval1D(xlo, xhi),
                    new Interval1D(ylo, yhi));
        }
    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);
        I2D[] is = new I2D[N];
        int intersects = 0;
        int contains = 0;
        for (int i = 0; i < N; i++) {
            is[i] = new I2D(min, max);
            is[i].i.draw();
        }
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++) {
                if (is[i].i.intersects(is[j].i)) {
                    intersects++;
                    if ((is[i].xlo <= is[j].xlo
                            && is[i].xhi >= is[j].xhi
                            && is[i].ylo <= is[j].ylo
                            && is[i].yhi >= is[i].yhi )
                            || (is[j].xlo <= is[i].xlo
                            && is[j].xhi >= is[i].xhi
                            && is[j].ylo <= is[i].ylo
                            && is[j].yhi >= is[i].yhi))
                        contains++;
                }
            }
        System.out.println("相交的间隔对数量：" + intersects);
        System.out.println("有包含关系的间隔对数量：" + contains);
    }
}
