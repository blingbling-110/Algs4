package com.qzj.C1_1;

import edu.princeton.cs.algs4.StdIn;

public class E5 {
    public static void main(String[] args) {
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        if (x > 0 && x < 1 && y > 0 && y < 1)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
