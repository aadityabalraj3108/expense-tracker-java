package com.expensetracker;

class Expense {
    double amount;
    String category;
    String note;

    Expense(double amount, String category, String note) {
        this.amount = amount;
        this.category = category;
        this.note = note;
    }

    void display() {
        System.out.println("Amount: ₹" + amount +
                " | Category: " + category +
                " | Note: " + note);
    }
}