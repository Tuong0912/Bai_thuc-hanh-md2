import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerStudent managerStudent = new ManagerStudent();
        Student student = new Student();

        while (true) {
            try {
                System.out.println("");
                System.out.println("Menu");
                System.out.println("1. Thêm sinh viên vào danh sách");
                System.out.println("2. Hiển thị danh sách");
                System.out.println("3. Hiển thị sinh viên có điểm cao nhất");
                System.out.println("4. Hiển thị sinh viên có điểm thấp nhất");
                System.out.println("5. Xóa sinh viên theo ID");
                System.out.println("6. Tìm sinh viên theo tên đã nhập");
                System.out.println("7. Hiển thị theo giới tính");
                System.out.println("8. Sửa theo id");
                System.out.println("9. Thêm môn học");
//                System.out.println("10. Thêm môn học");
                System.out.println("11. Kiểm tra trùng tên lớp");
                System.out.println("Nhập lựa chọn");
                int a = Integer.parseInt(sc.nextLine());
                switch (a) {
                    case 1 -> managerStudent.Add();
                    case 2 -> managerStudent.show();
                    case 3 -> managerStudent.maxDiem();
                    case 4 -> managerStudent.minDiem();
                    case 5 -> managerStudent.delete();
                    case 6 -> managerStudent.search();
                    case 7 -> managerStudent.hienThiTheoGioiTinh();
                    case 8 -> managerStudent.edit();
                    case 9 -> managerStudent.themMonHoc();
//                    case 10 -> managerStudent.themMonHoc();
                    case 11 -> managerStudent.checkClass();
                }
            } catch (Exception e) {
                System.out.println("Nhập lại");

            }
        }

    }
}