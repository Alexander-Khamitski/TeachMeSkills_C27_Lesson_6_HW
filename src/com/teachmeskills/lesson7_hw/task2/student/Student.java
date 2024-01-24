package com.teachmeskills.lesson7_hw.task2.student;

public class Student {

    private String firstName;
    private String lastName;
    private String gender;
    private String passportNumber;
    private String groupNumber;

    public Student(String firstName, String lastName, String gender, String passportNumber, String groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.passportNumber = passportNumber;
        this.groupNumber = groupNumber;
    }

    public String getStudentInfo() {
        return String.format("Firstname: %s; Lastname: %s; Gender: %s; Passport number: %s; Group: %s;",
                firstName, lastName, gender, passportNumber, groupNumber);
    }
}
