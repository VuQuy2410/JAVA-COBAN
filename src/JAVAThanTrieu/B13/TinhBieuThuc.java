package JAVAThanTrieu.B13;

import java.util.Scanner;

// Tính giá trị biểu thức 1+ 1/2 + 1/3 + ....+ 1/n
public class TinhBieuThuc {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Nhập n: ");
        int n= scanner.nextInt();

        double sum= 0;

        for(int i=1; i<=n; i++){
            sum+=(double) (1.0/i);
        }

        System.out.println("Tong bieu thuc la: ");
        System.out.printf("%.2f", sum);
    }
}
