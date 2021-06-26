package JAVAThanTrieu.Bai15;

import java.util.Scanner;

public class VeTamGiacVuongGocTrai {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap chieu cao h: ");
        int h= scanner.nextInt();
        if(h>0){
            for (int i= 0;
                 i<h;
                 i++){
                for(int j=0;
                    j<h;
                    j++){
                    if(i>=j){
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Chiều cao phải > 0");
        }
    }
}
