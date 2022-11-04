import java.util.Scanner;

public class SanPham {
    private String tensp;
    private int soluong;
    private double giasp;
    private String thongtinsp;

    Scanner sc = new Scanner(System.in);

    public SanPham() {

    }

    public SanPham(String tensp, int soluong, double giasp, String thongtinsp) {
        this.tensp = tensp;
        this.soluong = soluong;
        this.giasp = giasp;
        this.thongtinsp = thongtinsp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGiasp() {
        return giasp;
    }

    public void setGiasp(double giasp) {
        this.giasp = giasp;
    }

    public String getThongtinsp() {
        return thongtinsp;
    }

    public void setThongtinsp(String thongtinsp) {
        this.thongtinsp = thongtinsp;
    }

    public void Nhap() {
        System.out.println("Moi ban nhap vao ten SP: ");
        tensp = sc.nextLine();
        System.out.println("Moi ban nhap vao so luong SP: ");
        soluong = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap vao gia SP: ");
        giasp = Double.parseDouble(sc.nextLine());
        System.out.println("Moi ban nhap vao thong tin SP: ");
        thongtinsp = sc.nextLine();
    }

    public void Xuat() {
        System.out.printf("[Ten]:%-20s [So luong]:%-20d [Gia]:%-20f [Thong tin]:%-20s\n", tensp, soluong, giasp,
                thongtinsp);
    }
}
