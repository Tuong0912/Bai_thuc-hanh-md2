import java.io.Serializable;

public class SinhVien implements Comparable<SinhVien> , Serializable {
    private int maSinhVien;
    private String name;
    private int age;
    private String gender;
    private String diaChi;
    private double diem;

    public SinhVien(int maSinhVien, String name, int age, String gender, String diaChi, double diem) {
        this.maSinhVien = maSinhVien;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.diaChi = diaChi;
        this.diem = diem;
    }

    public SinhVien() {
    }

    public SinhVien(int maSinhvien) {
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDiaChidiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", diaChi='" + diaChi + '\'' +
                ", diem=" + diem +
                '}';
    }


    @Override
    public int compareTo(SinhVien o) {
        return (int) (this.diem - o.diem);
    }
}
