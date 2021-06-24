package OOP.QLTaiLieu2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<TaiLieu> taiLieus;

    public QuanLySach() {

        taiLieus = new ArrayList<>();

        run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        int chosse = -1;
        while (chosse != 0) {
            System.out.println("Danh sach lua chon: ");
            System.out.println("0. Thoat khoi chuong trinh: ");
            System.out.println("1. Nhap tai lieu ");
            System.out.println("2. Xuat tai lieu ");
            System.out.println("3. Xoa tai lieu ");
            System.out.println("4. Sua tai lieu ");
            System.out.println("5. Tim kiem tai lieu theo ma tai lieu ");
            System.out.println("6. Tim kiem tai lieu theo keyword tai lieu ");

            boolean flag = true;

            do {
                flag = true;
                System.out.println("Vui long nhap lua chon: ");
                chosse = scanner.nextInt();

                switch (chosse) {
                    case 0:
                        break;
                    case 1:
                        add();
                        break;
                    case 2:
                        view();
                        break;
                    case 3:
                        delete();
                        break;
                    case 4:
                        edit();
                        break;
                    case 5:
                        TaiLieu taiLieu = find();
                        if (taiLieu != null) {
                            System.out.println("Tai lieu can tim la: ");
                            System.out.println(taiLieu.toString());
                        } else {
                            System.out.println("Khong tim thay tai lieu");
                        }
                        break;
                    case 6:
                        TaiLieu taiLieu1 = findKeyWord();
                        if (taiLieu1 != null) {
                            System.out.println("Tai lieu can tim la: ");
                            System.out.println(taiLieu1.toString());
                        } else {
                            System.out.println("Khong tim thay tai lieu");
                        }
                        break;
                    default:
                        flag = false;
                        System.out.println("Lua chon vua nhap khong ton tai!");
                        break;
                }

            } while (!flag);
        }

    }

    private void add() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Danh sach can them moi: ");
        System.out.println("1. Sach");
        System.out.println("2. Tap Chi");
        System.out.println("3. Bao");

        boolean flag = true;
        int chosse = 0;

        do {
            flag = true;

            System.out.println("Nhap tai lieu can them: ");
            chosse = scanner.nextInt();

            TaiLieu taiLieu = new TaiLieu();
            switch (chosse) {
                case 1:
                    taiLieu = createTaiLieu();

                    scanner.nextLine();
                    System.out.println("Nhap ten tac gia: ");
                    String tenTacGia = scanner.nextLine();

                    System.out.println("Nhap so trang: ");
                    int soTrang = scanner.nextInt();

                    taiLieu = new Sach(taiLieu.getMaTL(), taiLieu.getTenNhaSanXuat(), taiLieu.getSoBanPhatHanh(),
                            tenTacGia, soTrang);

                    taiLieus.add(taiLieu);
                    break;
                case 2:
                    taiLieu = createTaiLieu();

                    System.out.println("Nhap so phat hanh: ");
                    int soPhatHanh = scanner.nextInt();

                    System.out.println("Nhap thang phat hanh: ");
                    int thangPhatHanh = scanner.nextInt();

                    taiLieu = new TapChi(taiLieu.getMaTL(), taiLieu.getTenNhaSanXuat(), taiLieu.getSoBanPhatHanh(),
                            soPhatHanh, thangPhatHanh);

                    taiLieus.add(taiLieu);
                    break;
                case 3:
                    taiLieu = createTaiLieu();

                    System.out.println("Nhap ngay phat hanh: ");
                    int ngayPhatHanh = scanner.nextInt();

                    taiLieu = new Bao(taiLieu.getMaTL(), taiLieu.getTenNhaSanXuat(), taiLieu.getSoBanPhatHanh(),
                            ngayPhatHanh);

                    taiLieus.add(taiLieu);
                    break;
                default:
                    flag = false;
                    System.out.println("Tai lieu khong hop le, vui long nhap lai!");
                    break;
            }

        } while (!flag);

    }

    private void delete() {
        TaiLieu taiLieu = find();

        if (taiLieu != null) {
            taiLieus.remove(taiLieu);
            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Khong tim thay ma tai lieu!");
        }
    }

    private void view() {
        for (TaiLieu taiLieu : taiLieus) {
            System.out.println(taiLieu.toString());
        }
    }

    private void edit() {
        Scanner scanner = new Scanner(System.in);
        TaiLieu taiLieu = find();
        int chosse = 0;
        boolean flag= true;

        if (taiLieu != null) {
            System.out.println("Lua chon can sua:");
            System.out.println("1. Ten nha san xuat");
            System.out.println("2. So ban phat hanh ");

            if (taiLieu instanceof Sach) {
                System.out.println("3. Ten tac gia ");
                System.out.println("4. So trang");



                do {
                    flag = true;

                    System.out.println("Nhap lua chon: ");
                    chosse= scanner.nextInt();

                    switch (chosse) {
                        case 1:
                            scanner.nextLine();
                            System.out.println("Nhap ten nha san xuat: ");
                            taiLieu.setTenNhaSanXuat(scanner.nextLine());
                            break;
                        case 2:
                            System.out.println("Nhap so ban phat hanh: ");
                            taiLieu.setSoBanPhatHanh(scanner.nextInt());
                            break;
                        case 3:
                            scanner.nextLine();
                            System.out.println("Nhap ten tac gia: ");
                            ((Sach) taiLieu).setTenTacGia(scanner.nextLine());
                            break;
                        case 4:
                            System.out.println("Nhap so trang: ");
                            ((Sach) taiLieu).setSoTrang(scanner.nextInt());
                            break;
                        default:
                            flag= false;
                            System.out.println("Lua chon khong hop le, vui long nhap lai!");
                            break;
                    }
                    if(flag= true) {
                        System.out.println("Cap nhat thanh cong!");
                    }
                } while (!flag);

            }

            else if (taiLieu instanceof TapChi) {
                System.out.println("3. So phat hanh ");
                System.out.println("4. Thang phat hanh ");


                do {
                    flag = true;

                    System.out.println("Nhap lua chon: ");
                    chosse= scanner.nextInt();

                    switch (chosse) {
                        case 1:
                            scanner.nextLine();
                            System.out.println("Nhap ten nha san xuat: ");
                            taiLieu.setTenNhaSanXuat(scanner.nextLine());
                            break;
                        case 2:
                            System.out.println("Nhap so ban phat hanh: ");
                            taiLieu.setSoBanPhatHanh(scanner.nextInt());
                            break;
                        case 3:
                            System.out.println("Nhap so phat hanh: ");
                            ((TapChi) taiLieu).setSoPhatHanh(scanner.nextInt());
                            break;
                        case 4:
                            System.out.println("Nhap thang phat hanh: ");
                            ((TapChi) taiLieu).setThangPhatHanh(scanner.nextInt());
                            break;
                        default:
                            flag= false;
                            System.out.println("Lua chon khong hop le, vui long nhap lai!");
                            break;
                    }
                    if(flag= true) {
                        System.out.println("Cap nhat thanh cong!");
                    }
                } while (!flag);

            }
            else if (taiLieu instanceof Bao) {
                System.out.println("3. Ngay phat hanh ");


                do {
                    flag = true;

                    System.out.println("Nhap lua chon: ");
                    chosse= scanner.nextInt();

                    switch (chosse) {
                        case 1:
                            scanner.nextLine();
                            System.out.println("Nhap ten nha san xuat: ");
                            taiLieu.setTenNhaSanXuat(scanner.nextLine());
                            break;
                        case 2:
                            System.out.println("Nhap so ban phat hanh: ");
                            taiLieu.setSoBanPhatHanh(scanner.nextInt());
                            break;
                        case 3:
                            System.out.println("Nhap ngay phat hanh ");
                            ((Bao) taiLieu).setNgayPhatHanh(scanner.nextInt());
                            break;

                        default:
                            flag= false;
                            System.out.println("Lua chon khong hop le, vui long nhap lai!");
                            break;
                    }
                    if(flag= true) {
                        System.out.println("Cap nhat thanh cong!");
                    }
                } while (!flag);

            }
        } else {
            System.out.println("Khong tim thay tai lieu!");
        }
    }

    private TaiLieu createTaiLieu() {
        TaiLieu taiLieu = new TaiLieu();

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Nhap ma tai lieu: ");
        taiLieu.setMaTL(getNewID());

        System.out.println("Nhap ten nha xuat ban: ");
        taiLieu.setTenNhaSanXuat(scanner.nextLine());

        System.out.println("Nhap so ban phat hanh: ");
        taiLieu.setSoBanPhatHanh(scanner.nextInt());

        return taiLieu;
    }

    private TaiLieu find() {
        TaiLieu info = null;

        Scanner scanner = new Scanner(System.in);
        String maTl = "";

        System.out.println("Nhap ma tai lieu can tim: ");
        maTl = scanner.nextLine();

        for (TaiLieu taiLieu : taiLieus) {
            if (maTl.trim().equals(taiLieu.getMaTL().trim())) {
                info = taiLieu;
                break;
            }
        }

        return info;
    }

    private TaiLieu findKeyWord() {
        TaiLieu info = null;

        Scanner scanner = new Scanner(System.in);
        String key = "";

        System.out.println("Nhap keyword tai lieu can tim: ");
        key = scanner.nextLine();

        for (TaiLieu taiLieu : taiLieus) {
            if (taiLieu.getMaTL().trim().contains(key.trim())
            || taiLieu.getTenNhaSanXuat().trim().contains(key.trim())) {
                info = taiLieu;
                break;
            }
        }

        return info;
    }

    private String getNewID() {
        String maxID= "TL0";

        for(TaiLieu taiLieu: taiLieus) {
            if(taiLieu.getMaTL().trim().compareTo(maxID.trim()) > 0) {
                maxID= taiLieu.getMaTL();
            }
        }

        int newID= Integer.parseInt(maxID.substring(2));

        newID+=1;

        int lenght= 8- Integer.toString(newID).length();

        maxID= "TL";
        while (lenght> 0) {
            maxID+="0";
            lenght--;
        }

        maxID+= Integer.toString(newID);

        return maxID;
    }
}
