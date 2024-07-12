/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author laptop
 */
public class NhanVienModel {
    private String maNV;
    private String hoTen;
    private boolean gioiTinh;
    private String sdt;
    private String email;
    private boolean vaiTro;
    private boolean trangThai;

    public NhanVienModel() {
    }

    public NhanVienModel(String maNV, String hoTen, boolean gioiTinh, String sdt, String email, boolean vaiTro, boolean trangThai) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.email = email;
        this.vaiTro = vaiTro;
        this.trangThai = trangThai;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    public Object[] toDataRow(){
       return new Object[]{this.getMaNV(),this.getHoTen(),this.getGioiTinh()?"Nam":"Nữ"
               ,this.getSdt(),this.getEmail(),this.getVaiTro()?"Quản lý":"Nhân viên",this.getTrangThai()?"Đang làm":"Nghỉ việc"};
    }
}
