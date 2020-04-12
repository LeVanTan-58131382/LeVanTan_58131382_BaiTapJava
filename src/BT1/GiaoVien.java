/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author levan
 */
public class GiaoVien extends CaNhan {

    public String monDay;
    public String toBoMon;

    public GiaoVien() {
    }
    
    
    public GiaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public void HienThiTT() {
        super.HienThiTT(); //To change body of generated methods, choose Tools | Templates.
        // dòng trên sẽ thực hiện in danh sách thông tin cơ bản
        System.out.println("Môn dạy: " + this.getMonDay());
        System.out.println("Tổ bộ môn: " + this.getToBoMon());
    }

    
    
    
}
