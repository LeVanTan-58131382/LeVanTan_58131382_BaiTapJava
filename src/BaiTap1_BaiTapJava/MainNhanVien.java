/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1_BaiTapJava;

/**
 *
 * @author levan
 */
import BaiTap1_BaiTapJava.NhanVien;
public class MainNhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv1 = new NhanVien("Tân",22 ,"Ninh Thuận", 2000000,150 );
        NhanVien nv2 = new NhanVien("Thuận",22 ,"Nha Trang", 2000000,200 );
        
        nv1.getThongTin();
        //System.out.println("tiền thưởng (Tân): " + tinhThuong(nv1));
        nv2.getThongTin();
        //System.out.println("tiền thưởng (Tân): " + tinhThuong(nv2));
        
        
    }
    
}
