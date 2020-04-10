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
public class NhanVien {
    String ten;
    int tuoi;
    String diachi;
    double tienluong;
    int tongsogiolam;
    
    // constructor không tham số
    public NhanVien() {
    }
    
    // constructor có tham số
    public NhanVien(String ten, int tuoi, String diachi, double tienluong, int tongsogiolam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.tienluong = tienluong;
        this.tongsogiolam = tongsogiolam;
    }
    
    // các hàm get/set

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    public int getTongsogiolam() {
        return tongsogiolam;
    }

    public void setTongsogiolam(int tongsogiolam) {
        this.tongsogiolam = tongsogiolam;
    }
    
    public void getThongTin(){
        System.out.println("Tên nhân viên: " + getTen());
        System.out.println("Tuổi nhân viên: " + getTuoi());
        System.out.println("Địa chỉ nhân viên: " + getDiachi());
        System.out.println("Tổng số giờ làm nhân viên: " + getTongsogiolam());
        System.out.println("Lương nhân viên: " + getTienluong());
    }
    
    public double tinhThuong(NhanVien nv){
        int tongsogiolam = nv.getTongsogiolam();
        double tienluong = nv.getTienluong();
        double tienthuong = 0.0;
        if(tongsogiolam >= 200){
            return tienthuong = tienluong * 0.2;
        }
        else if(tongsogiolam >= 100 && tongsogiolam < 200){
             return tienthuong = tienluong * 0.1;
        }
        else 
            return tienthuong;
    }
}
