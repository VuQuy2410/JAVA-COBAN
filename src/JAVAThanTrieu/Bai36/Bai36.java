package JAVAThanTrieu.Bai36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bai36 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner readFile= new Scanner(file);

        while(readFile.hasNextInt()){
            String line= readFile.nextLine();
            System.out.println(line);
        }

        readFile.close();
        // kiểm tra file có tồn tại hay ko
//        System.out.println(file.exists());
        // dung lượng file
        System.out.println(file.length());

        // tên file
        System.out.println(file.getName());

        // đường dẫn
        System.out.println(file.getAbsolutePath());
    }

}
