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
public class MainLopHoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GiaoVien giaoviengiangday = new GiaoVien("Toán cao cấp", "Toán", "Lê Thị Linh", 30, "Nha Trang", "019283746");
        GiaoVien giaovienchunhiem = new GiaoVien("Giáo viên chủ nhiệm", "Hóa", "Nguyễn Thành Tâm", 32, "Nha Trang", "0362634545");
        
        HocSinh hs1 = new HocSinh("Lớp 10A1", "Toán học", "Lê Nhật Hoàng", 16, "Nha Trang", "0596542357");
        HocSinh hs2 = new HocSinh("Lớp 10A1", "Toán học", "Nguyễn Văn Linh", 16, "Nha Trang", "0810542357");
        HocSinh hs3 = new HocSinh("Lớp 10A1", "Hóa học", "Lê Thanh Nhàn", 16, "Nha Trang", "096542354");
        HocSinh hs4 = new HocSinh("Lớp 10A1", "Văn học", "Lưu Nhật Linh", 16, "Nha Trang", "096542357");
        HocSinh hs5 = new HocSinh("Lớp 10A1", "Sử học", "Lê Thị Hằng", 16, "Nha Trang", "026542357");
        
        QLDS qldsgv = new QLDS();
        qldsgv.them(giaoviengiangday);
        qldsgv.them(giaovienchunhiem);
        
        QLDS qldshs = new QLDS();
        qldshs.them(hs1);
        qldshs.them(hs2);
        qldshs.them(hs3);
        qldshs.them(hs4);
        qldshs.them(hs5);
        
        qldsgv.inDS();
        qldshs.inDS();
        
    }
    
}
