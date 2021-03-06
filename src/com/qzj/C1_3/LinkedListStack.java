package com.qzj.C1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class LinkedListStack<Item> implements Iterable<Item> {
    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item res = current.item;
            current = current.next;
            return res;
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class Node {
        Item item;
        Node next;
    }

    private Node first;
    private int num;

    public void push(Item item) {
        Node second = first;
        first = new Node();
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
        LinkedListStack<String> lls = new LinkedListStack<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                lls.push(item);
            }
            else if (!lls.isEmpty()) {
                StdOut.print(lls.pop() + " ");
            }
        }
        StdOut.println("（栈中还剩" + lls.size() + "个）");
    }
}
