package dz8;

public class Main {
    public static void main(String[] args) {
        Student headStudent = new Student(1, "Petro", "Karashenko");
        Student student2 = new Student(2, "Olga", "Gusinskaya");
        Student student3 = new Student(3, "Olena", "Zotova");
        Student student4 = new Student(4,"Maksim", "Dolotov");
        Student student5 = new Student(5, "Egor", "Rakitskiy");

        StudentsGroup group = new StudentsGroup(headStudent);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);

        group.addTask("Learn encapsulation");
        group.addTask("Practice Java");
        group.addTask("Practice Inherit");

        group.markTaskAsCompleted(student2, "Learn encapsulation");
        group.markTaskAsCompleted(student5, "Practice Inherit");
        group.markTaskAsCompleted(student3, "Practice Java");

        System.out.println("Head Student: " + group.getHeadStudent().getFirstName() + " " + group.getHeadStudent().getLastName());
        System.out.println("Group Students:");
        for (Student s : group.getStudents()) {
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }
        System.out.println("Tasks:");
        for (String task : group.getTasks()) {
            System.out.println(task);
        }
        System.out.println("Completed Tasks:");
        for (String completedTask : group.getCompletedTasks()) {
            System.out.println(completedTask);
        }
    }
}
