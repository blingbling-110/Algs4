package com.qzj.C1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStack<Item> {
    private Item[] a;
    private int i;

    public FixedCapacityStack(int cap) {
        this.a = (Item[]) new Object[cap];
    }

    public void push(Item item) {
        a[i++] = item;
    }

    public Item pop() {
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
        FixedCapacityStack<String> f = new FixedCapacityStack<>(100);
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
