/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2_BaiTapJava;
import BaiTap1_BaiTapJava.NhanVien;
import BaiTap2_BaiTapJava.QuanLyNhanVien;
import java.util.ArrayList;
/**
 *
 * @author levan
 */
public class MainQuanLy {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      ArrayList<NhanVien> dsnhanvien = new ArrayList<>() ;
      QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien(dsnhanvien);
       
      NhanVien nv1 = new NhanVien("Tân",22 ,"Ninh Thuận", 2000000,150 );
      NhanVien nv2 = new NhanVien("Thuận",22 ,"Nha Trang", 2000000,200 );
      NhanVien nv3 = new NhanVien("Linh",22 ,"Nha Trang", 2000000,150 );
      NhanVien nv4 = new NhanVien("Long",22 ,"Nha Trang", 2000000,200 );
      NhanVien nv5 = new NhanVien("Tiến",22 ,"Ninh Thuận", 2000000,150 );
      
      dsnhanvien.add(nv1);
      dsnhanvien.add(nv2);
      dsnhanvien.add(nv3);
      dsnhanvien.add(nv4);
      dsnhanvien.add(nv5);
      
      quanLyNhanVien.inDS(dsnhanvien);
      
      
      
      
    }
    
    
    
}
