package start_view;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

// game clear class
class Game_Clear extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/clear_view.png");
	Image main_image = image.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(main_image, 0, 0, 1024, 758, this);
	}
}
// game over class
class Game_Over extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/game_over.jpg");
	Image main_image = image.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(main_image, 0, 0, 1024, 758, this);
	}
}

// timer label class
class Timer_Label extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/timer.png");
	Image main_image = image.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(main_image, 0, 0, 256, 64, this);
	}
}
// timer item button
class Timer_Item_Btn extends JButton {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/timer_item.png");
	Image main_image = image.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(main_image, 0, 0, 512, 64, this);
	}
}
// hint button
class Hint_Btn extends JButton {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/hint.png");
	Image main_image = image.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(main_image, 0, 0, 256, 64, this);
	}
}
// title of life label
class Life_Title extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/life.png");
	Image main_image = image.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(main_image, 0, 0, 256, 64, this);
	}
}
// life icon
class Life_icon extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/heart.png");
	Image main_image = image.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(main_image, 0, 0, 64, 64, this);
	}
}
// O mark
class Correct_check extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/correct.png");
	Image main_image = image.getImage();
	
	public void paintComponent(Graphics g) {
       	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 64, 75, this);
    }
}
// X mark
class Wrong_check extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/wrong.png");
	Image main_image = image.getImage();
	
	public void paintComponent(Graphics g) {
       	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 64, 75, this);
    }
}

class Easy_1_1 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/1-1.jpg");
	Image main_image = image.getImage();
	
    public void paintComponent(Graphics g) {
       	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Easy_1_2 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/1-2.jpg");
	Image main_image = image.getImage();
	
    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Easy_2_1 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/2-1.jpg");
	Image main_image = image.getImage();
	
    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Easy_2_2 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/2-2.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Easy_3_1 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/3-1.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Easy_3_2 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/3-2.jpg");
	Image main_image = image.getImage();
	
    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Easy_4_1 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/4-1.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Easy_4_2 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/4-2.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Easy_5_1 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/5-1.jpg");
	Image main_image = image.getImage();
	
    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Easy_5_2 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/5-2.jpg");
	Image main_image = image.getImage();

	public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}


class Normal_1_1 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/6-1.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Normal_1_2 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/6-2.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Normal_2_1 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/7-1.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Normal_2_2 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/7-2.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Normal_3_1 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/8-1.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Normal_3_2 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/8-2.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Normal_4_1 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/9-1.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Normal_4_2 extends JPanel {
	ImageIcon image = new ImageIcon("C:/Users/user/Desktop/Wrong_Picture/src/start_view/9-2.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Normal_5_1 extends JPanel {
	ImageIcon image = new ImageIcon("C:/Users/user/Desktop/Wrong_Picture/src/start_view/10-1.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Normal_5_2 extends JPanel {
	ImageIcon image = new ImageIcon("C:/Users/user/Desktop/Wrong_Picture/src/start_view/10-2.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Hard_1_1 extends JPanel {
	ImageIcon image = new ImageIcon("C:/Users/user/Desktop/Wrong_Picture/src/start_view/11-1.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Hard_1_2 extends JPanel {
	ImageIcon image = new ImageIcon("C:/Users/user/Desktop/Wrong_Picture/src/start_view/11-2.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Hard_2_1 extends JPanel {
	ImageIcon image = new ImageIcon("C:/Users/user/Desktop/Wrong_Picture/src/start_view/12-1.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Hard_2_2 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/12-2.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Hard_3_1 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/13-1.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Hard_3_2 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/13-2.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Hard_4_1 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/14-1.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Hard_4_2 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/14-2.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Hard_5_1 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/15-1.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}
class Hard_5_2 extends JPanel {
	ImageIcon image = new ImageIcon(MainFrame.class.getResource("").getPath() + "/image/15-2.jpg");
	Image main_image = image.getImage();

    public void paintComponent(Graphics g) {
      	super.paintComponent(g);
        g.drawImage(main_image, 0, 0, 512, 600, this);
    }
}