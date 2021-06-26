package JAVAThanTrieu.Bai19;

public class Max3So {
    /**
     * Viết phương thức timg giá trị lớn nhất trong 3 số
     * Các kiểu cần hỗ trợ là: int , long, float, double
     * @param args
     */
    public static void main(String[] args) {
//        Scanner scanner= new Scanner(System.in);
//
//        System.out.println("Nhap 3 so a, b, c: ");
//        int a= scanner.nextInt();
//        int b= scanner.nextInt();
//        int c= scanner.nextInt();
//
//        System.out.println("Max 3 số "+ a+", "+  b+", "+ c+ " là: "+ max3so(a, b, c));
        System.out.println("Max của 3 số là "+ max3so(1, 2.3f, 5.33f));
    }

    /**
     * Phương thức tìm giá trị lớn nhất trong 3 số
     * Các kiểu cần hỗ trợ là: int , long, float, double
     * @param a
     * @param b
     * @param c
     * @return
     */

    public static int max3so(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static long max3so(long a, long b, long c) {
        long max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static float max3so(float a, float b, float c) {
        float max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static double max3so(double a, double b, double c) {
        double max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
