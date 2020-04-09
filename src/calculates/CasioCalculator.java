/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculates;
import interfaces.ICalculates;

/**
 *
 * @author levan
 */
public class CasioCalculator implements ICalculates {
//ở đây phải thực thi tất các các method của interfaces ( cộng trừ nhân chia - đều là các phương thức trừu tượng bên interface)
    // alt + Ensert => ra implement method
    @Override
    public int cong(int s1, int s2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return s1+s2;
    }

    @Override
    public int tru(int s1, int s2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return s1-s2;
    }

    @Override
    public int nhan(int s1, int s2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return s1*s2;
    }

    @Override
    public float chia(int s1, int s2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(s2 != 0){
            return s1/s2;
        }
        return Float.NaN;
    }
    //ở đây phải thực thi tất các các method của interfaces ( cộng trừ nhân chia - đều là các phương thức trừu tượng bên interface)
}
