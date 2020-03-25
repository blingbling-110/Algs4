package com.qzj.C1_2;

import edu.princeton.cs.algs4.StdOut;

public class SmartDate {
    private int month;
    private int day;
    private int year;

    public SmartDate(int y, int m, int d) {
        if (y < 1 || m < 1 || m > 12 || d < 1 || d > 31)
            throw new IllegalArgumentException();
        else if (d == 31 && m != 1 && m != 3 && m != 5 && m != 7 && m != 8 && m != 10 && m != 12)
            throw new IllegalArgumentException();
        else if ((y % 4 != 0 && m == 2 && d > 28) || (y % 4 == 0 && m == 2 && d > 29))
            throw new IllegalArgumentException();
        this.month = m;
        this.day = d;
        this.year = y;
    }

    public SmartDate(String date) {
        this(Integer.parseInt(date.split("/")[2]), Integer.parseInt(date.split("/")[0]), Integer.parseInt(date.split("/")[1]));
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return this.getYear() + "-" + this.getMonth() + "-" + this.getDay();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        SmartDate that = (SmartDate) obj;
        if (this.getMonth() != that.getMonth())
            return false;
        if (this.getDay() != that.getDay())
            return false;
        if (this.getYear() != that.getYear())
            return false;
        return true;
    }

    public static void main(String[] args) {
        SmartDate smartDate =  new SmartDate(2020, 3, 24);
        StdOut.println(smartDate + " " + smartDate.dayOfTheWeek());
        StdOut.println(new SmartDate(2019, 2, 29));
    }

    public String dayOfTheWeek() {
        //2000年1月1日为周六,以此为基准计算星期，且假定时间是21世纪
        int dY = this.year - 2000;
        int dM = this.month - 1;
        int dD = this.day - 1;
        switch (dM) {
            case 0:
                break;
            case 1:
                dM = 31;
                break;
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                if (dY % 4 == 0) {
                    dM = dM * 30 + dM / 2;
                    break;
                }else {
                    dM = dM * 30 + dM / 2 - 1;
                    break;
                }
            case 2:
            case 4:
            case 6:
                if (dY % 4 == 0) {
                    dM = dM * 30 + dM / 2 - 1;
                    break;
                }else {
                    dM = dM * 30 + dM / 2 - 2;
                    break;
                }
        }
        switch ((dY * 365 + (int)Math.ceil(dY / 4.0) + dM + dD) % 7) {
            case 0:
                return "Saturday";
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            default:
                return "error";
        }
    }
}
