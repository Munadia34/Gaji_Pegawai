
package gajiresponsi;

import java.awt.Color;
import java.awt.Font;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;;

public class HomePegawaiView extends JFrame {
    JLabel home1, home2, home3, home4, footer,bg;
    JButton btnhome, btnadmin, btnpetunjuk, btngaji, btndata;
    ImageIcon ghome, gadmin, gpetunjuk, ggaji, gdata;
     
     public HomePegawaiView(){
        //label
        home1 = new JLabel("Selamat Datang,");
        home1.setBackground(Color.WHITE);
        home1.setFont(new Font("Arial Black", Font.PLAIN, 26));
        home2 = new JLabel("Silahkan Masuk ke menu gaji");
        home2.setFont(new Font("Arial Black", Font.PLAIN, 26));
        home2.setBackground(Color.WHITE);
        home3 = new JLabel("Jika mengalami kesulitan, klik menu petunjuk");
        home3.setFont(new Font("Arial Black", Font.PLAIN, 26));
        home3.setBackground(Color.WHITE);
        home4 = new JLabel("untuk melakukan perhitungan gaji.");
        home4.setFont(new Font("Arial Black", Font.PLAIN, 26));
        home4.setBackground(Color.WHITE);
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
        add(footer);
        add(bg);
        
        bg.setBounds(0, 0, 1300, 800);
        btnhome.setBounds(25, 25, 240, 135);
        btngaji.setBounds(25, 175, 240, 135);
        btndata.setBounds(25, 325, 240, 135);
        btnadmin.setBounds(1000, 25, 240, 135);
        btnpetunjuk.setBounds(25, 475, 240, 135);
        home1.setBounds(325, 125, 700, 150);
        home2.setBounds(325, 175, 700, 150);
        home4.setBounds(325, 225, 700, 150);
        home3.setBounds(325, 275, 700, 150);
        footer.setBounds(250, 650, 800, 150);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(1300, 800);
     }
}
