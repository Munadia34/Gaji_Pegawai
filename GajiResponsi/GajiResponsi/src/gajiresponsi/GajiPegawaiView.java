package gajiresponsi;

import java.awt.Color;
import java.awt.Font;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;;

public class GajiPegawaiView extends JFrame {
    JLabel home1, home2, home3, home4, home5, home6, home7, home8, home9, footer,bg;
    JButton btnhome, btnadmin, btnpetunjuk, btngaji, btndata,btnsimpan,btnhitung;
    ImageIcon ghome, gadmin, gpetunjuk, ggaji, gdata,gsimpan,ghitung;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
     
     public GajiPegawaiView(){
        //label
        home1 = new JLabel("ID Pegawai");
        home1.setBackground(Color.WHITE);
        home1.setFont(new Font("Arial Black", Font.PLAIN, 26));
        home2 = new JLabel("Nama");
        home2.setFont(new Font("Arial Black", Font.PLAIN, 26));
        home2.setBackground(Color.WHITE);
        home3 = new JLabel("Alamat");
        home3.setFont(new Font("Arial Black", Font.PLAIN, 26));
        home3.setBackground(Color.WHITE);
        home4 = new JLabel("No HP");
        home4.setFont(new Font("Arial Black", Font.PLAIN, 26));
        home4.setBackground(Color.WHITE);
        home5 = new JLabel("Gaji Pokok");
        home5.setFont(new Font("Arial Black", Font.PLAIN, 26));
        home5.setBackground(Color.WHITE);
        home6 = new JLabel("Jam Lembur");
        home6.setFont(new Font("Arial Black", Font.PLAIN, 26));
        home6.setBackground(Color.WHITE);
        home7 = new JLabel("Tunjnagan");
        home7.setFont(new Font("Arial Black", Font.PLAIN, 26));
        home7.setBackground(Color.WHITE);
        home8 = new JLabel("Pajak");
        home8.setFont(new Font("Arial Black", Font.PLAIN, 26));
        home8.setBackground(Color.WHITE);
        home9 = new JLabel("Total");
        home9.setFont(new Font("Arial Black", Font.PLAIN, 26));
        home9.setBackground(Color.WHITE);
        footer = new JLabel("APLIKASI PENGHITUNGAN GAJI PT. VETERAN JAYA");
        footer.setFont(new Font("Arial Black", Font.PLAIN, 26));
        bg = new JLabel(new ImageIcon(getClass().getResource("/image/bg2_1.png")));
        footer.setBackground(Color.WHITE);
        //button
        ghome = new ImageIcon(getClass().getResource("/image/home.png"));
        btnhome    = new JButton("HOME",ghome);
        gdata = new ImageIcon(getClass().getResource("/image/doc.png"));
        btndata    = new JButton("DATA",gdata);
        ggaji = new ImageIcon(getClass().getResource("/image/pegawai.png"));
        btngaji    = new JButton("GAJI",ggaji);
        gpetunjuk = new ImageIcon(getClass().getResource("/image/help.png"));
        btnpetunjuk    = new JButton("PETUNJUK",gpetunjuk);
        gadmin = new ImageIcon(getClass().getResource("/image/admin.png"));
        btnadmin    = new JButton("ADMIN",gadmin);
gsimpan = new ImageIcon(getClass().getResource("/image/save.png"));
        btnsimpan    = new JButton("SIMPAN",gsimpan);
        ghitung = new ImageIcon(getClass().getResource("/image/uang.jpeg"));
        btnhitung    = new JButton("HITUNG",ghitung);
        bg = new JLabel(new ImageIcon(getClass().getResource("/image/bg2_1.png")));

        t1 = new JTextField("");
        t2 = new JTextField("");
        t3 = new JTextField("");
        t4 = new JTextField("");
        t5 = new JTextField("");
        t6 = new JTextField("");
        t7 = new JTextField("");
        t8 = new JTextField("");
        t9 = new JTextField("");
       
        
        setLayout(null);
        add(btnhome);
        add(btndata);
        add(btngaji);
        add(btnpetunjuk);
        add(btnadmin);
        add(home1);
        add(home2);
        add(home3);
        add(home4);
        add(home5);
        add(home6);
        add(home7);
        add(home8);
        add(home9);
        add(footer);
        add(bg);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        add(t8);
        add(t9);
 add(btnhome);
        add(btndata);
        add(btngaji);
        add(btnpetunjuk);
        add(btnadmin);
        add(footer);
        add(btnsimpan);
        add(btnhitung);
        add(bg);
        
        bg.setBounds(0, 0, 1300, 700);
        btnhome.setBounds(25, 25, 240, 135);
        btngaji.setBounds(25, 175, 240, 135);
        btndata.setBounds(25, 325, 240, 135);
        btnadmin.setBounds(1000, 25, 240, 135);
        btnpetunjuk.setBounds(25, 475, 240, 135);
        home1.setBounds(325, 25, 700, 150);
        home2.setBounds(325, 75, 700, 150);
        home4.setBounds(325, 125, 700, 150);
        home3.setBounds(325, 175, 700, 150);
        home5.setBounds(325, 225, 700, 150);
        home6.setBounds(325, 275, 700, 150);
        home7.setBounds(325, 325, 700, 150);
        home8.setBounds(325, 375, 700, 150);
        home9.setBounds(325, 425, 700, 150);
        footer.setBounds(250, 500, 800, 150);
btnhome.setBounds(25, 25, 240, 135);
        btngaji.setBounds(25, 175, 240, 135);
        btndata.setBounds(25, 325, 240, 135);
        btnadmin.setBounds(1000, 25, 240, 135);
        btnpetunjuk.setBounds(25, 475, 240, 135);
        footer.setBounds(425, 650, 700, 150);
        btnsimpan.setBounds(1000, 575, 240, 135);
        btnhitung.setBounds(1000, 425, 240, 135);
        bg.setBounds(0, 0, 1300, 800);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(1300, 700);
     }
}
