package com.qzj.C1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class VariableCapacityStack<Item> {
    private Item[] a;
    private int index;

    public VariableCapacityStack(int cap) {
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

    //测试用例
    public static void main(String[] args) {
        VariableCapacityStack<String> f = new VariableCapacityStack<>(100);
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
