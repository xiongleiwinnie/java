package com.baguaxingqiu.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("BAGUA");
		f.setSize(400, 300);
		f.setLocation(200, 200);
		f.setLayout(null);
		
		final JLabel l = new JLabel();
		ImageIcon i = new ImageIcon("C:/Users/winnifred/Downloads/shana.png");
		l.setIcon(i);
		l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());
		
		JButton b = new JButton("hide");
		b.setBounds(50, 50, 280, 30);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				l.setVisible(false);
				
			}
		});
		
		f.add(b);
		f.add(l);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		

	}

}
