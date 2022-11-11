import java.util.Scanner;

public class DanhSachBH {
    private int n;
    BaoHanh dsbh[];

    Scanner sc = new Scanner(System.in);

    public DanhSachBH(){
        n = 0;
        dsbh = null;
    }

    public void nhapDS(){
        System.out.println("Nhap vao so luong thiet bi can bao hanh: ");
        n = Integer.parseInt(sc.nextLine());
        dsbh = new BaoHanh[n];
        for(int i=0;i<n;i++){
            System.out.println("Moi ban nhap vao san pham thu " + (i+1) + ": ");
            BaoHanh bh = new BaoHanh();
            bh.Nhap();
            dsbh[i] = bh;
            System.out.println();
        }
    }

    public void hienThi(){
        System.out.printf("%-25d%-25s%-25s\n", "[MaBH]","[ThoiGianBH]","[ThongTinBH]");
        for(int i=0;i<dsbh.length;i++){
            dsbh[i].Xuat();
        }
    }
    public static void main(String[] args) {
        DanhSachBH ds = new DanhSachBH();
        ds.nhapDS();
        ds.hienThi();
    }
}
