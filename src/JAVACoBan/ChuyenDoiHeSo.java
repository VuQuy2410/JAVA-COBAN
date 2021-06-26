package JAVACoBan;

import java.util.Scanner;

public class ChuyenDoiHeSo {
    public static final char CHAR_55 = 55;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập số cần chuyển: ");
            int n = scanner.nextInt();
            int b = 0;
            boolean flag = true;

            do {
                flag = true;
                System.out.println("Nhập Hệ Số Cần Chuyển ( 2 hoặc 16): ");
                b = scanner.nextInt();

                switch (b) {
                    case 2:
                        System.out.println("Kết quả chuyển sang hệ 2 là: " + heSo(n, b));
                        break;
                    case 16:
                        System.out.println("Kết quả chuyển sang hệ 16 là: " + heSo(n, b));
                        break;
                    default:
                        flag = false;
                        System.out.println("Hệ số cần chuyển không hợp lệ!");
                        break;

                }

            } while (!flag);

        }
    }

    public static String heSo(int n, int b) {
        if (n < 0 || b < 2 || b > 16) {
            return "";
        }

        StringBuilder st = new StringBuilder();
        int m;
        int d = n;

        while (d > 0) {
            if (b > 10) {
                m = d % b;
                if (m >= 10) {
                    st.append((char) (CHAR_55 + m));
                } else {
                    st.append(m);
                }
            } else {
                m = d % b;
                st.append(m);
            }
            d /= b;
        }

        return st.reverse().toString();
    }
}
