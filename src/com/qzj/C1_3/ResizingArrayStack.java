package com.qzj.C1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class ResizingArrayStack<Item> {
    private Item[] a;
    private int index;

    public ResizingArrayStack(int cap) {
        this.a = (Item[]) new Object[cap];
    }

    public void push(Item item) {
        if (index > a.length - 1) {
            resize(2 * a.length);
        }
        a[index++] = item;
    }

    public Item pop() {
        Item ret = a[--index];
        a[index] = null;//避免对象游离，利于内存回收
        if (index <= a.length / 4 && index > 0) {
            resize(a.length / 2);
        }
        return ret;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public int size() {
        return index;
    }

    private void resize(int max) {
        //将现有栈移动到新的更大栈
        Item[] newStack = (Item[]) new Object[max];
        for (int i = 0; i < index; i++) {
            newStack[i] = a[i];
        }
        a = newStack;
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = index;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    //测试用例
    public static void main(String[] args) {
        ResizingArrayStack<String> f = new ResizingArrayStack<>(100);
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
        Iterator<String> itr = f.iterator();
        while (itr.hasNext()) {
            StdOut.println(itr.next());
        }
    }
}
