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
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    
    public int soNgayDi; // số ngày đi dc
    public String noiDen;

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }
    
    
    
    public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu, String noiDen, int soNgayDi) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soNgayDi = soNgayDi;
        this.noiDen = noiDen;
    }
    
}
