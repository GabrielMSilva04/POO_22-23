package ex2;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Gradebook {
    private List<Student> students;
    
    IGradeCalculator calculator = new SimpleGradeCalculator();

    public Gradebook() {
        this.students = new ArrayList<>();
    }

    public void load(String filename) {
        System.out.println("Text file:");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                String name = parts[0];
                List<Double> scores = new ArrayList<>();
                for (int i = 1; i < parts.length; i++) {
                    scores.add(Double.parseDouble(parts[i]));
                }
                System.out.println("Name: " + name);
                System.out.println("Scores: " + scores);

                Student student = new Student(name, scores);
                this.students.add(student);
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

    public void addStudent(Student student) {
        this.students.add(student);
        System.out.println("Student added: " + student.getName());
    }

    public void removeStudent(String name) {
        for (Student student : this.students) {
            if (student.getName().equals(name)) {
                this.students.remove(student);
                break;
            }
        }
        System.out.println("Student removed: " + name);
    }

    public Student getStudent(String name) {
        for (Student student : this.students) {
            if (student.getName().equals(name)) {
                System.out.println("Student got: " + student.getName());
                return student;
            }
        }
        return null;
    }

    public double calculateAverageGrade(String name) {
        for (Student student : this.students) {
            if (student.getName().equals(name)) {
                List<Double> grades = student.getGrades();
                return calculator.calculate(grades);
            }
        }
        return 0.0;
    }

    public void printAllStudents() {
        for (Student student : this.students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Scores: " + student.getGrades());
        }
    }

}
