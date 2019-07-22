package com.qzj.C1_1;

public class E27 {
    static int n = 0;

    public static double binomial(int N, int k, double p) {
        n++;
        if (N == 0 && k == 0)
            return 1.0;
        if (N < 0 || k < 0)
            return 0.0;
        return (1.0 - p) * binomial(N - 1, k, p)
                + p * binomial(N - 1, k - 1, p);
    }

    public static double binomial2(int N, int k, double p) {
        //  初始化数组并确定边界
        double[][] a = new double[N + 1][k + 1];
        a[0][0] = 1.0;
        n++;
        for (int i = 1; i < a[0].length; i++) {
            a[0][i] = 0.0;
            n++;
        }
        for (int i = 1; i < a.length; i++) {
            a[i][0] = (1.0 - p) * a[i - 1][0];
            n++;
        }
        //  从边界向内计算
        for (int i = 1; i < a.length; i++)
            for (int j = 1; j < a[0].length; j++) {
                a[i][j] = (1.0 - p) * a[i - 1][j] + p * a[i - 1][j - 1];
                n++;
            }
        return a[N][k];
    }

    public static void main(String[] args) {
//        System.out.println(binomial(100, 50, 0.25));
        System.out.println(binomial2(100, 50, 0.25));
        System.out.println(n);
    }
}
