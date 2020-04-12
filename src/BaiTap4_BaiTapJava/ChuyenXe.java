/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4_BaiTapJava;

/**
 *
 * @author levan
 */
public class ChuyenXe {
    
    String maSoChuyen; // mã số chuyến
    String hoTenTaiXe;
    String soXe;
    float doanhThu;

    public ChuyenXe() {
    }
    
    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    
    public void inDS(){
         System.out.println("Mã số chuyến: " + this.maSoChuyen);
            System.out.println("Họ tên tài xế: " + this.hoTenTaiXe);
            System.out.println("Số xe: " + this.soXe);
            System.out.println("Doanh thu: " + this.doanhThu);
    }  
}
