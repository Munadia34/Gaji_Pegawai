
package gajiresponsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class DataPegawaiController {
    DataPegawaiView datapegawaiview;
    DataPegawaiDAO datapegawaidao;
    DataPegawaiModel datapegawaimodel;
    
    public DataPegawaiController(DataPegawaiView datapegawaiview, DataPegawaiDAO datapegawaidao, DataPegawaiModel datapegawaimodel){
        this.datapegawaiview = datapegawaiview;
        this.datapegawaidao = datapegawaidao;
        this.datapegawaimodel = datapegawaimodel;
        
        datapegawaiview.btnhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomePegawaiMVC home = new HomePegawaiMVC();
            }
        });
        
        datapegawaiview.btngaji.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GajiPegawaiMVC gaji = new GajiPegawaiMVC();
            }
        });
        
        datapegawaiview.btndata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataPegawaiMVC data = new DataPegawaiMVC();
            }
        });
        
        datapegawaiview.btnpetunjuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PetunjukPegawaiMVC petunjuk = new PetunjukPegawaiMVC();
            }
        });
        
        /*datapegawaiview.btnadmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminLoginMVC login = new AdminLoginMVC();
            }
        });*/
    }
}
