package com.qzj.C1_2;

import java.util.Date;

public class SmartDate {
    private Date date;

    public SmartDate() {
        date = new Date();
    }

    public SmartDate(long date) {
        this.date = new Date(date);
    }
}
