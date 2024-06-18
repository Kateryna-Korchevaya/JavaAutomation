package dz8;
import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {
    private Student headStudent;
    private final List<Student> students;
    private final List<String> tasks;
    private final List<String> completedTasks;

    public StudentsGroup(Student headStudent) {
        if (headStudent == null) {
            throw new IllegalArgumentException("Head student cannot be null");
        }
        this.headStudent = headStudent;
        this.students = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.completedTasks = new ArrayList<>();
        this.students.add(headStudent);
    }

    public Student getHeadStudent() {
        return headStudent;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public List<String> getTasks() {
        return new ArrayList<>(tasks);
    }

    public List<String> getCompletedTasks() {
        return new ArrayList<>(completedTasks);
    }

    public void changeHeadStudent(Student newHeadStudent) {
        if (newHeadStudent == null) {
            throw new IllegalArgumentException("New head student cannot be null");
        }
        if (!students.contains(newHeadStudent)) {
            throw new IllegalArgumentException("New head student must be a member of the group");
        }
        this.headStudent = newHeadStudent;
    }

    public void addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null");
        }
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void removeStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null");
        }
        if (student.equals(headStudent)) {
            throw new IllegalArgumentException("Cannot remove the head student from the group");
        }
        students.remove(student);
    }

    public void addTask(String task) {
        if (task == null || task.trim().isEmpty()) {
            throw new IllegalArgumentException("Task cannot be null or empty");
        }
        tasks.add(task);
    }

    public void markTaskAsCompleted(Student student, String task) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null");
        }
        if (task == null || task.trim().isEmpty()) {
            throw new IllegalArgumentException("Task cannot be null or empty");
        }
        if (!students.contains(student)) {
            throw new IllegalArgumentException("Student must be a member of the group");
        }
        if (!tasks.contains(task)) {
            throw new IllegalArgumentException("Task must be a part of the group's tasks");
        }
        String completionRecord = "Student ID: " + student.getId() + " completed task: " + task;
        completedTasks.add(completionRecord);
    }
}
