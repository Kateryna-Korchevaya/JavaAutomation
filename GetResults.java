package org.example;

// Клас з методом main
public class GetResults {
    public static void main(String[] args) {

        Student myStudent = new Student();
        int age = myStudent.getAge();
        System.out.println("~~~ " + age + " ~~~");
    }
}

// Клас, що описує студента
