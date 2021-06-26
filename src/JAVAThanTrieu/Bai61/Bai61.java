package JAVAThanTrieu.Bai61;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai61 {
    public static void main(String[] args) {
//        String str= null;
//        if(str== null){
//            throw new NullPointerException("Str là null, không thể thực hiện thao tác");
//        }

        // các câu lệnh kế tiếp
        System.out.println("Các câu lệnh kế tiếp.......");

        try {
            m1();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void m1() throws ParseException {
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
        Date myBirthday = null;
        String dateString= "22/10/2021";

        try {
            myBirthday= dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            throw e;
        }

        System.out.println("Sinh nhật của tôi là: "+ dateFormat.format(myBirthday));

    }
}
