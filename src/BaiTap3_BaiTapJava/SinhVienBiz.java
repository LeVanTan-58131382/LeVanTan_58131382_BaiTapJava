/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3_BaiTapJava;

/**
 *
 * @author levan
 */
public class SinhVienBiz extends SinhVienPoly{
    
    private double diemMarketing;
    private double diemSales;

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }
    
    

    public SinhVienBiz(double diemMarketing, double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    
    @Override
    public double getDiem() {
        return (2*diemMarketing + diemSales)/3;
    }
    
    public void xuatBiz(SinhVienBiz sv) {
        System.out.println("Tên sinh viên: " + sv.getHoTen());
        System.out.println("Điểm Marketing: " + sv.getDiemMarketing());
        System.out.println("Điểm Sales: " + sv.getDiemSales());
        System.out.println("Học lực: " + getHocLuc(sv));
    }
    
}
