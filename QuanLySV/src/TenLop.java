public class TenLop {
    private String tenLop;

    public TenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public TenLop() {
    }

    public String tenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public String toString() {
        return   tenLop ;
    }
}
