package com.qzj.C1_2;

import edu.princeton.cs.algs4.StdOut;

public class Transaction {
    private String customer;
    private SmartDate date;
    private double amount;

    public Transaction(String customer, SmartDate date, double amount) {
        this.customer = customer;
        this.date = date;
        this.amount = amount;
    }

    public Transaction(String string) {
        this(string.split("\\s+")[0], new SmartDate(string.split("\\s+")[1]), Double.parseDouble(string.split("\\s+")[2]));
    }

    public String getCustomer() {
        return customer;
    }

    public SmartDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String toString() {
        return "交易客户：" + this.customer + "，交易日期：" + this.date + "，交易额：" + this.amount;
    }

    public static void main(String[] args) {
        Transaction transaction1 = new Transaction("Lily", new SmartDate(2020, 3, 24), 10.0);
        Transaction transaction2 = new Transaction("Lily", new SmartDate(2020, 3, 24), 10.0);
        StdOut.println(transaction1);
        StdOut.println(transaction1.equals(transaction2));
        StdOut.println(new Transaction("Turing 5/22/1939 11.99"));
    }

    public boolean equals(Object x) {
        if (this == x)
            return true;
        if (x == null)
            return false;
        if (this.getClass() != x.getClass())
            return false;
        Transaction that = (Transaction) x;
        if (!this.getCustomer().equals(that.getCustomer()))
            return false;
        if (!this.getDate().equals(that.getDate()))
            return false;
        if (this.getAmount() != that.getAmount())
            return false;
        return true;
    }
}
