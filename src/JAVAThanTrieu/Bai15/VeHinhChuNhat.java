package JAVAThanTrieu.Bai15;

import java.util.Scanner;

public class VeHinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Nhap n, m: ");
        int n= scanner.nextInt();
        int m= scanner.nextInt();

        if(n>0 && m> 0){
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
