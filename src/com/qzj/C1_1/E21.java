package com.qzj.C1_1;

import edu.princeton.cs.algs4.StdIn;

public class E21 {
    public static void main(String[] args) {
        System.out.println("名字\t整数1\t整数2\t商");
        while (StdIn.hasNextLine()) {
            String[] line = StdIn.readLine().split(",");
            System.out.printf("%s\t%s\t%s\t%.03f\n", line[0], line[1], line[2],
                    (Float.parseFloat(line[1]) / Float.parseFloat(line[2])));
        }
    }
}
