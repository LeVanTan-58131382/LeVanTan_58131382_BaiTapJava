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
    
    int soNgayDi; // số ngày đi dc
    String noiDen;

    public ChuyenXeNgoaiThanh(int soNgayDi, String noiDen, String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soNgayDi = soNgayDi;
        this.noiDen = noiDen;
    }

    @Override
    public void inDS() {
        super.inDS(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Số ngày đi: " + this.soNgayDi);
        System.out.println("Nơi đến: " + this.noiDen);
        System.out.println("-----------------------");
    }
}
