package com.qzj.C1_1;

import edu.princeton.cs.algs4.StdIn;

public class E33 {
    public static double[] inputArr() {
        String[] strings = StdIn.readLine().split(" ");
        double[] doubles = new double[strings.length];
        for (int i = 0; i < doubles.length; i++)
            doubles[i] = Double.parseDouble(strings[i]);
        return doubles;
    }

    public static void printArr(double[] a) {
        for (double d : a)
            System.out.print(d + " ");
        System.out.println("");
    }

    public static void printArr2(double[][] a) {
        for (double[] b : a) {
            for (double d : b)
                System.out.print(d + " ");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        double[] a0 = inputArr();
        double[] a1 = inputArr();
        double[] a2 = inputArr();
        double[] b0 = inputArr();
        double[] b1 = inputArr();
        double[][] a = new double[3][a0.length];
        a[0] = a0;
        a[1] = a1;
        a[2] = a2;
        double[][] b = new double[2][b0.length];
        b[0] = b0;
        b[1] = b1;
        System.out.println("向量点乘：\n" + Matrix.dot(a0, a1));
        double[][] r = Matrix.mult(a, b);
        System.out.println("矩阵和矩阵之积：");
        printArr2(r);
        double[][] r2 = Matrix.transpose(a);
        System.out.println("转置矩阵：");
        printArr2(r2);
        double[] r3 = Matrix.mult(r2, b0);
        System.out.println("矩阵和向量之积：");
        printArr(r3);
        double[] r4 = Matrix.mult(a0, b);
        System.out.println("向量和矩阵之积：");
        printArr(r4);
    }
}
