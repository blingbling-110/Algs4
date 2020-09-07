package com.qzj.C1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStackOfStrings {
    private String[] a;
    private int i;

    public FixedCapacityStackOfStrings(int cap) {
        this.a = new String[cap];
    }

    public void push(String item) {
        a[i++] = item;
    }

    public String pop() {
        return a[--i];
    }

    public boolean isEmpty() {
        return i == 0;
    }

    public int size() {
        return i;
    }

    //测试用例
    public static void main(String[] args) {
        FixedCapacityStackOfStrings f = new FixedCapacityStackOfStrings(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                f.push(item);
            }
            else if (!f.isEmpty()) {
                StdOut.print(f.pop() + " ");
            }
        }
        StdOut.print("（栈中还剩" + f.size() + "个）");
    }
}
