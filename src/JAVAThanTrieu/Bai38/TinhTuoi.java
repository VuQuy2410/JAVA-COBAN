package JAVAThanTrieu.Bai38;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TinhTuoi {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String fomat= "dd/MM/yyyy";

        SimpleDateFormat simpleDateFormat= new SimpleDateFormat(fomat);

        System.out.println("Nhập ngày tháng năm sinh: ");

        String dobStr= scanner.nextLine();

        try {
            Date birday= simpleDateFormat.parse(dobStr);
            System.out.println("Sinh nhật của bạn: "+ simpleDateFormat.format(birday));
            System.out.println("Ngày hiện tại: "+ simpleDateFormat.format(new Date()));

            float age= findAeg(birday.getTime());

            System.out.printf("Tuổi của bạn là: %5.2f\n", age);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static float findAeg(long time) {
        long currentTime= new Date().getTime();
        long hours= 365*24 + 6;
        long min = hours *60;
        long sec= min *60;
        long millisec= sec *1000;

        return 1.0f*(currentTime - time)/ (millisec);
    }
}
