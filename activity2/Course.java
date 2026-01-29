public class Course {
    String courseCode;
    String courseTitle;
    Student[] enrolledStudents;
    int enrolledStudent = 0;
    static String schoolName = "My University";
    public Course(String course, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.enrolledStudents = new Student[50];
    }
    public void enrollStudent(Student student) {
        if (enrollmentCount < enrolledStudents.length) {
            enrolledStudents[enrolledCount] = student;
            enrollmentCount++;
        }
    }

}
