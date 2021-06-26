package JAVAThanTrieu.Bai21;

import java.util.Scanner;

public class DeQuyNGiaiThua {
    // Tính giao thừa GT= 1* 2 * 3 *....*n
    // n là số nguyên dương
    // Đệ quy
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n= scanner.nextInt();

        System.out.println("Giai thua cua "+ n+ " la: "+ giaoThua(n));
    }

    private static long giaoThua(int n){
        if(n== 1){
            return 1;
        }
        else {
            return n * giaoThua(n-1);
        }
    }
}
