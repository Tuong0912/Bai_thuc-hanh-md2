import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerSinhVien {
    ArrayList<SinhVien> danhSach = new ArrayList<>();


    Scanner sc = new Scanner(System.in);
    DocGhiFile dg = new DocGhiFile();


    public void show() {
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println(danhSach.get(i).toString());
        }
        dg.read();
    }

    public void themSinhVienVaoDanhSach() {
        System.out.println("Nhập mã sinh viên");
        int maSinhVien = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < danhSach.size(); i++) {

            if (maSinhVien == danhSach.get(i).getMaSinhVien()) {
                System.out.println("Trùng mã sinh viên , mời nhập lại");
                return;
            }
        }
        System.out.println("Nhập họ và tên");
        String hoVaTen = sc.nextLine();

        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(sc.nextLine());
        if(age < 18){
            System.out.println("Sinh viên gì mà trẻ thế");
            return;
        }
        if(age > 40){
            System.out.println("Sinh viên này hơi già :))");
            return;
        }

        System.out.println("Nhập giới tính");
        String gender = sc.nextLine();

        System.out.println("Nhập địa chỉ");
        String diaChi = sc.nextLine();

        System.out.println("Nhập điểm");
        double diem = Double.parseDouble(sc.nextLine());
        if(diem < 0 ){
            System.out.println("Mời nhập lại ");
            return;
        }
        if(diem > 10){
            System.out.println("Mời nhập lại");
        }
        SinhVien sinhVien = new SinhVien(maSinhVien, hoVaTen, age, gender, diaChi, diem);
        danhSach.add(sinhVien);
        dg.write(danhSach);
    }

    public SinhVien create() {
        System.out.println("Nhập mã sinh viên");
        int maSinhVien = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sinh viên");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính");
        String genger = sc.nextLine();
        System.out.println("Nhập địa chỉ");
        String diaChi = sc.nextLine();
        System.out.println("Nhập điểm");
        Double diem = Double.valueOf(sc.nextLine());
        SinhVien sinhVien = new SinhVien(maSinhVien, name, age, genger, diaChi, diem);
        return sinhVien;
    }

    public void Add(SinhVien sv) {
        this.danhSach.add(sv);
    }

    public void Edit(int maSinhVien) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (maSinhVien == danhSach.get(i).getMaSinhVien()) {
                danhSach.set(i, create());
            }
        }
    }

    public void Delete(int maSinhVien) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSinhVien() == maSinhVien) {
                danhSach.remove(i);
            }
        }
    }

    public void xoaTheoMaSinhVien() {
        System.out.println("Nhập mã sinh viên cần xóa");
        int maSinhvien = Integer.parseInt(sc.nextLine());
        Delete(maSinhvien);
        this.show();
    }

    public void sapXepSinhVienTheoDiemGiamDan() {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getDiem() < o2.getDiem()) {
                    return -1;
                } else if (o1.getDiem() > o2.getDiem()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public void sapXepSinhVienTheoDiemTangDan() {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getDiem() > o2.getDiem()) {
                    return -1;
                } else if (o1.getDiem() < o2.getDiem()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }
}
