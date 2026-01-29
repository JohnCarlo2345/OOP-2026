public class Main {
    public static void main(String[] args) {
        System.out.println("Initial total number of students: " + student.getTotalStudents());

        Student student1 = new Student("Alice Smith", "512345");
        Student student2 = new Student("Bob Johnson", "512346");
        Student student3 = new Student("Charlie Davis", "512347");

        System.out.println("\nTotal students after creation: " + Student.getTotalstudents());

        System.out.println("\nStudent 1 Information:");
        student1.displayStudentInfo();

        System.out.println("\nSchool Name (from static method): " + Course.getSchoolName());
    }
}
