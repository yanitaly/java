package gui;

import javax.swing.*;

public class MyFrame2DGraphics extends JFrame{
	 //Image image;
	 MyPanel2DGraphics panel;
	 
	 MyFrame2DGraphics(){
		 panel = new MyPanel2DGraphics();
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.add(panel);
		 this.pack();
		 this.setLocationRelativeTo(null);
		 this.setVisible(true);
	 }
}