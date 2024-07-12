/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import jdbc.DBConnect;
import model.NhanVienModel;

/**
 *
 * @author laptop
 */
public class NhanVienRepos {
    private static Connection con=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    private String sql=null;
    
    public ArrayList<NhanVienModel> getAll(){
        ArrayList<NhanVienModel> listNV = new ArrayList<>();
        sql="Select MA_NHAN_VIEN,TEN_NV,GIOI_TINH,SO_DIEN_THOAI,EMAIL,VAI_TRO,TRANG_THAI from NHAN_VIEN";
        try{
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String ma,ten,sdt,email;
                boolean gioiTinh,vaiTro,trangThai;
                ma=rs.getString("MA_NHAN_VIEN");
                ten=rs.getString("TEN_NV");
                gioiTinh=rs.getBoolean("GIOI_TINH");
                sdt=rs.getString("SO_DIEN_THOAI");
                email=rs.getString("EMAIL");
                vaiTro=rs.getBoolean("VAI_TRO");
                trangThai=rs.getBoolean("TRANG_THAI");
                listNV.add(new NhanVienModel(ma,ten,gioiTinh,sdt,email,vaiTro,trangThai));
            }
            return listNV;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
