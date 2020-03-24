package com.qzj.C1_2;

public class Rational {
    private final long numerator;
    private final long denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long getGCD(long a, long b) {
        a = Math.max(a, b);
        b = Math.min(a, b);
        long r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public Rational plus(Rational b) {
        long newNumerator = this.numerator * b.denominator + this.denominator * b.numerator;
        long newDenominator = this.denominator * b.denominator;
        long gcd = getGCD(newNumerator, newDenominator);
        return new Rational((int)(newNumerator / gcd), (int)(newDenominator / gcd));
    }

    public Rational minus(Rational b) {
        long newNumerator = this.numerator * b.denominator - this.denominator * b.numerator;
        long newDenominator = this.denominator * b.denominator;
        long gcd = getGCD(newNumerator, newDenominator);
        return new Rational((int)(newNumerator / gcd), (int)(newDenominator / gcd));
    }

    public Rational times(Rational b) {
        long newNumerator = this.numerator * b.numerator;
        long newDenominator = this.denominator * b.denominator;
        long gcd = getGCD(newNumerator, newDenominator);
        return new Rational((int)(newNumerator / gcd), (int)(newDenominator / gcd));
    }

    public Rational divides(Rational b) {
        long newNumerator = this.numerator * b.denominator;
        long newDenominator = this.denominator * b.numerator;
        long gcd = getGCD(newNumerator, newDenominator);
        return new Rational((int)(newNumerator / gcd), (int)(newDenominator / gcd));
    }
}
