import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Amit", "MCA", 75, 85));
        students.add(new Student(2, "Rahul", "MCA", 55, 70));
        students.add(new Student(3, "Sneha", "MCA", 90, 95));
        students.add(new Student(4, "Rohit", "MCA", 65, 60));
        students.add(new Student(5, "Priya", "MCA", 50, 80));
        students.add(new Student(6, "Anuj", "MCA", 85, 75));
        students.add(new Student(7, "Sahil", "MCA", 95, 88));
        students.add(new Student(8, "Vivek", "MCA", 70, 92));
        students.add(new Student(9, "Vedant", "MCA", 45, 68));
        students.add(new Student(10, "Neha", "MCA", 80, 77));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            for (Student s : students) {
                oos.writeObject(s);
            }
            System.out.println("Students saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Student> deserializedStudents = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.dat"))) {
            for (int i = 0; i < 10; i++) {
                deserializedStudents.add((Student) ois.readObject());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        deserializedStudents.sort((s1, s2) -> Double.compare(s2.getAttendance_percentage(), s1.getAttendance_percentage()));

        for (Student s : deserializedStudents) {
            try {
                System.out.println(s + " Grade: " + s.calculateGrade());
            } catch (LowAttendanceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
