package com.qzj.C1_2;

import java.util.Date;

public class SmartDate {
    private Date dateObj;

    public SmartDate(int year, int month, int date) {
        if (year < 1 || month < 1 || month > 12 || date < 1 || date > 31)
            throw new IllegalArgumentException();
        else if (date == 31 && month != 1 && month != 3 && month != 5 && month != 7 && month != 8 && month != 10 && month != 12)
            throw new IllegalArgumentException();
        else if ((year % 4 != 0 && month == 2 && date > 28) || (year % 4 == 0 && month == 2 && date > 29))
            throw new IllegalArgumentException();
        this.dateObj = new Date(year, month, date);
    }

    public static void main(String[] args) {
        SmartDate smartDate = new SmartDate(2020, 4, 31);
    }
}
