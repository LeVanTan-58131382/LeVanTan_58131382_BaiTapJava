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
public class QLDS implements IQLDS{

    ArrayList<CaNhan> dscanhan = new ArrayList() ;
    // thêm constructer

    public QLDS() {
    }

    
    
    public QLDS(ArrayList<CaNhan> dscanhan) {
        this.dscanhan = dscanhan;
    }
    
    @Override
    public void them(CaNhan p) {
        dscanhan.add(p);
    }

    @Override
    public void xoa(String ten) {
        dscanhan.remove(ten);
    }

    @Override
    public void inDS() {
        for(int i = 0; i< dscanhan.size(); i++){
            dscanhan.get(i).HienThiTT();
      }
    }
    
}
