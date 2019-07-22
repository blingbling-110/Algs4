package com.qzj.C1_1;

public class E25 {
    public static void main(String[] args) {
        System.out.println("(1)基础步骤:求证gcd(p,q)=gcd(q,r)\n" +
                "证：令p=a*q+r,其中p、a、q、r均为非负整数。\n" +
                "设整数d|p、d|q,则d|(p-a*q),得p与q的公约数和q与r的公约数相同。\n" +
                "设整数d|q、d|r,则d|(a*q+r),得q与r的公约数和p与r的公约数相同。" +
                "基于上述两点得gcd(p,q)=gcd(q,r)。\n" +
                "(2)归纳步骤：设有gcd(p,q)=gcd(q,r)，求证gcd(q,r)=gcd(r, q mod r)\n" +
                "证：由gcd(p,q)=gcd(q,r)可得d|p、d|q、d|r、p=a*q+r。\n" +
                "由于有q=(q/r)*r+(q mod r)、d|q、d|r，所以有d|(q mod r)，" +
                "所以有gcd(q,r)=gcd(r,q mod r)。\n\n" +
                "参考资料：https://www.cnblogs.com/longjin2018/p/9848631.html");
    }
}
