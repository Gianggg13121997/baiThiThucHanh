package model;

import java.util.Date;

public class ThongTinThuePhong {
    private int id;
    private String tenNguoiThue;
    private String SoDienThoai;
    private Date ngayThue;
    private HinhThucThanhToan hinhThucThanhToan;
    private String ghiChu;

    public ThongTinThuePhong(int id, String tenNguoiThue, String soDienThoai, Date ngayThue, HinhThucThanhToan hinhThucThanhToan, String ghiChu) {
        this.id = id;
        this.tenNguoiThue = tenNguoiThue;
        SoDienThoai = soDienThoai;
        this.ngayThue = ngayThue;
        this.hinhThucThanhToan = hinhThucThanhToan;
        this.ghiChu = ghiChu;
    }
    public ThongTinThuePhong() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNguoiThue() {
        return tenNguoiThue;
    }

    public void setTenNguoiThue(String tenNguoiThue) {
        this.tenNguoiThue = tenNguoiThue;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public Date getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(Date ngayThue) {
        this.ngayThue = ngayThue;
    }

    public HinhThucThanhToan getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(HinhThucThanhToan hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
