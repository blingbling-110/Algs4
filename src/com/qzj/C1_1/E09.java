package com.qzj.C1_1;

import edu.princeton.cs.algs4.StdIn;

public class E09 {
    public static void main(String[] args) {
        System.out.print("请输入一个正整数：");
        int N = StdIn.readInt();
        String s = "";
        while (N > 0) {
            s = (N % 2) + s;
            N /= 2;
        }
        System.out.println("二进制表示：" + s);
    }
}
