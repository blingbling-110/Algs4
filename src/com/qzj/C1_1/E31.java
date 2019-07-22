package com.qzj.C1_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class E31 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        double p = StdIn.readDouble();
        //  StdDraw是Algs4中可用来绘图的类
        StdDraw.circle(0.5, 0.5, 0.5);
        StdDraw.setPenRadius(0.05);
        Point[] pa = new Point[N];
        for (int i = 0; i < pa.length; i++) {
            pa[i] = new Point(0.5 + 0.5 * Math.cos(2 * Math.PI * i / N),
                    0.5 + 0.5 * Math.sin(2 * Math.PI * i / N));
            pa[i].drawIt();
        }
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.setPenRadius(0.01);
        Line[][] la = new Line[N][N];
        for (int i = 0; i < la.length; i++)
            for (int j = 0; j < la[0].length; j++) {
                if (i == j)
                    continue;
                la[i][j] = new Line(pa[i].x, pa[i].y, pa[j].x, pa[j].y);
                //  StdRandom是Algs4中可用来生成各种随机数的类
                if (StdRandom.bernoulli(p))//   伯努利分布
                    la[i][j].drawIt();
            }
    }

    //  未实例化外部类时实例化内部类，需要定义成静态内部类
    static class Point {
        double x;
        double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void drawIt() {
            StdDraw.point(x, y);
        }
    }

    static class Line {
        double x1, y1, x2, y2;

        public Line(double x1, double y1, double x2, double y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public void drawIt() {
            StdDraw.line(x1, y1, x2, y2);
        }
    }
}
