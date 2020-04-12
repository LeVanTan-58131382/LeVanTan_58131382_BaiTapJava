/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.ArrayList;

/**
 *
 * @author levan
 */
public class LopHoc {
    // dựa vào hàm khởi tạo bên QLDS
    //QLDS qldsHS = new;
    ArrayList<HocSinh> dshocsinh = new ArrayList() ;
    ArrayList<GiaoVien> dsgiaovien = new ArrayList() ;
    
    public void themHocSinh (HocSinh hs){
        dshocsinh.add(hs);
    }
    
    public void themGVGD(GiaoVien gv){
        dsgiaovien.add(gv);
    }
    
    public void inDSHS(){
        for(int i = 0; i < dshocsinh.size(); i++){
            dshocsinh.get(i).HienThiTT();
        }
    }
    
    public void inDSGVGD(){
        for(int i = 0; i < dsgiaovien.size(); i++){
            dsgiaovien.get(i).HienThiTT();
        }
    }
}
