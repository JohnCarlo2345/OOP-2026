public class Student {
    int studentId;
    String firstName;
    String middleName;
    String lastName;
    String gender;
    String email;
    public int studentTotal = 0;
    public Student(String studentId, String firstName, String lastName, String gender, String email) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
    }
    
}
