import java.util.Scanner;

public class SanPham {
    private String masp;
    private String tensp;
    private String soluong;
    private String giasp;
    private String thongtinsp;

    Scanner sc = new Scanner(System.in);

    public SanPham() {
        this.masp = null;
        this.tensp = null;
        this.soluong = null;
        this.giasp = null;
        this.thongtinsp = null;
    }

    public SanPham(String masp, String tensp, String soluong, String giasp, String thongtinsp) {
        this.masp = masp;
        this.tensp = tensp;
        this.soluong = soluong;
        this.giasp = giasp;
        this.thongtinsp = thongtinsp;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getGiasp() {
        return giasp;
    }

    public void setGiasp(String giasp) {
        this.giasp = giasp;
    }

    public String getThongtinsp() {
        return thongtinsp;
    }

    public void setThongtinsp(String thongtinsp) {
        this.thongtinsp = thongtinsp;
    }

    public void Nhap() {
        System.out.println("Moi ban nhap vao ma sp: ");
        masp = sc.nextLine();
        System.out.println("Moi ban nhap vao ten SP: ");
        tensp = sc.nextLine();
        System.out.println("Moi ban nhap vao so luong SP: ");
        soluong = sc.nextLine();
        System.out.println("Moi ban nhap vao gia SP: ");
        giasp = sc.nextLine();
        System.out.println("Moi ban nhap vao thong tin SP: ");
        thongtinsp = sc.nextLine();
    }

    public void Xuat() {
        System.out.printf("%-25s%-25s%-25s%-25s%-25s\n", masp, tensp, soluong, giasp, thongtinsp);
    }
}
