package com.qzj.C1_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

public class E32 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double l = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        double[] data = StdIn.readDoubles();
        int[] count = new int[N];// 用于统计的数组
        double length = (r - l) / N;//  每段的长度
        for (double d: data) {//    统计数据
            if (d < l || d >= r)
                continue;;
            int i = (int) ((d - l) / length);// 计算落入哪一段
            count[i]++;//   该段+1
        }
        //  开始画直方图
        int i = 0;
        int max = count[0];//   获取数量的最大值
        for (int value: count) {
            if (value > max)
                max = value;
        }
        for (double x = 0.5 / (double)N; x < 1.0; x += 1.0 / (double)N) {
            //  filledRectangle方法能够按指定中心和大小画实心矩形
            double y = (double)count[i] / 2.0 / (double)max;
            StdDraw.filledRectangle(x, y, 0.5 / (double) N, y);
            i++;
        }
    }
}
