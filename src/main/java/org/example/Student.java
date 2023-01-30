package org.example;

import java.util.*;
import java.util.logging.Logger;

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
        Logger l=Logger.getLogger("com.api.jar");
        gpa = update;
        String det="The Student " + stuName + " GPA has been updated to " + gpa + "\n";
        l.info(det);
    }

    public String getDetails() {
        String details;
        details = stuName + " has GPA of " + gpa + " and grade of " + grade +"\n";
        return details;
    }

    public static void main(String[] args) {
        int gPA=0;
        Scanner sc = new Scanner(System.in);
        Logger l=Logger.getLogger("com.api.jar");

        l.info("Enter the Student's Name:");
        String studentName = sc.next();
        l.info("Enter the Student's GPA :");
        gPA = sc.nextInt();
        l.info("Enter the Gradelevel of the student:");
        char gradelevel = sc.next().charAt(0);

        Student s1 = new Student(studentName, gPA, gradelevel);

        l.info("choose a option");
        l.info("1.Update GPA \n 2.Details \n");
        int ch = sc.nextInt();

        switch (ch) {
            case 1: {
                l.info("Enter the Updated GPA:\n");
                int update = sc.nextInt();
                s1.updateGPA(update);
                break;
            }
            case 2: {
                l.info(s1.getDetails());
                break;
            }
            default: {
                break;
            }
        }
        sc.close();
    }
}
