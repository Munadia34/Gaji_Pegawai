
package gajiresponsi;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DataPegawaiView extends JFrame{
    JLabel footer, bg;
    JButton btnhome, btnadmin, btnpetunjuk, btngaji, btndata;
    ImageIcon ghome, gadmin, gpetunjuk, ggaji, gdata;
    public String [] kolom = {"ID", "Nama", "Posisi", "Gaji", "Jam Lembur", "Tunjangan", "Total Gaji"};//kolom
    JTable tabel;
    JScrollPane s1;
    DefaultTableModel tableModel;
    
    public DataPegawaiView(){
        footer = new JLabel("APLIKASI PENGHITUNGAN GAJI PT. VETERAN JAYA");
        footer.setFont(new Font("Arial Black", Font.PLAIN, 26));
        footer.setBackground(Color.WHITE);
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
        tableModel = new DefaultTableModel(kolom,0);
        tabel = new JTable(tableModel);
        s1      = new JScrollPane(tabel);
        bg = new JLabel(new ImageIcon(getClass().getResource("/image/bg2_1.png")));
        
        setLayout(null);
        add(bg);
        add(btnhome);
        add(btndata);
        add(btngaji);
        add(btnpetunjuk);
        add(btnadmin);
        add(footer);
        add(s1);
        
        bg.setBounds(0, 0, 1300, 800);
        btnhome.setBounds(25, 25, 240, 135);
        s1.setBounds(350, 200, 700, 350);
        btngaji.setBounds(25, 175, 240, 135);
        btndata.setBounds(25, 325, 240, 135);
        btnadmin.setBounds(1000, 25, 240, 135);
        btnpetunjuk.setBounds(25, 475, 240, 135);
        footer.setBounds(250, 650, 800, 150);
        s1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(1300, 800);
    }
}
