package JAVAThanTrieu.Bai37;

import java.io.File;
import java.io.IOException;

public class Bai37 {
    // thao tác với file, thư mục
    public static void main(String[] args) {
        File file= new File("D://DocGhiFile//out.txt");
        File newFile= new File("D://DocGhiFile//OUT.TXT");

        // Đổi tên
//        file.renameTo(newFile);

        // xóa file
//        newFile.delete();

        // tạo nhiều thư nục
//        file.mkdirs();

        // tạo file
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
