package com.alex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numoFStudents = in.nextInt();
        Student[] students = new Student[numoFStudents];

        for (int n = 0; n < numoFStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }


    }
}
