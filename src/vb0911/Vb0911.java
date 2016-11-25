/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vb0911;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Vb0911 extends JFrame{
    public static void main(String[] args) {
        JFrame frame  = new Vb0911();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Voorbeeld 0911");
        frame.setContentPane( new Paneel());
        frame.setVisible(true);
    }
    
}

class Paneel extends JPanel{
    private int aantal;
    private JButton knop;
    
    public Paneel(){
        knop = new JButton("Klik");
        ActionListener handler = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                aantal++;
                repaint();
            }
        
    };
    knop.addActionListener(handler);
    add(knop);
    }

public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i =0; i < aantal; i++)
    g.drawOval(50+ i * 10,50,50,50);
}
}

