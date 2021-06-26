package JAVAThanTrieu.B14;

import java.util.Scanner;

public class SoDep {
    // kiểm tra 1 số có phải số đẹp hay ko
    // số đẹp là khi đảo ngược trước và sau đều giống nhau

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n= scanner.nextInt();

        int rev= 0;
        int m=n;

        while (m>0) {
            int d= m%10;
            rev= rev*10 +d;
            m/=10;
        }

        if(rev==n){
            System.out.println("Số "+ n+ " là số đẹp");
        }
        else{
            System.out.println("Số "+ n+ " là không phải số đẹp");
        }
    }

}
