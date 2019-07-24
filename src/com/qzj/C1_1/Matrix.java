package com.qzj.C1_1;

public class Matrix {
    /**
     * 向量点乘
     *
     * @param x 向量x
     * @param y 向量y
     * @return x与y的点乘
     */
    static double dot(double[] x, double[] y) {
        double dot = 0.0;
        if (x.length != y.length) {
            System.out.println("输入的向量长度不等");
            return dot;
        }
        for (int i = 0; i < x.length; i++)
            dot += x[i] * y[i];
        return dot;
    }

    /**
     * 矩阵和矩阵之积
     *
     * @param a 矩阵a
     * @param b 矩阵b
     * @return a与b的积
     */
    static double[][] mult(double[][] a, double[][] b) {
        double[][] mult = null;
        if (a[0].length != b.length) {
            System.out.println("输入的向量无法相乘");
            return mult;
        }
        mult = new double[a.length][b[0].length];
        for (int i = 0; i < mult.length; i++)
            for (int j = 0; j < mult[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    mult[i][j] += a[i][k] * b[k][j];
        return mult;
    }

    /**
     * 转置矩阵
     *
     * @param a 欲转置的矩阵a
     * @return 转置后的矩阵a
     */
    static double[][] transpose(double[][] a) {
        double[][] t = new double[a[0].length][a.length];
        for (int i = 0; i < t.length; i++)
            for (int j = 0; j < t[0].length; j++)
                t[i][j] = a[j][i];
        return t;
    }

    /**
     * 矩阵和向量之积
     *
     * @param a 矩阵a
     * @param x 向量x
     * @return a与x的积
     */
    static double[] mult(double[][] a, double[] x) {
        double[] mult = null;
        if (a[0].length != x.length) {
            System.out.println("输入的矩阵和向量无法相乘");
            return mult;
        }
        mult = new double[a.length];
        for (int i = 0; i < mult.length; i++)
            for (int j = 0; j < x.length; j++)
                mult[i] = a[i][j] * x[j];
        return mult;
    }

    /**
     * 向量和矩阵之积
     *
     * @param y 向量y
     * @param a 矩阵a
     * @return y与a的积
     */
    static double[] mult(double[] y, double[][] a) {
        double[] mult = null;
        if (y.length != a.length) {
            System.out.println("输入的向量和矩阵无法相乘");
            return mult;
        }
        mult = new double[a[0].length];
        for (int i = 0; i < mult.length; i++)
            for (int j = 0; j < y.length; j++)
                mult[i] = y[j] * a[j][i];
        return mult;
    }
}
