
package gajiresponsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class GajiPegawaiController {
    GajiPegawaiDAO gajipegawaidao;
    GajiPegawaiView gajipegawaiview;
    GajiPegawaiModel gajipegawaimodel;
    
    public GajiPegawaiController(GajiPegawaiDAO gajipegawaidao, GajiPegawaiView gajipegawaiview, GajiPegawaiModel gajipegawaimodel){
        this.gajipegawaiview = gajipegawaiview;
        this.gajipegawaimodel = gajipegawaimodel;
        this.gajipegawaidao = gajipegawaidao;
        
        gajipegawaiview.btnhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomePegawaiMVC home = new HomePegawaiMVC();
            }
        });
        
        gajipegawaiview.btngaji.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GajiPegawaiMVC gaji = new GajiPegawaiMVC();
            }
        });
        
        gajipegawaiview.btndata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataPegawaiMVC data = new DataPegawaiMVC();
            }
        });
        
        gajipegawaiview.btnpetunjuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PetunjukPegawaiMVC petunjuk = new PetunjukPegawaiMVC();
            }
        });
        
        /*gajipegawaiview.btnadmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminLoginMVC login = new AdminLoginMVC();
            }
        });*/
    }
}
