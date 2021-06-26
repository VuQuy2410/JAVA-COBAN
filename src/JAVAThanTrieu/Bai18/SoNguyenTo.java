package JAVAThanTrieu.Bai18;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n= scanner.nextInt();

        if(isSNT(n)){
            System.out.println("N la so nguyen to!");
        }else {
            System.out.println("N khong phai so nguyen to!");
        }
    }

    /**
     * Phương thức kiểm tra n có phải số nguyên tố hay không
     * @param n
     * @return
     */
    public static Boolean isSNT(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
