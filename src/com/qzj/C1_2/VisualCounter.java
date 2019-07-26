package com.qzj.C1_2;

import edu.princeton.cs.algs4.StdDraw;

public class VisualCounter {
    private int N;
    private int max;
    private int n;//    操作次数
    private int c;//    计数器的值

    public VisualCounter(int N, int max) {
        this.N = N;
        this.max = max;
        //  初始化
        n = 0;
        c = 0;
        StdDraw.setXscale(0, N + 1);
        StdDraw.setYscale(0, max + 1);
        StdDraw.setPenRadius(0.05);
    }

    public void increment() {
        if (n < N && c < max) {
            n++;
            c++;
            StdDraw.point(n, c);
        }else {
            System.out.println("操作失败");
            return;
        }
    }

    public void decrement() {
        if (n < N){
            n++;
            c--;
            StdDraw.point(n, c);
        }else {
            System.out.println("操作失败");
            return;
        }
    }
}
