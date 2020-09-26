package com.qzj.C1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class LinkedListStack<Item> {
    private class LinkedList {
        Item item;
        LinkedList next;
    }

    private LinkedList first;
    private int num;

    public void push(Item item) {
        LinkedList second = first;
        first = new LinkedList();
        first.item = item;
        first.next = second;
        num++;
    }

    public Item pop() {
        Item ret = first.item;
        first = first.next;
        num--;
        return ret;
    }

    public boolean isEmpty() {
        return num == 0;
    }

    public int size() {
        return num;
    }

    //测试用例
    public static void main(String[] args) {
        LinkedListStack<String> f = new LinkedListStack<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                f.push(item);
            }
            else if (!f.isEmpty()) {
                StdOut.print(f.pop() + " ");
            }
        }
        StdOut.println("（栈中还剩" + f.size() + "个）");
    }
}
