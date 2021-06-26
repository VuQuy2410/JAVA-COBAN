package JAVACoBan;

import java.util.Scanner;

public class SoChanLe {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n=0;

        boolean flag= true;

        while (true){

            System.out.println("Nhập số n: ");
            n= scanner.nextInt();

            if(n%2==0) {
                System.out.println("n la so chan");
            }else {
                System.out.println("n la so le");
            }
        }

    }
}
