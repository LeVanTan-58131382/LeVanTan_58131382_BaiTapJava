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
public class ChuyenXeNoiThanh extends ChuyenXe{

    double soKm; // số km đi được
    String soTuyen;
    
    
    public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu, String soTuyen, double soKm) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soKm = soKm;
        this.soTuyen = soTuyen;
    }
    
    //public float soKm; // số km đi được

    @Override
    public void inDS() {
        super.inDS(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Số Km: " + this.soKm);
        System.out.println("Số Tuyến: " + this.soTuyen);
        System.out.println("-----------------------");
    }
    
}
