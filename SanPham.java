import java.util.Scanner;

public class SanPham {
    private int masp;
    private String tensp;
    private int soluong;
    private float giasp;
    private String thongtinsp;

    Scanner sc = new Scanner(System.in);

    public SanPham() {
        this.masp = 0;
        this.tensp = null;
        this.soluong = 0;
        this.giasp = 0;
        this.thongtinsp = null;
    }

    public SanPham(int masp, String tensp, int soluong, Float giasp, String thongtinsp) {
        this.masp = masp;
        this.tensp = tensp;
        this.soluong = soluong;
        this.giasp = giasp;
        this.thongtinsp = thongtinsp;
    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
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

    public void setGiasp(Float giasp) {
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
        masp = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap vao ten SP: ");
        tensp = sc.nextLine();
        System.out.println("Moi ban nhap vao so luong SP: ");
        soluong = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap vao gia SP: ");
        giasp = Float.parseFloat(sc.nextLine());
        System.out.println("Moi ban nhap vao thong tin SP: ");
        thongtinsp = sc.nextLine();
    }

    public void Xuat() {
        System.out.printf("%-25d%-25s%-25d%-25f%-25s\n",masp,tensp,soluong,giasp,thongtinsp);
    }
}
