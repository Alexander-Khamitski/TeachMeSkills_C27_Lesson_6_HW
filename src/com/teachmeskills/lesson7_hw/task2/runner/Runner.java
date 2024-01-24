package com.teachmeskills.lesson7_hw.task2.runner;

import com.teachmeskills.lesson7_hw.task2.student.Student;

public class Runner {
    public static void main(String[] args) {
        Student student1 = new Student(
                "Астапчик", "Артём", "Male", "KB123456", "C27");
        Student student2 = new Student(
                "Илькевич", "Алина", "Female", "KB123457", "C27");
        Student student3 = new Student(
                "Иргалиева", "Анастасия", "Female", "KB123458", "C27");
        Student student4 = new Student(
                "Каральчук", "Артём", "Male", "KB123459", "C27");
        Student student5 = new Student(
                "Крайко", "Никита", "Male", "KB123460", "C27");
        Student student6 = new Student(
                "Манеев", "Олег", "Male", "KB123461", "C27");
        Student student7 = new Student(
                "Михновецкий", "Иван", "Male", "KB123462", "C27");
        Student student8 = new Student(
                "Паляница", "Кирилл", "Male", "KB123463", "C27");
        Student student9 = new Student(
                "Рябухин", "Руслан", "Male", "KB123464", "C27");
        Student student10 = new Student(
                "Саркисов", "Евгений", "Male", "KB123465", "C27");
        Student student11 = new Student(
                "Свинко", "Павел", "Male", "KB123466", "C27");
        Student student12 = new Student(
                "Семенчик", "Руслан", "Male", "KB123467", "C27");
        Student student13 = new Student(
                "Третяк", "Руслан", "Male", "KB123468", "C27");
        Student student14 = new Student(
                "Хамицкий", "Александр", "Male", "KB123469", "C27");
        Student student15 = new Student(
                "Чаботько", "Даниил", "Male", "KB123470", "C27");
        Student student16 = new Student(
                "Шубин", "Алексей", "Male", "KB123471", "C27");
        Student student17 = new Student(
                "Колос", "Владислав", "Male", "KB123472", "C27");

        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9,
                student10, student11, student12, student13, student14, student15, student16, student17};

        for (Student student : students) {
            System.out.println(student.getStudentInfo());
        }
    }
}
