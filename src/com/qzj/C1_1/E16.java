package com.qzj.C1_1;

public class E16 {
    public static String exR1(int n) {
        if (n <= 0)
            return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    public static void main(String[] args) {
        System.out.println("311361142246\n" + exR1(6 ));
    }
}
