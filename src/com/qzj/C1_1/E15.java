package com.qzj.C1_1;

public class E15 {
    public static int[] histogram(int[] a, int M) {
        int[] r = new int[M];
        for (int i = 0; i < M; i++) {
            int c = 0;
            for (int ai : a) {
                if (ai == i)
                    c++;
            }
            r[i] = c;
        }
        return r;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 4, 5, 5};
        int[] res = histogram(arr, 6);
        for (int ri: res) {
            System.out.println(ri);
        }
    }
}
