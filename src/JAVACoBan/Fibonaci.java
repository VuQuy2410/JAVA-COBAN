package JAVACoBan;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

//        Tìm số fibo thứ n
//        while (true){
//            System.out.print("nhap so Fibo thu n can tim: ");
//            int n= scanner.nextInt();
//            System.out.println("So Fibo thu n la: "+ fibonaci(n));
//        }

//        Tìm n số fibo đầu tiên

        while (true){
            System.out.print("Nhập n ");
            int n= scanner.nextInt();
            System.out.println("N số fibo đầu tiên là: ");
            for(int i=0; i<n; i++) {
                System.out.println("Fibo["+ i+ "]= "+ fibonaci(i));
            }
        }
    }

    // tính số fibonaci thứ n

    public static int fibonaci(int n) {
        int f0=0;
        int f1=1;
        int fn=1;

        if(n<0){
            return -1;
        }
        else if(n == 0|| n==1) {
            return n;
        }
        else{
            for(int i=2; i<n; i++){
                f0=f1;
                f1=fn;
                fn= f0+f1;
            }
        }
        return fn;
    }
}
