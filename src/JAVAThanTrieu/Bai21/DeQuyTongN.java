package JAVAThanTrieu.Bai21;

import java.util.Scanner;

public class DeQuyTongN {
    // Tính tổng S= 1+ 2+ 3+ ... + n
    // n là số nguyên dương
    // Đệ quy
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n= scanner.nextInt();

        System.out.println("Tong cua "+ n+ " la: "+ tongN(n));
    }

    private static int tongN(int n){
        if(n==1){
            return 1;
        }
        else {
            return n+ tongN(n-1);
        }
    }
}
