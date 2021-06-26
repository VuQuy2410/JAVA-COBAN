package JAVACoBan;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Nhap so n: ");
//            int n = scanner.nextInt();
//
//            if (isSoNguyenTo(n)) {
//                System.out.println("So nay la so nguyen to");
//            } else System.out.println("So nay la khong phai so nguyen to");
//        }
        System.out.println("Nhap so n: ");
        int n = scanner.nextInt();

        for(int i=2; i<=n; i++){
            if(isSoNguyenTo(i)) {
                System.out.println(i +" ");
            }
        }

    }

    public static boolean isSoNguyenTo(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
