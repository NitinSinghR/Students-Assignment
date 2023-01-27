package org.example;

import java.util.*;

class Student {
    private String stuName;
    private int gpa;
    private char grade;

    public Student(String stuName, int gpa, char grade) {
        this.stuName = stuName;
        this.gpa = gpa;
        this.grade = grade;
    }

    public void updateGPA(int update) {
        gpa = update;
        System.out.println("The Student " + stuName + " GPA has been updated to " + gpa + "\n");
    }

    public String getDetails() {
        String details;
        details = stuName + " has GPA of " + gpa + " and grade of " + grade +"\n";
        return details;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Student's Name:");
        String studentName = sc.next();
        System.out.println("Enter the Studenr's GPA :");
        int gPA = sc.nextInt();
        System.out.println("Enter the Gradelevel of the student:");
        char gradelevel = sc.next().charAt(0);

        Boolean loop = true;

        Student s1 = new Student(studentName, gPA, gradelevel);

        System.out.println("choose a option");
        System.out.println("1.Update GPA \n 2.Details \n");
        int ch = sc.nextInt();

        switch (ch) {
            case 1: {
                System.out.println("Enter the Updated GPA:\n");
                int update = sc.nextInt();
                s1.updateGPA(update);
                break;
            }
            case 2: {
                System.out.println(s1.getDetails());
                break;
            }
            default: {
                loop = false;
            }
        }
        sc.close();
    }
}
