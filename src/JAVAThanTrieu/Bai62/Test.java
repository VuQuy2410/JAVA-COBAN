package JAVAThanTrieu.Bai62;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student student= new Student();

        Scanner scanner= new Scanner(System.in);
        System.out.println("Tên sing viên: ");
        String fullName= scanner.nextLine();
        student.setFullName(fullName);
        System.out.println("Nhập điểm TB (0.0 -> 10.0) cho sinh viên: ");
        float grade= Float.parseFloat(scanner.nextLine());
        try {
            student.setAvgGrade(grade);
        } catch (InvalidGradeException e) {
            System.out.println("Xảy ra ngoại lệ: InvalidGradeExeption");
            System.out.println("Thông điệp: "+ e.getMessage());
        }

        showStudentInfo(student);

    }

    private static void showStudentInfo(Student student){
        System.out.println("Tên: "+ student.getFullName());
        System.out.printf("Điểm TB: %5.2f\n", student.getAvgGrade());
    }
}
