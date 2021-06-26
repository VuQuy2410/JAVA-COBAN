package JAVAThanTrieu.Bai38;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai38_Date {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println("Date hiện tại: " +date);

        String fomat1= "dd/MM/yyyy";
        String fomat2= "yyyy-MM-dd";

        SimpleDateFormat simpleDateFormat= new SimpleDateFormat(fomat1);
        SimpleDateFormat simpleDateFormat2= new SimpleDateFormat(fomat2);

        System.out.println("kết quả sau định dạng 1: "+ simpleDateFormat.format(date));
        System.out.println("kết quả sau định dạng 2: "+ simpleDateFormat2.format(date));
    }
}
