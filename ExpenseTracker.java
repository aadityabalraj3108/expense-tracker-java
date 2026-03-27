package com.expensetracker;

import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {

    static ArrayList<Expense> expenses = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Expense Tracker ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Spending");
            System.out.println("4. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter note: ");
                    String note = sc.nextLine();

                    expenses.add(new Expense(amount, category, note));
                    System.out.println("Expense added!");
                    break;

                case 2:
                    System.out.println("\n--- All Expenses ---");
                    for (Expense e : expenses) {
                        e.display();
                    }
                    break;

                case 3:
                    double total = 0;
                    for (Expense e : expenses) {
                        total += e.amount;
                    }
                    System.out.println("Total Spending: ₹" + total);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}