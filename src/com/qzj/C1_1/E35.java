package com.qzj.C1_1;

import edu.princeton.cs.algs4.StdIn;

public class E35 {
    public static void main(String[] args) {
        int SIDES = 6;
        double[] dist = new double[2 * SIDES + 1];
        for (int i = 1; i <= SIDES; i++)
            for (int j = 1; j <= SIDES; j++)
                dist[i + j] += 1.0;
        for (int k = 2; k <= 2 * SIDES; k++)
            dist[k] /= 36.0;
        double[] exp = new double[2 * SIDES + 1];
        int e1 = 0;
        int e2 = 0;
        int N = StdIn.readInt();
        for (int n = N; n > 0; n--) {
            e1 = (int) (Math.random() * SIDES) + 1;
            e2 = (int) (Math.random() * SIDES) + 1;
            exp[e1 + e2] += 1.0;
        }
        for (int k = 0; k <= 2 * SIDES; k++)
            exp[k] /= (double)N;
        for (int i = 1; i <= SIDES; i++)
            for (int j = 1; j <= SIDES; j++)
                System.out.printf("%d + %d 经验数据：%.03f 准确数据：%.03f\n",
                        i, j, exp[i + j], dist[i + j]);
    }
}
