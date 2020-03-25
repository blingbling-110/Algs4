package com.qzj.C1_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Rational {
    private long numerator;
    private long denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        long gcd = getGCD();
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public long getGCD() {
        long a = Math.max(Math.abs(this.numerator), Math.abs(this.denominator));
        long b = Math.min(Math.abs(this.numerator), Math.abs(this.denominator));
        if (b == 0)
            return 1;
        long r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public Rational plus(Rational b) {
        assert (this.numerator * b.denominator + this.denominator * b.numerator) <= Integer.MAX_VALUE &&
                (this.numerator * b.denominator + this.denominator * b.numerator) >= Integer.MIN_VALUE: "分子数值溢出";
        assert this.denominator * b.denominator <= Integer.MAX_VALUE &&
                this.denominator * b.denominator >= Integer.MIN_VALUE: "分子数值溢出";
        long newNumerator = this.numerator * b.denominator + this.denominator * b.numerator;
        long newDenominator = this.denominator * b.denominator;
        return new Rational((int)newNumerator, (int)newDenominator);
    }

    public Rational minus(Rational b) {
        assert (this.numerator * b.denominator - this.denominator * b.numerator) <= Integer.MAX_VALUE &&
                (this.numerator * b.denominator - this.denominator * b.numerator) >= Integer.MIN_VALUE: "分子数值溢出";
        assert this.denominator * b.denominator <= Integer.MAX_VALUE &&
                this.denominator * b.denominator >= Integer.MIN_VALUE: "分子数值溢出";
        long newNumerator = this.numerator * b.denominator - this.denominator * b.numerator;
        long newDenominator = this.denominator * b.denominator;
        return new Rational((int)newNumerator, (int)newDenominator);
    }

    public Rational times(Rational b) {
        assert this.numerator * b.numerator <= Integer.MAX_VALUE &&
                this.numerator * b.numerator >= Integer.MIN_VALUE: "分子数值溢出";
        assert this.denominator * b.denominator <= Integer.MAX_VALUE &&
                this.denominator * b.denominator >= Integer.MIN_VALUE: "分子数值溢出";
        long newNumerator = this.numerator * b.numerator;
        long newDenominator = this.denominator * b.denominator;
        return new Rational((int)newNumerator, (int)newDenominator);
    }

    public Rational divides(Rational b) {
        assert this.numerator * b.denominator <= Integer.MAX_VALUE &&
                this.numerator * b.denominator >= Integer.MIN_VALUE: "分子数值溢出";
        assert this.denominator * b.numerator <= Integer.MAX_VALUE &&
                this.denominator * b.numerator >= Integer.MIN_VALUE: "分子数值溢出";
        long newNumerator = this.numerator * b.denominator;
        long newDenominator = this.denominator * b.numerator;
        return new Rational((int)newNumerator, (int)newDenominator);
    }

    public boolean equals(Rational that) {
        return this.numerator == that.numerator && this.denominator == that.denominator;
    }

    public String toString() {
        if (this.numerator == 0)
            return "0";
        if (this.denominator == 1)
            return String.valueOf(this.numerator);
        return this.numerator + "/" + this.denominator;
    }

    public static void main(String[] args) {
        StdOut.print("有理数a的分子：");
        int numerator = StdIn.readInt();
        StdOut.print("有理数a的分母：");
        int denominator = StdIn.readInt();
        Rational a = new Rational(numerator, denominator);
        StdOut.print("有理数b的分子：");
        numerator = StdIn.readInt();
        StdOut.print("有理数b的分母：");
        denominator = StdIn.readInt();
        Rational b = new Rational(numerator, denominator);
        StdOut.println("加：" + a.plus(b));
        StdOut.println("减：" + a.minus(b));
        StdOut.println("乘：" + a.times(b));
        StdOut.println("除：" + a.divides(b));
        StdOut.println("比较：" + a.equals(b));
    }
}
