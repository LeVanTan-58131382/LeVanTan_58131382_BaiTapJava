/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levantan.pkg58131382.baitapjava;
import calculates.CasioCalculator;
import interfaces.ICalculates;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author levan
 */
public class LeVanTan58131382BaiTapjava extends Application {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ICalculates calculator;
        calculator = new CasioCalculator();
        System.out.println("7+8="+calculator.cong(7, 8));
        System.out.println("9x3="+calculator.nhan(9, 3));
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
