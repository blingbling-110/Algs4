package com.qzj.C1_1;

public class E17 {
    public static String exR2(int n) {
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0)
            return "";
        return s;
    }

    public static void main(String[] args) {
        //exR2(6);
        System.out.println("递归调用无法返回，引起栈溢出");
    }
}
