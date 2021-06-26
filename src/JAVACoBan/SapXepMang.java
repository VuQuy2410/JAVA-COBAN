package JAVACoBan;

import java.util.Scanner;

public class SapXepMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n phần tử: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        // Nhap
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]= ");
            arr[i] = scanner.nextInt();
        }
        // Sap xep tang dan
        for (int i = 0; i < n -1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]){
                    int m= arr[i];
                    arr[i]= arr[j];
                    arr[j]= m;
                }
            }
        }
        // Xuat
        System.out.println("Day sap xep tang dan la: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
