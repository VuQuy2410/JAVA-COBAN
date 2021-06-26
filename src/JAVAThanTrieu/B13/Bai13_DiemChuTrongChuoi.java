package JAVAThanTrieu.B13;

import java.util.Scanner;

// Đếm số chữ cái trong chuỗi
public class Bai13_DiemChuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str1 = scanner.nextLine();
        String str = new String();

        str = str1;
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.trim().charAt(i) >= 'a' && str.trim().charAt(i) <= 'z') {
                count++;
            }
        }

        System.out.println("Chuỗi " + str1 + " có " + count + " chữ cái!");
    }
}
