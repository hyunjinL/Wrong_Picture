package start_view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainFrame extends JFrame {
	public easy_btn btn1;
	public normal_btn btn2;
	public hard_btn btn3;
	String path;
	
	public MainFrame() {
		path = MainFrame.class.getResource("").getPath();
		System.out.println(path);
// to center the frame -> Toolkit, Dimension
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

// Frame size config
		setTitle("Wrong Picture Find");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// position Frame at the center of screen size
		setLocation(screenSize.width/2 - 512 , screenSize.height/2 - 384);
	
// create panel object and add container
		Main_Panel panel = new Main_Panel();
		Title title_panel = new Title();
		
		panel.setLayout(null);
		panel.add(title_panel);
		
		title_panel.setBounds(215, 100, 600, 100);
		title_panel.setOpaque(false);
		
		btn1 = new easy_btn();
		panel.add(btn1);
		
		btn2 = new normal_btn();
		panel.add(btn2);
		
		btn3 = new hard_btn();
		panel.add(btn3);
		
// placement of components Using absolute coordinates
		btn1.setBounds(412, 384, 200, 70);
		btn1.setOpaque(false);
		btn1.setBorderPainted(false);
		btn1.setContentAreaFilled(false);
		btn1.setFocusPainted(false);
		
		btn2.setBounds(412, 500, 200, 70);
		btn2.setOpaque(false);
		btn2.setBorderPainted(false);
		btn2.setContentAreaFilled(false);
		btn2.setFocusPainted(false);
		
		btn3.setBounds(412, 616, 200, 70);
		btn3.setOpaque(false);
		btn3.setBorderPainted(false);
		btn3.setContentAreaFilled(false);
		btn3.setFocusPainted(false);
		
		// registering event listeners with components
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Easy_Panel panel_easy = new Easy_Panel();
				
				// all component remove
				getContentPane().removeAll();
				// add wanted component
				add(panel_easy);
				setVisible(false);
				setVisible(true);
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Normal_Panel panel_normal = new Normal_Panel();
				
				getContentPane().removeAll();
				add(panel_normal);
				setVisible(false);
				setVisible(true);
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hard_Panel panel_hard = new Hard_Panel();
				
				getContentPane().removeAll();
				add(panel_hard);
				setVisible(false);
				setVisible(true);
			}
		});
		
		add(panel);
		
		setSize(1036, 768);
		setVisible(true);
	}

	class Main_Panel extends JPanel {
		// bring image
		ImageIcon image = new ImageIcon(path + "/image/main_view.jpg");

		Image main_image = image.getImage();

		// painComponent overriding
        public void paintComponent(Graphics g) {
          	super.paintComponent(g);
           	// original image filled in panel
            g.drawImage(main_image, 0, 0, this.getWidth(), this.getHeight(), this);
        }
	}
}
// title class
class Title extends JPanel {
	String path = MainFrame.class.getResource("").getPath();
	ImageIcon image = new ImageIcon(path + "/image/title.png");
	Image main_image = image.getImage();
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(main_image, 0, 0, 600, 100, this);
	}
}
// easy button
class easy_btn extends JButton {
	String path = MainFrame.class.getResource("").getPath();
	ImageIcon image = new ImageIcon(path + "/image/level1.png");
	Image main_image = image.getImage();
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(main_image, 0, 0, 200, 70, this);
	}
}
// normal button
class normal_btn extends JButton {
	String path = MainFrame.class.getResource("").getPath();
	ImageIcon image = new ImageIcon(path + "/image/level2.png");
	Image main_image = image.getImage();
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(main_image, 0, 0, 200, 70, this);
	}
}
// hard button
class hard_btn extends JButton {
	String path = MainFrame.class.getResource("").getPath();
	ImageIcon image = new ImageIcon(path + "/image/level3.png");
	Image main_image = image.getImage();
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(main_image, 0, 0, 200, 70, this);
	}
}

class Wrong_pic {
	public static void main(String[] args) {
		MainFrame t = new MainFrame();
	}
}