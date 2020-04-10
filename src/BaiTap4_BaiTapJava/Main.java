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
        
        ArrayList<ChuyenXe> dschuyenxe = new ArrayList<>() ;
        QuanLyChuyenXe quanLyChuyenXe = new QuanLyChuyenXe(dschuyenxe);
        
        ChuyenXeNoiThanh xenoithanh_1 = new ChuyenXeNoiThanh("001", "Nguyễn Văn Nam", "20", 5000000, "001", 20);
        ChuyenXeNoiThanh xenoithanh_2 = new ChuyenXeNoiThanh("002", "Lê Việt Tiến", "30", 6000000, "002", 40);
        ChuyenXeNoiThanh xenoithanh_3 = new ChuyenXeNoiThanh("003", "Nguyễn Văn Tuấn", "40", 5500000, "003", 50);
        
        ChuyenXeNgoaiThanh xengoaithanh_1 = new ChuyenXeNgoaiThanh("a1", "Trần Văn Linh", "21", 6000000, "Hà Nội", 5);
        ChuyenXeNgoaiThanh xengoaithanh_2 = new ChuyenXeNgoaiThanh("b1", "Nguyễn Thanh Tuấn", "31", 7000000, "Hà Nam", 10);
        ChuyenXeNgoaiThanh xengoaithanh_3 = new ChuyenXeNgoaiThanh("c1", "Bùi Thanh Tâm", "41", 8000000, "Nghệ An", 25);
        
        quanLyChuyenXe.themChuyenXe(xenoithanh_1);
        quanLyChuyenXe.themChuyenXe(xenoithanh_2);
        quanLyChuyenXe.themChuyenXe(xenoithanh_3);
        quanLyChuyenXe.themChuyenXe(xengoaithanh_1);
        quanLyChuyenXe.themChuyenXe(xengoaithanh_2);
        quanLyChuyenXe.themChuyenXe(xengoaithanh_3);
        
        quanLyChuyenXe.xuatDsChuyenXe(dschuyenxe);
        System.out.println("Tổng doanh thu của xe nội thành: " + (int) quanLyChuyenXe.tongDoanhThuXeNoiThanh(dschuyenxe));
        System.out.println("Tổng doanh thu của xe ngoại thành: " + (int) quanLyChuyenXe.tongDoanhThuXeNgoaiThanh(dschuyenxe));
    }
    
}
