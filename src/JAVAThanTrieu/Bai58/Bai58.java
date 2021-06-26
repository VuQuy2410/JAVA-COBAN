package JAVAThanTrieu.Bai58;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai58 {
    public static void main(String[] args) {

        SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
        String dateString = "27/05/2025";

        // chuyển đổi String sang đối tượng date
        // dòng code dưới đây có thể xảy ra ngoại lệ

        Date myBirthday= null;
        try {
            myBirthday = dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Đối tượng date hoàn chỉnh: "+ dateFormat.format(myBirthday));

        System.out.println("Thực hiện các câu lệnh tiếp theo...");
//        int[] numbers= {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int index= 100;
//        if (index >=0 && index<= numbers.length-1){
//            System.out.println("Phần tử tại vị trí "
//                    + index+ " là: "+ numbers[index]);
//        }
//        else {
//            System.out.println("Chỉ số của mảng không hợp lệ: "+ index);
//            System.out.println("Chỉ số tối đa: "+ (numbers.length-1));
//        }
    }
}
