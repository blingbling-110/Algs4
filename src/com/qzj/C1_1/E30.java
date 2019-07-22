package com.qzj.C1_1;

import edu.princeton.cs.algs4.StdIn;

public class E30 {
    public static int Euclid(int p, int q) {
        if (p < q) {
            int m = p;
            p = q;
            q = m;
        }
        int nq = p % q;
        while (nq != 0) {
            p = q;
            q = nq;
            nq = p % q;
        }
        return q;
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        boolean[][] a = new boolean[N][N];
        for (boolean b: a[0]) {
            b = false;
        }
        for (boolean[] b: a) {
            b[0] = false;
        }
        for (int i = 1; i < a.length; i++)
            for (int j = 1; j < a.length; j++) {
                if (Euclid(i, j) == 1)
                    a[i][j] = true;
                else
                    a[i][j] = false;
            }
        for (boolean[] b: a) {
            for (boolean b2: b)
                System.out.print(b2 + " ");
            System.out.println("");
        }
    }
}
