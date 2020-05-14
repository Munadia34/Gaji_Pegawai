
package gajiresponsi;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PetunjukPegawaiView extends JFrame{
    JLabel header, satu, dua, tiga, gambar1, gambar2, bg;
    JButton home;
    
    public PetunjukPegawaiView(){
        header = new JLabel("PETUNJUK KARYAWAN");
        header.setFont(new Font("Arial Black", Font.PLAIN, 26));
        satu = new JLabel("Klik tombol gaji untuk menghitung gaji anda");
        satu.setFont(new Font("Arial Black", Font.PLAIN, 26));
        dua = new JLabel("Klik tombol data untuk melihat data");
        dua.setFont(new Font("Arial Black", Font.PLAIN, 26));
        tiga = new JLabel("Sudah masuk atau belum");
        tiga.setFont(new Font("Arial Black", Font.PLAIN, 26));
        header.setFont(new Font("Arial Black", Font.PLAIN, 26));
        header.setFont(new Font("Arial Black", Font.PLAIN, 26));
        gambar1 = new JLabel(new ImageIcon(getClass().getResource("/image/pegawai.png")));
        gambar2 = new JLabel(new ImageIcon(getClass().getResource("/image/doc.png")));
        home = new JButton("Home");
        bg = new JLabel(new ImageIcon(getClass().getResource("/image/bg2_1.png")));
        
        setLayout(null);
        add(header);
        add(satu);
        add(dua);
        add(tiga);
        add(gambar1);
        add(gambar2);
        add(home);
        add(bg);
        
        header.setBounds(475, 25, 440, 135);
        gambar1.setBounds(250, 175, 150, 135);
        satu.setBounds(425, 175, 700, 135);
        gambar2.setBounds(250, 325, 150, 135);
        dua.setBounds(425, 300, 700, 135);
        tiga.setBounds(425, 350, 700, 135);
        home.setBounds(600, 600, 100, 30);
        bg.setBounds(0, 0, 1300, 800);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(1300, 800);
    }
}
