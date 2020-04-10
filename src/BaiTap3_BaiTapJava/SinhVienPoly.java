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
public abstract class SinhVienPoly {
    public String hoTen;
    public String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    
    
    public abstract double getDiem();
    public String getHocLuc(SinhVienPoly sv){
        if(sv.getDiem() >= 9){
            return "Xuất sắc";
        }
        else if(sv.getDiem() >= 7.5 && sv.getDiem() < 9){
            return "Giỏi";
        }
            else if(sv.getDiem() >= 6.5 && sv.getDiem() < 7.5){
                return "Khá";
            }
                else if(sv.getDiem() >= 5.5 && sv.getDiem() < 6.5){
                    return "Trung Bình";
                }
                else return "Yếu";
        
    }
    
    public void xuat(SinhVienPoly sv) {
        System.out.println("Tên sinh viên: " + sv.getHoTen());
        System.out.println("Điểm Java: " + sv.getNganh());
    }
    
}
