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
public class QuanLyChuyenXe{
    ArrayList<ChuyenXe> dschuyenxe ;

    public QuanLyChuyenXe(ArrayList<ChuyenXe> dschuyenxe) {
        this.dschuyenxe = dschuyenxe;
    }
    
    
    
    public void themChuyenXe(ChuyenXe chuyenxe){
        dschuyenxe.add(chuyenxe);
    }
    
    public void xuatDsChuyenXe(ArrayList<ChuyenXe> dschuyenxe){
        for(int i = 0; i< dschuyenxe.size(); i++){
            System.out.println("Mã số chuyến: " + dschuyenxe.get(i).getMaSoChuyen());
            System.out.println("Họ tên tài xế: " + dschuyenxe.get(i).getHoTenTaiXe());
            System.out.println("Số xe: " + dschuyenxe.get(i).getSoXe());
            System.out.println("Doanh thu: " + dschuyenxe.get(i).getDoanhThu());
           
            System.out.println("---------------------------------");
      }
    }
    
    public float tongDoanhThuXeNoiThanh(ArrayList<ChuyenXe> dschuyenxe){
        float tongDoanhThu = 0;
        for(int i = 0; i< dschuyenxe.size(); i++){
            if(dschuyenxe.get(i) instanceof ChuyenXeNoiThanh){
                tongDoanhThu = tongDoanhThu + dschuyenxe.get(i).getDoanhThu();
            }
        }
        return tongDoanhThu;
    }
    
    public float tongDoanhThuXeNgoaiThanh(ArrayList<ChuyenXe> dschuyenxe){
        float tongDoanhThu = 0;
        for(int i = 0; i< dschuyenxe.size(); i++){
            if(dschuyenxe.get(i) instanceof ChuyenXeNgoaiThanh){
                tongDoanhThu = tongDoanhThu + dschuyenxe.get(i).getDoanhThu();
            }
        }
        return tongDoanhThu;
    }
    
    public float tongDoanhThuHaiLoaiXe(ArrayList<ChuyenXe> dschuyenxe){
        float tongDoanhThu = 0;
        for(int i = 0; i< dschuyenxe.size(); i++){  
            tongDoanhThu = tongDoanhThu + dschuyenxe.get(i).getDoanhThu();
        }
        return tongDoanhThu;
    }
}
