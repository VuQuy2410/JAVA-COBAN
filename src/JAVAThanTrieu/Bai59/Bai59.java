package JAVAThanTrieu.Bai59;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bai59 {
    public static void main(String[] args) {
        File file= new File("input.txt");

        SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
        String str= "27/05/2025";


        try {
            Date birthday= dateFormat.parse(str);
            System.out.println("Sinh nhật: " + dateFormat.format(birthday));

            Scanner fileReader= new Scanner(file);
//            Date birthday= dateFormat.parse(str);
//            System.out.println("Sinh nhật: " + dateFormat.format(birthday));

        } catch (FileNotFoundException | ParseException e) {
            System.out.println(e.getMessage());
        }

        // Các câu lệnh kế tiếp phía sau
        System.out.println("Thực hiện các câu leenhk tiếp theo...");
    }
}
