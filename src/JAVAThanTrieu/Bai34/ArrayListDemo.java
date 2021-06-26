package JAVAThanTrieu.Bai34;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayLists = new ArrayList<>();

        String nam = "Nam";
        String hoa = "Hòa Anh";
        String quy = "Quý";

        arrayLists.add(nam);
        arrayLists.add(hoa);
        arrayLists.add(1, quy);
        arrayLists.add(2, "Toan");
        arrayLists.add("Nam");
        arrayLists.add("Quý DZ");


        System.out.println("Hiển thị ArrList: ");
        for (String arr : arrayLists) {
            System.out.println(arr);
        }

        System.out.println(arrayLists.size());

        // Sửa
//        arrayLists.set(2, "Vũ");

        // Xóa phần tử đàu tiên
//        arrayLists.remove("Nam");

        // Xóa hết phần tử mảng
//        arrayLists.clear();

        // Xóa hêt phanaff tử tên "Nam"
//        arrayLists.removeAll(Collections.singleton(nam));
        System.out.println("Mảng đã sửa: ");
        for (int i = 0; i < arrayLists.size(); i++) {
            System.out.println(arrayLists.get(i));
        }

        // Xuất ra chỉ số đầu tiên
        System.out.println("Index of Nam: "+ arrayLists.indexOf("Nam"));

        // Xuất ra chỉ số đầu tiên xét từ cuối lên
        System.out.println("Last index of Nam: "+ arrayLists.lastIndexOf("Nam"));

        // kiểm tra mảng có rỗng hay ko
        System.out.println(arrayLists.isEmpty());

        // Chuyển ArrayList sang Mảng

        String arr[]= new String[arrayLists.size()];

        arrayLists.toArray(arr);

        System.out.println("ArrayList chuyển sang Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
