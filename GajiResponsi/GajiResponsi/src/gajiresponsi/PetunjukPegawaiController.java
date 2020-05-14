/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajiresponsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USER
 */
public class PetunjukPegawaiController {
    PetunjukPegawaiView petunjukpegawaiview;
    
    public PetunjukPegawaiController(PetunjukPegawaiView petunjukpegawaiview){
        this.petunjukpegawaiview = petunjukpegawaiview;
        
        petunjukpegawaiview.home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomePegawaiMVC homepegawaimvc = new HomePegawaiMVC();
            }
        });
    }
}
