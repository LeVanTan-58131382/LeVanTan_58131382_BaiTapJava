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
public class HocSinh extends CaNhan{
    String lop; 
    String nangkhieu;
 // thêm các constructer
 // Hình 
    public HocSinh(String lop, String nangkhieu, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangkhieu = nangkhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangkhieu() {
        return nangkhieu;
    }

    public void setNangkhieu(String nangkhieu) {
        this.nangkhieu = nangkhieu;
    }
    
    
    
    
 // alt insert => implement method HienThiTT()
    
    @Override
    public String HienThiTT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
