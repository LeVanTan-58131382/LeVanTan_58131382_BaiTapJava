/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4_BaiTapJava;

import java.util.ArrayList;

/**
 *
 * @author levan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       ChuyenXeNgoaiThanh xeNgoaiThanh1 = new ChuyenXeNgoaiThanh(12, "Nha Trang", "01", "Nguyễn Văn An", "01", 2);
       ChuyenXeNgoaiThanh xeNgoaiThanh2 = new ChuyenXeNgoaiThanh(12, "Nha Trang", "02", "Nguyễn Văn Vinh", "02", 3);
       ChuyenXeNgoaiThanh xeNgoaiThanh3 = new ChuyenXeNgoaiThanh(12, "Nha Trang", "03", "Nguyễn Xuân Anh", "03", 4);
       
       ChuyenXeNoiThanh xeNoiThanh1 = new ChuyenXeNoiThanh("01", "Lê Tuấn", "01", 2, "01", 2);
       ChuyenXeNoiThanh xeNoiThanh2 = new ChuyenXeNoiThanh("02", "Lê Anh", "02", 3, "02", 3);
       ChuyenXeNoiThanh xeNoiThanh3 = new ChuyenXeNoiThanh("03", "Lê Linh", "03", 4, "03", 4);
       
       QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
       qlcx.addChuyenXe(xeNoiThanh1);
       qlcx.addChuyenXe(xeNoiThanh2);
       qlcx.addChuyenXe(xeNoiThanh3);
       
       qlcx.addChuyenXe(xeNgoaiThanh1);
       qlcx.addChuyenXe(xeNgoaiThanh2);
       qlcx.addChuyenXe(xeNgoaiThanh3);
       
       qlcx.xuatTTDS();
       
       qlcx.tongDanhThuTungLoaiXe();
       qlcx.tongDoanhThuHaiLoaiXe();
        
    }
    
}
