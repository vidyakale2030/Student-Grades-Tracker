package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradesTracker {
    static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> marksList = new ArrayList<>();

            int n;

            System.out.print("Enter number of students: ");
            n = sc.nextInt();

            // Input marks
            for (int i = 0; i < n; i++) {
                System.out.print("Enter marks of student " + (i + 1) + ": ");
                int marks = sc.nextInt();
                marksList.add(marks);
            }

            // Calculate highest, lowest, sum
            int highest = marksList.get(0);
            int lowest = marksList.get(0);
            int sum = 0;

            for (int marks : marksList) {
                if (marks > highest) {
                    highest = marks;
                }
                if (marks < lowest) {
                    lowest = marks;
                }
                sum += marks;
            }

            double average = (double) sum / n;

            // Display result
            System.out.println("\n----- Summary -----");
            System.out.println("Average Marks: " + average);
            System.out.println("Highest Marks: " + highest);
            System.out.println("Lowest Marks: " + lowest);
        }
    }

