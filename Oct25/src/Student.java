import java.io.Serializable;

public class Student implements Serializable {
    private int rollno;
    private String sname;
    private String course;
    private double attendance_percentage;
    private double score;

    public Student() {
    }

    public Student(int rollno, String sname, String course, double attendance_percentage, double score) {
        this.rollno = rollno;
        this.sname = sname;
        this.course = course;
        this.attendance_percentage = attendance_percentage;
        this.score = score;
    }

    public double getAttendance_percentage() {
        return attendance_percentage;
    }

    public String calculateGrade() throws LowAttendanceException {
        if (attendance_percentage < 60) {
            throw new LowAttendanceException("Attendance less than 60% for student: " + sname);
        }

        if (score >= 90) return "A+";
        else if (score >= 80) return "A";
        else if (score >= 70) return "B";
        else if (score >= 60) return "C";
        else return "F";
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", sname='" + sname + '\'' +
                ", course='" + course + '\'' +
                ", attendance_percentage=" + attendance_percentage +
                ", score=" + score +
                '}';
    }
}
