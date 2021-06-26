package JAVAThanTrieu.Bai18;

import java.util.Scanner;

public class SoDep {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n= scanner.nextInt();

        if(isSoDep(n)){
            System.out.println("n la so dep!");
        }
        else {
            System.out.println("n khong phai so dep!");
        }
    }

    /**
     * Phương thúc kiểm tra n có phải số đẹp hay ko
     * @param n là tham số truyền vào
     * @return
     */
    public static Boolean isSoDep(int n) {
        int rev=0;
        int m=n;

        while (m>0){

            int d= m%10;
            rev= rev*10 +d;
            m/=10;
        }

        return rev == n ? true: false;
    }
}
