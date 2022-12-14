import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String ten;
    private int tuoi;
    private String gender;
    private String diaChi;
    private double dtb;
    private int id;
    private List<MonHoc> dsMonHoc = new ArrayList<>();

    private TenLop tenLop;
    //(id, name, age, gender, diaChi, dtb, monhoc , tenLop);



    public TenLop tenLop() {
        return tenLop;
    }

    public void setTenLop(TenLop tenLop) {
        this.tenLop = tenLop;
    }

    public Student() {
    }

    public Student(TenLop tenLop) {
        this.tenLop = tenLop;
    }

    public Student(int id, String ten, int tuoi, String gender, String diaChi, double dtb, ArrayList<MonHoc> monhoc , TenLop tenLop) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gender = gender;
        this.diaChi = diaChi;
        this.dtb = dtb;
        this.id = id;
        this.dsMonHoc = monhoc;
        this.tenLop = tenLop;
    }


    public String ten() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int tuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String gender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String diaChi() {
        return diaChi;
    }

    public List<MonHoc> getDsMonHoc() {
        return dsMonHoc;
    }

    public void setDsMonHoc(List<MonHoc> dsMonHoc) {
        this.dsMonHoc = dsMonHoc;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double dtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addMonHoc(){
        System.out.println("Nhập id môn học");
        Scanner sc = new Scanner(System.in);
        int id = Integer.parseInt(sc.nextLine());
        dsMonHoc.add(new MonHoc(id));
    }


    @Override
    public String toString() {
        return "id=" + id +
                ", tenLop=" + tenLop + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gender='" + gender + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", dtb=" + dtb + '\'' +
                ", monhoc=" + dsMonHoc +

                '}';
    }

}
