/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tampilan;

import View.Dosen.ViewDataDosen;
import View.Mahasiswa.ViewDataMahasiswa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TampilanUtama extends JFrame implements ActionListener{
    
    JLabel header = new JLabel("Selamat Datang :)");
    JLabel text1 = new JLabel("Pilih salah satu data !");
    JButton button1 = new JButton("Mahasiswa");
    JButton button2 = new JButton("Dosen");
    
    public TampilanUtama (){
        
        setTitle("Tampilan Utama");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setSize(500, 400);
        
        add(header);
        header.setBounds(150, 40, 200, 30);
        header.setFont(new Font("Arial", Font.BOLD,20));
        
        add(text1);
        text1.setBounds(20, 100, 400, 40);
        text1.setFont(new Font("Arial", Font.BOLD,16));
        
        add(button1);
        button1.setBounds(20, 180, 220, 50);
        
        add(button2);
        button2.setBounds(245, 180, 220, 50);
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        
    }
       
    @Override
        public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1){
            new ViewDataMahasiswa();
        }
        
        if (e.getSource() == button2){
            new ViewDataDosen();
        }       
        this.dispose();
    }
}
