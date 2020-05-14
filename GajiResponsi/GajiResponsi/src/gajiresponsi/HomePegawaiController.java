/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajiresponsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePegawaiController {
    HomePegawaiView homepegawaiview;
    
    public HomePegawaiController(HomePegawaiView homepegawaiview){
        this.homepegawaiview = homepegawaiview;
        
        homepegawaiview.btnhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomePegawaiMVC home = new HomePegawaiMVC();
            }
        });
        
        homepegawaiview.btngaji.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GajiPegawaiMVC gaji = new GajiPegawaiMVC();
            }
        });
        
        homepegawaiview.btndata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataPegawaiMVC data = new DataPegawaiMVC();
            }
        });
        
        homepegawaiview.btnpetunjuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PetunjukPegawaiMVC petunjuk = new PetunjukPegawaiMVC();
            }
        });
        
        /*homepegawaiview.btnadmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminLoginMVC login = new AdminLoginMVC();
            }
        });*/
    }
}
