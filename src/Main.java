import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerSinhVien managerSinhVien = new ManagerSinhVien();
        while (true) {
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm sinh viên vào danh sách");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa sinh viên theo ID");
            System.out.println("5. Sắp xếp theo điểm");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1 -> managerSinhVien.show();
                    case 2 -> {
                        managerSinhVien.themSinhVienVaoDanhSach();
                    }
                    case 3 -> {
                        System.out.println("Nhập mã sinh viên muốn sửa");
                        int maSinhVien = Integer.parseInt(scanner.nextLine());
                        managerSinhVien.Edit(maSinhVien);
                    }
                    case 4 -> managerSinhVien.xoaTheoMaSinhVien();
                    case 5 -> {
                        System.out.println("1. Sắp xếp theo điểm giảm dần");
                        System.out.println("2. Sắp xếp theo điểm tăng dần");
                        System.out.print("Chọn chức năng");
                        int chon = Integer.parseInt(scanner.nextLine());
                        switch (chon) {
                            case 1 -> {
                                System.out.println("Sắp xếp giảm dần");
                                managerSinhVien.sapXepSinhVienTheoDiemGiamDan();
                                managerSinhVien.show();
                            }
                            case 2 -> {
                                System.out.println("Sắp xếp tăng dần");
                                managerSinhVien.sapXepSinhVienTheoDiemTangDan();
                                managerSinhVien.show();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Mời nhập lại");
            }
        }
    }
}