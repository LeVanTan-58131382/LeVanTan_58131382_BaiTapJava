/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2_BaiTapJava;

import BaiTap1_BaiTapJava.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author levan
 */
public interface IQuanLy {
    void them(NhanVien nv);
    void inDS(ArrayList<NhanVien> dsnhanvien);
}
