package JAVAThanTrieu.Bai37;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DocFile {
    public static void main(String[] args) {


        File file= new File("RESULT.DAT");

        try {
            FileWriter fileWriter= new FileWriter(file, true);// thêm ở cuối file

            PrintWriter printWriter= new PrintWriter(fileWriter);

            Student nam= new Student("SV001", "Nguyễn Văn Nam",
                    20, 3.28f, "Đà Nẵng", "nam@gmail.com" );

            printWriter.println(nam.getStudentId());
            printWriter.println(nam.getFullName());
            printWriter.println(nam.getAge());
            printWriter.println(nam.getAvgGrade());
            printWriter.println(nam.getAddress());
            printWriter.println(nam.getEmail());

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Student> students= readStudentFromFile("RESULT.DAT");

        for (Student student: students) {
            System.out.println(student.toString());
        }


//        System.out.println("Hello");

//        PrintWriter myOutput = new PrintWriter(System.out);
//
//        myOutput.println("Hello");
//        myOutput.flush();

    }

    private static ArrayList<Student> readStudentFromFile(String fileName){
        ArrayList<Student> students= new ArrayList();
        try {


            Scanner scanner= new Scanner(new File(fileName));

            while (scanner.hasNextLine()){
                String id= scanner.nextLine();
                String name= scanner.nextLine();
                int age= Integer.parseInt(scanner.nextLine());
                float avg= Float.parseFloat(scanner.nextLine());
                String address= scanner.nextLine();
                String email= scanner.nextLine();

                Student student= new Student(id, name, age, avg, address, email);

                students.add(student);

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return students;
    }
}
