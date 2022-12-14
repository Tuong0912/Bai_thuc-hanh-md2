import java.util.ArrayList;
import java.util.Scanner;

public class ManagerStudent {
    Scanner sc = new Scanner(System.in);

    ArrayList<Student> students = new ArrayList<>();
    int id = 0;


    public void show() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public void Add() {
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        System.out.println("Nhập age");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính");
        String gender = null;
        System.out.println("Nhập 1 để chọn nam , else chọn nữ");
        int choice = Integer.parseInt(sc.nextLine());
        if(choice == 1){
            gender = "Nam";
        }else {
            gender = "Nữ";
        }
        System.out.println("Nhập địa chỉ ");
        String diaChi = sc.nextLine();
        System.out.println("Nhập điểm trung bình");
        double dtb = Double.parseDouble(sc.nextLine());
        id++;
        ArrayList<MonHoc> monhoc = new ArrayList<>();
        String className;
        System.out.println("Chọn lớp để học");
        System.out.println("1. Lớp C10");
        System.out.println("2. Lớp C09");
        System.out.println("3. Lớp C08");
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose){
            case 1 -> className = "C10";
            case 2 -> className = "C09";
            case 3 -> className = "C08";
            default -> className = "Chọn linh tinh , đánh bome -.-";
        }
        TenLop tenLop = new TenLop(className);
        Student demo =new Student(tenLop);

        Student student1 = new Student(id, name, age, gender, diaChi, dtb, monhoc , tenLop);
        students.add(student1);

    }

    public void maxDiem() {
        double max = students.get(0).dtb();
        Student student = null;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).dtb() > max) {
                max = students.get(i).dtb();
                student = students.get(i);
            }

        }
        System.out.println(student);
    }

    public void minDiem() {
        double min = students.get(0).dtb();
        Student student1 = students.get(0);
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).dtb() < min) {
                student1 = students.get(i);
            }
        }
        System.out.println(student1);
    }

    public void delete() {
        System.out.println("Nhập id cần xóa");
        int id = Integer.parseInt(sc.nextLine());
        int index  = -1;
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).id()) {
                index = i;

            }
        }students.remove(index);
    }

    public void search() {
        System.out.println("Nhập tên cần tìm");
        String name = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).ten().toLowerCase().contains(name)){
                check = true;
                System.out.println(students.get(i));
            }
//
//            if (name.toLowerCase().equals(students.get(i).ten().toLowerCase())) {
//                check = true;
//                System.out.println(students.get(i));
            } if(!check ){
                System.out.println("Không có tên tương ứng trong danh sách sinh viên");
            }
        }


    public void hienThiTheoGioiTinh() {
        System.out.println("Nhập giới tính ");
        String gender = sc.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (gender.equals(students.get(i).gender())) {
                System.out.println(students.get(i));
            }

        }
    }

    public void edit() {
        System.out.println("Nhập id cần sửa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).id()) {
                System.out.println("Nhập tên muốn sửa");
                String name = sc .nextLine();
                if(name.equals("")){
                    System.out.println("không sửa");
                }else {
                    students.get(i).setTen(name);
                }

                System.out.println("Nhập tuổi muốn sửa");
                String age = sc.nextLine();
                if( age.equals("")){
                    System.out.println("không sửa");
                }else {
                    students.get(i).setTuoi(Integer.parseInt(age));
                }

                System.out.println("Nhập giới tính muốn sửa");
                String gender = sc.nextLine();
                if(gender.equals("")){
                    System.out.println("Không sửa");
                }else {
                    students.get(i).setGender(gender);
                }

                System.out.println("Nhập địa chỉ muốn sửa");
                String diaChi = sc.nextLine();
                if(diaChi.equals("")){
                    System.out.println("Không sửa");
                }else {
                    students.get(i).setDiaChi(diaChi);
                }

                System.out.println("Nhập điểm trung bình muốn sửa");
                String dtb = sc.nextLine();
                if(dtb.equals("")){
                    System.out.println("Không sửa");
                }else {
                    students.get(i).setDtb(Double.parseDouble(dtb));
                }
            }
        }
    }

    public void checkClass(){
        String className = sc.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if(className.equals(students.get(i).tenLop())){
                System.out.printf(students.get(i).tenLop().toString());
            }
        }
    }



//    public void DangKyBaiKiemTra() {
//        System.out.println("Nhập tên muốn đăng ký");
//        String input = sc.nextLine();
//
//    }

    public void themMonHoc() {
        System.out.println("Nhập id sinh viên cần đăng ký:");
        int  idSV = Integer.parseInt(sc.nextLine());

        for (int i=0; i<students.size(); i++) {
            if (students.get(i).id() == idSV) {
                students.get(i).addMonHoc();
            }
        }
    }


    public void KiemTraToan() {
//        int count = 0;
//        System.out.println("");
//        int a = Integer.parseInt(sc.nextLine());
//        if(a == 7){
//            count += 2;
//        }
        System.out.println();
        System.out.println();
        System.out.println();
    }


}
//nhập môn từ bàn phím rồi lưu môn học vào thuộc tính của đối tượng
// lưu sẵn cụm từ để so sánh với cái nhập vào , chia thành các trường hợp nhập vào để từ đó 
// suy ra môn sẽ làm bài kiểm tra 
