import java.util.Scanner;

public class DanhSachSP {
    private int n;
    SanPham dssp[];
    Scanner sc = new Scanner(System.in);

    public DanhSachSP() {
        n = 0;
        dssp = null;
    }

    void them() {
        System.out.println("Nhap vao so luong san pham can them: ");
        n = Integer.parseInt(sc.nextLine());
        dssp = new SanPham[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao san pham thu " + (i + 1));
            SanPham sp = new SanPham();
            sp.Nhap();
            dssp[i] = sp;
        }
    }

    void hienThi() {
        System.out.println("Danh sach san pham vua nhap");
        System.out.printf("%-25s%-25s%-25s%-25s%-25s\n", "[MaSP]", "[TenSP]", "[SoluongSP]", "[GiaSP]", "[ThongtinSP]");
        for(int i=0;i<dssp.length;i++){
            dssp[i].Xuat();
        }
    }

    public static void main(String[] args) {
        DanhSachSP ds = new DanhSachSP();
        ds.them();
        ds.hienThi();
    }
}
