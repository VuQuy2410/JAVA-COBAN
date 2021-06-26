package JAVAThanTrieu.Bai21;

import java.util.Scanner;

public class DeQuyFibonaci {
    // Tính fibonaci n= fibo(n-1) + fibo(n-1)
    // n là số nguyên dương
    // Đệ quy
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n= scanner.nextInt();

        System.out.println("Fibo cua "+ n+ " la: "+ fibo(n));
    }

    private static long fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}
