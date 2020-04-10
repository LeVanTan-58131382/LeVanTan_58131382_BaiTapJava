/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2_BaiTapJava;

import BaiTap1_BaiTapJava.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author levan
 */
public class QuanLyNhanVien implements IQuanLy{
    
    ArrayList<NhanVien> dsnhanvien ;

    // hàm khởi tạo
    public QuanLyNhanVien(ArrayList<NhanVien> dsnhanvien) {
        this.dsnhanvien = dsnhanvien;
    }

    QuanLyNhanVien() {
       
    }

        
    @Override
    public void them(NhanVien nv) {
        dsnhanvien.add(nv);
    }

    @Override
    public void inDS(ArrayList<NhanVien> dsnhanvien) {
        for(int i = 0; i< dsnhanvien.size(); i++){
            System.out.println("Tên nhân viên: " + dsnhanvien.get(i).getTen());
            System.out.println("Địa chỉ nhân viên: " + dsnhanvien.get(i).getDiachi());
            System.out.println("Tiền lương nhân viên: " + dsnhanvien.get(i).getTienluong());
            System.out.println("Tuổi nhân viên: " + dsnhanvien.get(i).getTuoi());
            System.out.println("Tổng số giờ làm nhân viên: " + dsnhanvien.get(i).getTongsogiolam());
            System.out.println("---------------------------------");
      }
    }
    }
    
