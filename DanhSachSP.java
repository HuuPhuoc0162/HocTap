import java.util.Arrays;
import java.util.Scanner;

public class DanhSachSP implements ChucNangDS {
    private int n;
    SanPham dssp[];
    Scanner sc = new Scanner(System.in);

    public DanhSachSP() {
        n = 0;
        dssp = null;
    }
    

    // nhập vào danh sách sản phẩm ban đầu 
    void nhapds() {
        System.out.println("Nhap vao so luong san pham can them: ");
        n = Integer.parseInt(sc.nextLine());
        dssp = new SanPham[n];
        for (int i = 0; i < n; i++) {
            System.out.println("[==========Moi ban nhap vao san pham thu " + (i + 1) + "==========]");
            SanPham sp = new SanPham();
            sp.Nhap();
            dssp[i] = sp;
            System.out.println();
        }
    }


    // hàm thêm sản phẩm  
    public void them() {
        System.out.println("Nhap vao thong tin SP ban can them: ");
        SanPham addsp = new SanPham();
        addsp.Nhap();
        dssp = Arrays.copyOf(dssp, dssp.length + 1);
        dssp[n] = addsp;
        n++;
    }


    // hàm tìm kiếm sản phẩm 
    public void timKiemTheo_MaSP() {
        System.out.println("Nhap vao ma SP ban muon tim: ");
        int masp = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < dssp.length; i++) {
            if(dssp[i].getMasp() == masp){
                dssp[i].Xuat();
            }
        }
    }

    public void timKiemTheo_TenSP() {
        System.out.println("Nhap vao ten SP ma ban muon tim: ");
        String tensp = sc.nextLine();
        for (int i = 0; i < dssp.length; i++) {
            if (dssp[i].getTensp().equalsIgnoreCase(tensp)) {
                dssp[i].Xuat();
            }
        }
    }

    public void timKiemTheo_GiaSP() {
        System.out.println("Nhap vao gia SP ban muon tim: ");
        double giasp = Double.parseDouble(sc.nextLine());
        for (int i = 0; i < dssp.length; i++) {
            if (dssp[i].getGiasp() == giasp) {
                dssp[i].Xuat();
            }
        }
    }

    public void timKiem() {
        int luachon;
        System.out.println("1.tim kiem theo ma SP");
        System.out.println("2.tim kiem theo ten SP");
        System.out.println("3.tim kiem theo gia SP");
        System.out.println("4.Thoat!");
        do{
            System.out.println("Nhap vao lua chon cua ban: ");
            luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1:
                    timKiemTheo_MaSP();
                    break;
                case 2:
                    timKiemTheo_TenSP();
                    break;
                case 3:
                    timKiemTheo_GiaSP();
                    break;
                default:
                    System.out.println("Moi ban nhap lai lua chon: ");
                    break;
            }
        }while(luachon != 4);
    }


    // hàm sửa đổi sản phẩm 
    public void suaTheo_GiaSP() {
        System.out.println("nhap vao ten san pham ban muon sua gia: ");
        String tensp = sc.nextLine();
        System.out.println("Nhap vao gia ban muon sua: ");
        Double giasp = Double.parseDouble(sc.nextLine());
        for (int i = 0; i < dssp.length; i++) {
            if (dssp[i].getTensp().equalsIgnoreCase(tensp)) {
                dssp[i].setGiasp(giasp);
                dssp[i].Xuat();
            }
        }
    }

    public void suaTheo_ThongTinSP(){
        System.out.println("nhap vao ten san pham ban muon sua gia: ");
        String tensp = sc.nextLine();
        System.out.println("Nhap vao thong tin ban muon sua: ");
        String thongtinsp = sc.nextLine();
        for(int i=0;i<dssp.length;i++){
            if(dssp[i].getTensp().equalsIgnoreCase(tensp)){
                dssp[i].setThongtinsp(thongtinsp);
                dssp[i].Xuat();
            }
        }
    }

    public void sua() {
        int luachon;
        do {
            System.out.println("**********Thay Doi**********");
            System.out.println("1.Sua gia SP");
            System.out.println("2.Sua thong tin SP");
            System.out.println("3.Thoat!");
            System.out.println("****************************");
            System.out.println("Nhap vao lua chon cua ban: ");
            luachon = Integer.parseInt(sc.nextLine()); 
            switch (luachon) {
                case 1:
                    suaTheo_GiaSP();
                    break;
                case 2:
                    suaTheo_ThongTinSP();
                    break;
                default:
                    System.out.println("Moi ban nhap lai lua chon!");
                    break;
            }
        } while (luachon != 3);
    }

    public void hienThi() {
        System.out.println("[=======================================================MENU=======================================================]");
        System.out.println();
        System.out.printf("  %-25d%-25s%-25d%-25.3f%-25s\n", "[MaSP]", "[TenSP]", "[SoluongSP]", "[GiaSP]", "[ThongtinSP]");
        for (int i = 0; i < dssp.length; i++) {
            dssp[i].Xuat();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSP ds = new DanhSachSP();
        ds.nhapds();
        ds.hienThi();
        int luachon;
        // System.out.println("1.Them san pham vao danh sach");
        // System.out.println("2.Sua doi danh sach san pham");
        // System.out.println("3.Tim san pham trong danh sach");
        // System.out.println("4.Xuat ra danh sach san pham sau khi chinh sua");
        do {
            System.out.println("*********[LUA CHON]**********");
            System.out.println("1.Them san pham vao danh sach");
            System.out.println("2.Sua doi danh sach san pham");
            System.out.println("3.Tim san pham trong danh sach");
            System.out.println("4.Thoat!");
            System.out.println("******************************");
            System.out.println("Nhap vao lua chon cua ban: ");
            luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1:
                    ds.them();
                    break;
                case 2:
                    ds.sua();
                    break;
                case 3:
                    ds.timKiem();
                    break;
                default:
                    System.out.println("Moi ban nhap lai lua chon cua minh !");
                    break;
            }
        } while (luachon != 4);
        ds.hienThi();
    }
}
