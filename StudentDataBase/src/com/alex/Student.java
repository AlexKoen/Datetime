package com.alex;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 800;
    private static int id = 1000;


    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println(" 1- First year \n 2- for Second year\n 3- for Third year\n 4- for fourth year Enter grade level");
        this.gradeYear = in.nextInt();

        setStudentID();

//        System.out.println(firstName + " " + lastName + " " +
//                "\nYear" + gradeYear +
//                "\n" + "StudentID " + studentID);

    }

    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enroll() {
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n***" + course + "***";
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);


//        System.out.println("Enrolled in: " + courses);
//        System.out.println("Tuition balance: R " + tuitionBalance);
    }

    public void viewBlance() {
        System.out.println("Your balance is: R " + tuitionBalance);

    }

    public void payTuition() {
        viewBlance();
        System.out.println("Enter your payment: R");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of R" + payment);
        viewBlance();
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudentID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: R" + tuitionBalance;

    }

}

