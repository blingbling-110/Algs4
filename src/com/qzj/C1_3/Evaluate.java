package com.qzj.C1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;
import java.util.regex.Pattern;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("+"))
                ops.push(s);
            else if (s.equals("-"))
                ops.push(s);
            else if (s.equals("*"))
                ops.push(s);
            else if (s.equals("/"))
                ops.push(s);
            else if (s.equals("sqrt"))
                ops.push(s);
            else if (Pattern.matches("\\d+\\.?\\d*", s))
                vals.push(Double.parseDouble(s));
            else if (s.equals(")")) {
                String op = ops.pop();
                double val = vals.pop();
                if (op.equals("+"))
                    val += vals.pop();
                else if (op.equals("-"))
                    val = vals.pop() - val;
                else if (op.equals("*"))
                    val *= vals.pop();
                else if (op.equals("/"))
                    val = vals.pop() / val;
                else if (op.equals("sqrt"))
                    val = Math.sqrt(val);
                vals.push(val);
            }
        }
        StdOut.println(vals.pop());
    }
}
