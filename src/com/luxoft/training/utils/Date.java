package com.luxoft.training.utils;


public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 1900;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date (Date date) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void incDay(int days) {
        if (this.day + days <= 30) {
            this.day = this.day + days;
        }
        else if ((this.day + days > 30 && (this.day + days)%30 == 0)) {
            this.month += (this.day + days)/30;
        }
        else if (this.day + days > 30 && (this.day + days)%30 != 0) {
            int count = (this.day + days)/30;
            this.day = (this.day + days) - count*30;
            this.month = this.month + count;
        }

        if (this.month > 12 && this.month%12 == 0) {
            this.month = 12;
            this.year += this.month/12;
        }
        else if (this.month > 12 && this.month%12 != 0) {
            int count = this.month/12;
            this.month = this.month - count*12;
            this.year = this.year + count;
        }
    }

    public void decDay(int days) {
        if (this.day - days > 0) {
            this.day = this.day - days;
        }
        else if (this.day - days == 0) {
            this.month --;
            this.day = 30;
        }
        else if (this.day - days < 0 && ((30 - this.day) + days)%30 == 0) {
            this.month -= ((30 - this.day) + days)/30;
        }
        else if (this.day - days < 0 && ((30 - this.day) + days)%30 != 0) {
            int count = ((30 - this.day) + days)/30;
            this.day = 30 - Math.abs((30 - this.day) + days - count*30);
            this.month = this.month - count;
        }

        if (this.month == 0) {
            this.year --;
            this.month = 12;
        }
        else if (this.month < 0 && this.month%12 == 0) {
            this.year -= Math.abs((12-this.month)/12);
        }
        else if (this.month < 0 && this.month%12 != 0) {
            int count = Math.abs((12-this.month)/12);
            this.month = 12 - (Math.abs(12 - this.month) - count*12);
            this.year = this.year - count;
        }
    }

    public static int monthCount(Date date1, Date date2) {
        if (date1.year - date2.year == 0) {
            return date1.month - date2.month;
        }
        else {
            int count = date1.year - date2.year;
            return (date1.month + count*12) - date2.month;
        }
    }


    public String printDate() {
        if (this.day > 30) {
            int count = (this.day)/30;
            this.day = (this.day) - count*30;
            this.month = this.month + count;
        }
        if (this.month > 12) {
            int count = (this.month)/12;
            this.month = (this.month) - count*12;
            this.year = this.year + count;
        }

        String strDay = "" + this.day;
        String strMonth = "" + this.month;
        if (this.day < 10) {
            strDay = "0" + this.day;
        }
        if (this.month < 10) {
            strMonth = "0" + this.month;
        }
        return strDay + "." + strMonth + "." + this.year;
    }

}
