package com.qzj.C1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class LinkedListQueue<Item> implements Iterable<Item> {
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
    private Node last;
    private int num;

    public void enqueue(Item item) {
        Node secondLast = last;
        last = new Node();
        last.item = item;
        if (!isEmpty()) {
            secondLast.next = last;
        }else {
            first = last;
        }
        num++;
    }

    public Item dequeue() {
        Item ret = first.item;
        first = first.next;
        num--;
        if (isEmpty()) {
            last = first;
        }
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
        LinkedListQueue<String> llq = new LinkedListQueue<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                llq.enqueue(item);
            }
            else if (!llq.isEmpty()) {
                    StdOut.print(llq.dequeue() + " ");
            }
        }
        StdOut.println("（队列中还剩" + llq.size() + "个）");
    }
}
