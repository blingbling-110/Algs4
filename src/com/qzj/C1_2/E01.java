package com.qzj.C1_2;

import edu.princeton.cs.algs4.Point2D;

public class E01 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Point2D[] points = new Point2D[N];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point2D(Math.random(), Math.random());
            points[i].draw();
        }
        double res = 1.5;
        double dis;
        for (int i = 0; i < points.length; i++)
            for (int j = i + 1; j < points.length; j++) {
                dis = points[i].distanceTo(points[j]);
                if (res > dis)
                    res = dis;
            }
        System.out.println(res);
    }
}
