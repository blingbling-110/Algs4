package com.qzj.C1_1;

public class E24 {
    public static int Euclid(int p, int q) {
        if (p < q) {
            int m = p;
            p = q;
            q = m;
        }
        System.out.println(p + " " + q);
        int nq = p % q;
        if (nq == 0)
            return q;
        else
            return Euclid(q, nq);
    }

    public static void main(String[] prgs) {
        System.out.println(Euclid(105, 24));
        System.out.println(Euclid(1111111, 1234567));
    }
}
