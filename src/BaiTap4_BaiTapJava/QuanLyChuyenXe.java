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
    ArrayList<ChuyenXe> dschuyenxe = new ArrayList() ;
    public void addChuyenXe(ChuyenXe chuyenXe){
        this.dschuyenxe.add(chuyenXe);
    }

    public QuanLyChuyenXe() {
    }
    
    public void xuatTTDS(){
        for(int i = 0; i < dschuyenxe.size(); i++){
            dschuyenxe.get(i).inDS();
        }
    }
    
    public void tongDanhThuTungLoaiXe(){
        double tongDTXeNgoaiThanh = 0;
        double tongDTXeNoiThanh = 0;
        for(int i = 0; i < dschuyenxe.size(); i++){
            if(dschuyenxe.get(i) instanceof ChuyenXeNgoaiThanh){
                tongDTXeNgoaiThanh += dschuyenxe.get(i).doanhThu;
            }
            else if(dschuyenxe.get(i) instanceof ChuyenXeNoiThanh){
                tongDTXeNoiThanh += dschuyenxe.get(i).doanhThu;
            }
        }
        System.out.println("Tổng doanh thu xe ngoại thành: " + tongDTXeNgoaiThanh);
        System.out.println("Tổng doanh thu xe nội thành: " + tongDTXeNoiThanh);
 
        
    }
    
    public void tongDoanhThuHaiLoaiXe(){
        double tongDoanhThuHaiLoaiXe = 0;
        for(int i = 0; i < dschuyenxe.size(); i++){
                tongDoanhThuHaiLoaiXe += dschuyenxe.get(i).doanhThu;
            }
        System.out.println("Tổng doanh thu cả hai loại xe: " + tongDoanhThuHaiLoaiXe);
    }

    
    
}
