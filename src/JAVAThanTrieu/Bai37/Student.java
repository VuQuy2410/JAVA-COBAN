package JAVAThanTrieu.Bai37;

public class Student {
    private String studentId;
    private String fullName;
    private int age;
    private float avgGrade;
    private String address;
    private String email;

    public Student() {
    }

    public Student(String studentId, String fullName, int age, float avgGrade, String address, String email) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.age = age;
        this.avgGrade = avgGrade;
        this.address = address;
        this.email = email;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(float avgGrade) {
        this.avgGrade = avgGrade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", avgGrade=" + avgGrade +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
