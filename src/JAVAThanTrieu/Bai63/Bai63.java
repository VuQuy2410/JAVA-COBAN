package JAVAThanTrieu.Bai63;

import java.util.ArrayList;

public class Bai63 {
    public static void main(String[] args) {
        // tạo danh sách bạn bè kiểu String

        ArrayList<String> friends= new ArrayList<>();
        friends.add("Linh");
        friends.add("Hương");
        friends.add("Phương");
        friends.add("Loan");

        // danh sách các con số kiểu nguyên Interger

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        ArrayList<Student> students= new ArrayList<>();
        students.add(new Student("S1"));
        students.add(new Student("S2"));
        students.add(new Student("S3"));
        students.add(new Student("S4"));


        System.out.println("Hiển thị danh sách những người bạn: ");
        showList(friends);

        System.out.println("Hiển thị danh sách các giá trị của Interger: ");
        showList(numbers);

        System.out.println("Phần tử chính giữa của danh sách những người bạn: ");
        System.out.println(getMid(friends));

        System.out.println("Phần tủ giữa các con số: " + getMid(numbers));

        Bai63 bai63= new Bai63();
        System.out.println("Người có tên sau cùng trong danh sách: "+ bai63.findMax(friends));

        System.out.println("Phần tử có giá trị lớn nhất trong các số nguyên: "+ bai63.findMax(numbers));

//        T maxStudent= bai63.findMax(students);
//        System.out.println("Max student ");
    }

    /**
     * Phương thức dùng để hiển thị danh sách các phần tử
     * của 1 kiểu bất kì
     * @param list
     * @param <T>
     */
    private static <T> void showList(ArrayList<T> list){
        for(T e: list){
            System.out.print(e+ " ");
        }
        System.out.println();
    }

    public static <T> T getMid(ArrayList<T> list){
        int mid = list.size()/2;
        return list.get(mid);
    }

    public <T extends Comparable> T findMax(ArrayList<T> list){
        if(list== null || list.size()==0){
            return null;
        }

        T max= list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).compareTo(max) >0){
                max= list.get(i);
            }
        }

        return max;
    }
}
