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
public class MainSinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SinhVienPoly sv1 = new SinhVienPoly("Nguyễn Lê Thành Tiến", "Công Nghệ Thực Phẩm");
        SinhVienIT sv2 = new SinhVienIT(7.5, 8.5, 7.0, "Nguyễn Văn Thanh", "Công Nghệ Thông tin");
        SinhVienBiz sv3 = new SinhVienBiz(5.5, 4.5,"Nguyễn Văn Tuấn", "Marketing");
        
        sv2.xuatIT(sv2);
        sv3.xuatBiz(sv3);
            
    }
}
