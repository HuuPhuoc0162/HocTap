public class BaoHanh {
    private int mabh;
    private String thoigianbh;
    private String thongtinbh;

    public BaoHanh() {

    }

    public BaoHanh(int mabh, String thoigianbh, String thongtinbh) {
        this.mabh = mabh;
        this.thoigianbh = thoigianbh;
        this.thongtinbh = thongtinbh;
    }

    public int getMabh() {
        return mabh;
    }

    public void setMabh(int mabh) {
        this.mabh = mabh;
    }

    public String getThoigian() {
        return thoigianbh;
    }

    public void setThoigianbh(String thoigianbh) {
        this.thoigianbh = thoigianbh;
    }

    public String getThongtinbh() {
        return thongtinbh;
    }

    public void setThongtinbh(String thongtinbh) {
        this.thongtinbh = thongtinbh;
    }
}