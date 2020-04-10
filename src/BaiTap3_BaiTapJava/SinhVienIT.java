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
public class SinhVienIT extends SinhVienPoly{

    private double diemJava;
    private double diemHtml;
    private double diemcss;

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    public double getDiemcss() {
        return diemcss;
    }

    public void setDiemcss(double diemcss) {
        this.diemcss = diemcss;
    }
    
    

    public SinhVienIT(double diemJava, double diemHtml, double diemcss, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemcss = diemcss;
    }

   
    @Override
    public double getDiem() {
        return (2*diemJava + diemHtml + diemcss)/4;
    }

    public void xuatIT(SinhVienIT sv) {
        System.out.println("Tên sinh viên: " + sv.getHoTen());
        System.out.println("Điểm Java: " + sv.getDiemJava());
        System.out.println("Điểm Html: " + sv.getDiemHtml());
        System.out.println("Điểm Css: " + sv.getDiemcss());
        System.out.println("Học lực: " + getHocLuc(sv));
    }

}
