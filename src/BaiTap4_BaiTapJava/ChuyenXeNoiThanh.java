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

    public float soKm; // số km đi được
    public String soTuyen;
    
    public float getSoKm() {
        return soKm;
    }

    public void setSoKm(float soKm) {
        this.soKm = soKm;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }
    
    
    public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu, String soTuyen, float soKm) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soKm = soKm;
        this.soTuyen = soTuyen;
    }
    
    //public float soKm; // số km đi được

    
    
    
    
    
}
