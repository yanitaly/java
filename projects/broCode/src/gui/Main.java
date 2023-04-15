package gui;

import java.awt.BorderLayout;


import java.text.SimpleDateFormat;
import java.util.Date;


import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		// # 49 GUI
		// 		JFrame = a GUI window to add components to
		System.out.println(" # 49. GUI ");
 		//MyFrame frame = new MyFrame(); //creates a frame

		// # 50 Labels
		// 		JLabel = a GUI display area for a string of text, an image, or both
		System.out.println(" # 50. labels ");
		/*
		ImageIcon image = new ImageIcon("res/minion.png");
		JLabel label = new JLabel(); //create a label
		label.setText("bro, do you even code?"); //set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of imageicon
		label.setForeground(new Color(0x00FF00)); //set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN,50)); //set font of text
		label.setIconTextGap(-25); //set gap of text to image
		label.setBackground(Color.black); //set background color
		label.setOpaque(true); //display background color
		//label.setBorder(border); //sets border of label (not image+text)
		label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
		label.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions

		MyFrame frame50 = new MyFrame();
		frame50.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500,500);
		//frame.setLayout(null);
		frame50.setVisible(true);	 
		frame50.add(label);
		frame50.pack();
		*/
		
		// # 51 panel 
		// 		JPanel = a GUI component that functions as a container to hold other components
		System.out.println(" # 51. panel ");
		/*
		ImageIcon icon = new ImageIcon("thumbsup.png");
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.LEFT);
		//label.setBounds(100, 100, 75, 75);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setLayout(new BorderLayout());
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setLayout(new BorderLayout());
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout());
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);	
		greenPanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		*/
		
		// # 52 buttons 
		// 	JButton = a button that performs an action when clicked on
		System.out.println(" # 52. buttons ");
		new MyFrame();
		
		// # 53 BorderLayout 
		// Layout Manager = Defines the natural layout for components within a container
		// 3 common managers
		// BorderLayout = 	A BorderLayout places components in five areas: NORTH,SOUTH,WEST,EAST,CENTER. 
		//					All extra space is placed in the center area.
		System.out.println(" # 53 BorderLayout  ");
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout(10,10));
		frame.setVisible(true);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);
		
		panel5.setLayout(new BorderLayout());
				
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(150,100));
		panel3.setPreferredSize(new Dimension(150,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		//------------- sub panels --------------------
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(Color.black);
		panel7.setBackground(Color.darkGray);
		panel8.setBackground(Color.gray);
		panel9.setBackground(Color.lightGray);
		panel10.setBackground(Color.white);
		
		panel5.setLayout(new BorderLayout());
				
		panel6.setPreferredSize(new Dimension(50,50));
		panel7.setPreferredSize(new Dimension(50,50));
		panel8.setPreferredSize(new Dimension(50,50));
		panel9.setPreferredSize(new Dimension(50,50));
		panel10.setPreferredSize(new Dimension(50,50));
	
		panel5.add(panel6,BorderLayout.NORTH);
		panel5.add(panel7,BorderLayout.SOUTH);
		panel5.add(panel8,BorderLayout.WEST);
		panel5.add(panel9,BorderLayout.EAST);
		panel5.add(panel10,BorderLayout.CENTER);
		
		//------------- sub panels --------------------
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.WEST);
		frame.add(panel3,BorderLayout.EAST);
		frame.add(panel4,BorderLayout.SOUTH);
		frame.add(panel5,BorderLayout.CENTER);
	
		// # 54. FlowLayout 
		// Layout Manager = Defines the natural layout for components within a container
		// FlowLayout = 	places components in a row, sized at their preferred size. 
		//					If the horizontal space in the container is too small,
		//					the FlowLayout class uses the next available row.
		System.out.println(" # 54. FlowLayout ");
		JFrame frame54 = new JFrame();
		frame54.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame54.setSize(500, 500);
		frame54.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		frame54.add(new JButton("1"));
		frame54.add(new JButton("2"));
		frame54.add(new JButton("3"));
		frame54.add(new JButton("4"));
		frame54.add(new JButton("5"));
		frame54.add(new JButton("6"));
		frame54.add(new JButton("7"));
		frame54.add(new JButton("8"));
		frame54.add(new JButton("9"));
		
		frame54.setVisible(true);
		
		// # 55. GridLayout 
		// Layout Manager = Defines the natural layout for components within a container
		// GridLayout = 	places components in a grid of cells. 
		//					Each component takes all the available space within its cell, 
		//					and each cell is the same size. 
		System.out.println(" # 55. GridLayout ");
		JFrame frame55 = new JFrame();
		frame55.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame55.setSize(500, 500);
		frame55.setLayout(new GridLayout(3,3,0,0));
		
		frame55.add(new JButton("1"));
		frame55.add(new JButton("2"));
		frame55.add(new JButton("3"));
		frame55.add(new JButton("4"));
		frame55.add(new JButton("5"));
		frame55.add(new JButton("6"));
		frame55.add(new JButton("7"));
		frame55.add(new JButton("8"));
		frame55.add(new JButton("9"));
		
		frame55.setVisible(true);
		
		// # 56. LayeredPane 
		// 			JLayeredPane = Swing container that provides a 
		//    		third dimension for positioning components ex. depth, Z-index     
		System.out.println(" # 56. LayeredPane ");
		 JLabel label1= new JLabel();
		 label1.setOpaque(true);
		 label1.setBackground(Color.RED);
		 label1.setBounds(50,50,200,200);
		 
		 JLabel label2= new JLabel();
		 label2.setOpaque(true);
		 label2.setBackground(Color.GREEN);
		 label2.setBounds(100,100,200,200);
		   
		 JLabel label3= new JLabel();
		 label3.setOpaque(true);
		 label3.setBackground(Color.BLUE);
		 label3.setBounds(150,150,200,200);
		   
		 JLayeredPane layeredPane = new JLayeredPane();
		 layeredPane.setBounds(0,0,500,500);
		   
		 //layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
		 layeredPane.add(label1, Integer.valueOf(0));
		 layeredPane.add(label2, Integer.valueOf(2));
		 layeredPane.add(label3, Integer.valueOf(1));
		    
		 JFrame frame56 = new JFrame("JLayeredPane");
		 frame56.add(layeredPane);
		 frame56.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame56.setSize(new Dimension(500, 500));
		 frame56.setLayout(null);
		 frame56.setVisible(true);
		
		 // # 57. open a new GUI window
		 System.out.println(" # 57. open a new GUI window > in a seperate project ");

		 // # 58. JOptionPane
		 //		pop up a standard dialog box that prompts users for a value 
		 //    	or informs them of something.
		 System.out.println(" # 58. JOptionPane ");
		 /*
		 JOptionPane.showMessageDialog(null, "This is a message dialog box", "title", JOptionPane.PLAIN_MESSAGE);
		 JOptionPane.showMessageDialog(null, "Here is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
		 JOptionPane.showMessageDialog(null, "really?", "title", JOptionPane.QUESTION_MESSAGE);
		 JOptionPane.showMessageDialog(null, "Your computer has a VIRUS!", "title", JOptionPane.WARNING_MESSAGE);
		 JOptionPane.showMessageDialog(null, "CALL TECH SUPPORT OR ELSE!", "title", JOptionPane.ERROR_MESSAGE);
		    
		 int answer = JOptionPane.showConfirmDialog(
				 null, 
				 "bro, do you even code?", 
				 "This is my title", 
				 JOptionPane.YES_NO_CANCEL_OPTION);
		 String name = JOptionPane.showInputDialog("What is your name?: ");

		 ImageIcon icon = new ImageIcon("res/minion.png");
		 String[] responses = {"No, you are!","thank you!","*blush*"};
		 int answer1 = JOptionPane.showOptionDialog(
				 null,
			    "You are the best! :D", 
			    "Secret message", 
			    JOptionPane.DEFAULT_OPTION, 
			    0, 
			    icon, 
			    responses, 
			    responses[0]);
		  System.out.println(answer1);
		*/
		 
		 // # 59. textfield
		 // 			JTextField = A GUI textbox component that can be used to add, set, or get text
		 System.out.println(" # 59. TextField: ");
		 new MyFrameTextField();
		 
		 // # 60. checkbox
         // 			JCheckBox = A GUI component that can be selected or deselected
		 System.out.println(" # 60. checkbox ");
		 new MyFrameCheckBox();

		 // # 61. radio buttons
		 System.out.println(" # 61. radio buttons ");

		 // # 62. combobox
		 System.out.println(" # 62. combobox ");

		 // # 63 slider
		 System.out.println(" # 63 slider ");

		 // # 64. progress bar
		 System.out.println(" # 64. progress bar ");

		 // # 65. menu bar
		 System.out.println(" # 65. menu bar");

		 // # 66. select a file
		 // 	JFileChooser = A GUI mechanism that let's a user choose a file (helpful for opening or saving files)
		 System.out.println(" # 66. select a file");
         new MyFrameSelectFile();


		 // # 67. color chooser
		 System.out.println(" # 67. color chooser");
		 
		 // # 68. KeyListener
		 System.out.println(" # # 68. KeyListener");

		 // # 69. MouseListener
		 System.out.println(" # 69. MouseListener");
		 
		 // # 70. Key bindings
		 System.out.println(" # 70. Key bindings ");
		 
		 // # 71. 2D graphics
		 System.out.println(" # 71. 2D graphics");
         new MyFrame2DGraphics();
         
		 // # 72. 2D animation
		 System.out.println(" # 72. 2D animation");
         new MyFrame2DAnimation();

		 
		 //==== ALGORITHM =====================================================
		
		 // # 73. 
		 // # 7
		 // # 7
		 // # 7
		 // # 91 clock app 
		 System.out.println(" # 91. clock app: ");
         
         // displaying day of week
         SimpleDateFormat simpleformat = new SimpleDateFormat("EEEE");
         String strDayofWeek = simpleformat.format(new Date());
         System.out.println("Day of Week = "+strDayofWeek);  // Day of Week = 星期日
         
         new MyFrameClockApp();
         
		 // # 7
		 // # 7
		 // # 7
		 
		 // # 7
		 // # 7
		 
		 
		 
	}

}
