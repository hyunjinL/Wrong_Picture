package start_view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.util.Timer;

import javax.swing.*;

import start_view.Easy_Panel.MyTimerTask;

class Normal_Panel extends JPanel implements MouseListener {
	Normal_1_1 pic_1_1 = new Normal_1_1();
	Normal_1_2 pic_1_2 = new Normal_1_2();
	Normal_2_1 pic_2_1 = new Normal_2_1();
	Normal_2_2 pic_2_2 = new Normal_2_2();
	Normal_3_1 pic_3_1 = new Normal_3_1();
	Normal_3_2 pic_3_2 = new Normal_3_2();
	Normal_4_1 pic_4_1 = new Normal_4_1();
	Normal_4_2 pic_4_2 = new Normal_4_2();
	Normal_5_1 pic_5_1 = new Normal_5_1();
	Normal_5_2 pic_5_2 = new Normal_5_2();
	
	Life_Title life_t = new Life_Title();
	Life_icon life_1, life_2, life_3, hint_1, hint_2, hint_3;
	Timer_Label timer_l = new Timer_Label();
	Timer_Item_Btn timer_btn = new Timer_Item_Btn();
	Hint_Btn hint_btn = new Hint_Btn();
	public int Life_Count;
	public int Hint_Count;
	public int Answer_Count;
	public int Stage_Count;
	public int Main_Time;
	public int Timer_Item_Count;
	Game_Over game_finish = new Game_Over();
	Game_Clear game_clear = new Game_Clear();
	Wrong_check w_check1 = new Wrong_check();
	Wrong_check w_check2 = new Wrong_check();
	
	CardLayout card1 = new CardLayout();
	CardLayout card2 = new CardLayout();
	JPanel card1_pan = new JPanel();
	JPanel card2_pan = new JPanel();
	JPanel main_card_pan = new JPanel();
	
	public Rectangle[][] rect_point = new Rectangle[8][8];
	public Point[][] points = new Point[5][5];
	public int check_x, check_y;
	public int[][][] check_arr = new int[5][8][8];
	
	Time1 t1 = new Time1();
	Time2 t2 = new Time2();
	Time3 t3 = new Time3();
	Time4 t4 = new Time4();
	Time5 t5 = new Time5();
	Time6 t6 = new Time6();
	Time7 t7 = new Time7();
	Timer main_timer = new Timer(true);
	MyTimerTask main_task = new MyTimerTask();
	
	public Normal_Panel() {
		
		for(int i = 0 ; i < 5 ; i ++)
		{
			for(int j = 0 ; j < 8 ; j++)
			{
				for(int k = 0 ; k < 8 ; k++)
					check_arr[i][j][k] = 0;
			}
		}
		
		points[0][0] = new Point(0, 4);
		points[0][1] = new Point(2, 7);
		points[0][2] = new Point(4, 6);
		points[0][3] = new Point(5, 6);
		points[0][4] = new Point(7, 1);
		points[1][0] = new Point(2, 5);
		points[1][1] = new Point(4, 2);
		points[1][2] = new Point(4, 6);
		points[1][3] = new Point(5, 6);
		points[1][4] = new Point(6, 2);
		points[2][0] = new Point(0, 4);
		points[2][1] = new Point(2, 0);
		points[2][2] = new Point(2, 3);
		points[2][3] = new Point(3, 7);
		points[2][4] = new Point(7, 4);
		points[3][0] = new Point(1, 7);
		points[3][1] = new Point(3, 2);
		points[3][2] = new Point(5, 0);
		points[3][3] = new Point(5, 6);
		points[3][4] = new Point(7, 3);
		points[4][0] = new Point(0, 7);
		points[4][1] = new Point(1, 0);
		points[4][2] = new Point(2, 0);
		points[4][3] = new Point(4, 5);
		points[4][4] = new Point(6, 0);
				
		w_check1.setOpaque(false);
		w_check2.setOpaque(false);
		
		life_t.setOpaque(false);
		
		life_1 = new Life_icon();
		life_2 = new Life_icon();
		life_3 = new Life_icon();
		life_1.setOpaque(false);
		life_2.setOpaque(false);
		life_3.setOpaque(false);
		
		hint_1 = new Life_icon();
		hint_2 = new Life_icon();
		hint_3 = new Life_icon();
		hint_1.setOpaque(false);
		hint_2.setOpaque(false);
		hint_3.setOpaque(false);
		
		timer_l.setOpaque(false);
		timer_btn.setOpaque(false);
		hint_btn.setOpaque(false);
		
		setSize(1024, 768);
		setBackground(Color.WHITE);

		this.setLayout(null);
		this.add(pic_1_1);
		this.add(pic_1_2);
		this.add(life_t);
		this.add(life_1);
		this.add(life_2);
		this.add(life_3);
		this.add(hint_1);
		this.add(hint_2);
		this.add(hint_3);
		this.add(timer_l);
		this.add(timer_btn);
		this.add(hint_btn);
		this.add(t1);
		this.add(t2);
		this.add(t3);
		this.add(t4);
		this.add(t5);
		this.add(t6);
		this.add(t7);

// cardLayout control
		main_card_pan.setLayout(null);
		card1_pan.setLayout(card1);
		card2_pan.setLayout(card2);
		card1_pan.add(pic_1_1);
		card1_pan.add(pic_2_1);
		card1_pan.add(pic_3_1);
		card1_pan.add(pic_4_1);
		card1_pan.add(pic_5_1);
		card2_pan.add(pic_1_2);
		card2_pan.add(pic_2_2);
		card2_pan.add(pic_3_2);
		card2_pan.add(pic_4_2);
		card2_pan.add(pic_5_2);
		main_card_pan.add(card1_pan);
		main_card_pan.add(card2_pan);
		card1_pan.setBounds(0, 0, 512, 600);
		card2_pan.setBounds(512, 0, 512, 600);
		add(main_card_pan);
		main_card_pan.setBounds(0, 0, 1024, 768);
		
		pic_1_1.add(w_check1);
		pic_1_2.add(w_check2);
		w_check1.setBounds(-1000, -3000, 64, 75);
		w_check2.setBounds(-1100, -3100, 65, 75);
		
		pic_1_1.setBounds(0, 0, 512, 600);
		pic_1_2.setBounds(512, 0, 512, 600);
		life_t.setBounds(0, 600, 256, 64);
		life_1.setBounds(256, 600, 64, 64);
		life_2.setBounds(352, 600, 64, 64);
		life_3.setBounds(444, 600, 64, 64);
		hint_1.setBounds(768, 600, 64, 64);
		hint_2.setBounds(864, 600, 64, 64);
		hint_3.setBounds(956, 600, 64, 64);
		timer_l.setBounds(0, 664, 256, 64);
		timer_btn.setBounds(512, 664, 512, 64);
		hint_btn.setBounds(512, 600, 256, 64);
		t1.setBounds(-111, -222, 256, 64);
		t2.setBounds(-111, -222, 256, 64);
		t3.setBounds(-111, -222, 256, 64);
		t4.setBounds(-111, -222, 256, 64);
		t5.setBounds(-111, -222, 256, 64);
		t6.setBounds(-111, -222, 256, 64);
		t7.setBounds(-111, -222, 256, 64);
		t1.setOpaque(false);
		t2.setOpaque(false);
		t3.setOpaque(false);
		t4.setOpaque(false);
		t5.setOpaque(false);
		t6.setOpaque(false);
		t6.setOpaque(false);
		
		timer_btn.setBorderPainted(false);
		timer_btn.setContentAreaFilled(false);
		timer_btn.setFocusPainted(false);
		
		hint_btn.setBorderPainted(false);
		hint_btn.setContentAreaFilled(false);
		hint_btn.setFocusPainted(false);
		
		check_x = check_y = -10;
		Life_Count = 3;
		Hint_Count = 3;
		Answer_Count = 0;
		Stage_Count = 1;
		Main_Time = 70000;
		Timer_Item_Count = 1;
		
		pic_1_1.addMouseListener(this);
		pic_1_2.addMouseListener(this);
		pic_2_1.addMouseListener(this);
		pic_2_2.addMouseListener(this);
		pic_3_1.addMouseListener(this);
		pic_3_2.addMouseListener(this);
		pic_4_1.addMouseListener(this);
		pic_4_2.addMouseListener(this);
		pic_5_1.addMouseListener(this);
		pic_5_2.addMouseListener(this);
		
		// when hint button push, event execute
		hint_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Hint_Count > 0)
				{
					Random r = new Random();
					int temp = r.nextInt(5);
				
					Correct_check c1 = new Correct_check();
					Correct_check c2 = new Correct_check();

					c1.setOpaque(false);
					c2.setOpaque(false);
					if(Stage_Count == 1)
					{
						pic_1_1.add(c1);
						pic_1_2.add(c2);
					}
					else if(Stage_Count == 2)
					{
						pic_2_1.add(c1);
						pic_2_2.add(c2);
					}
					else if(Stage_Count == 3)
					{
						pic_3_1.add(c1);
						pic_3_2.add(c2);
					}
					else if(Stage_Count == 4)
					{
						pic_4_1.add(c1);
						pic_4_2.add(c2);
					}
					else if(Stage_Count == 5)
					{
						pic_5_1.add(c1);
						pic_5_2.add(c2);
					}
					
					c1.setBounds(rect_point[points[Stage_Count-1][temp].x][points[Stage_Count-1][temp].y].x, 
							rect_point[points[Stage_Count-1][temp].x][points[Stage_Count-1][temp].y].y, 64, 75);
					c2.setBounds(rect_point[-(points[Stage_Count-1][temp].x-7)][-(points[Stage_Count-1][temp].y-7)].x, 
							rect_point[-(points[Stage_Count-1][temp].x-7)][-(points[Stage_Count-1][temp].y-7)].y, 64, 75);
				
					// appear O mark a period of time and then disappear
					Timer w_timer = new Timer(true);
					TimerTask w_task = new TimerTask() {
						public void run() {
							c1.setBounds(-1000, -2000, 64, 75);
							c2.setBounds(-1100, -2200, 64, 75);
						}
					};
					w_timer.schedule(w_task, 1000);
					
					if(Hint_Count == 3)
						hint_3.setBounds(-3331, -3332, 64, 64);
					else if(Hint_Count == 2)
						hint_2.setBounds(-233, -133, 64, 64);
					else if(Hint_Count == 1)
						hint_1.setBounds(-433, -533, 64, 64);
					Hint_Count--;
				}
			}
		});
		
		timer_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Timer_Item_Count > 0)
				{
					if(Main_Time / 10000 == 5)
					{
						t6.setBounds(-256, -664, 256, 64);
						t7.setBounds(256, 664, 256, 64);
					}
					else if(Main_Time / 10000 == 4)
					{
						t5.setBounds(-256, -664, 256, 64);
						t6.setBounds(256, 664, 256, 64);
					}
					else if(Main_Time / 10000 == 3)
					{
						t4.setBounds(-256, -664, 256, 64);
						t5.setBounds(256, 664, 256, 64);
					}
					else if(Main_Time / 10000 == 2)
					{
						t3.setBounds(-256, -664, 256, 64);
						t4.setBounds(256, 664, 256, 64);
					}
					else if(Main_Time / 10000 == 1)
					{
						t2.setBounds(-256, -664, 256, 64);
						t3.setBounds(256, 664, 256, 64);
					}
					else if(Main_Time / 10000 == 0)
					{
						t1.setBounds(-256, -664, 256, 64);
						t2.setBounds(256, 664, 256, 64);
					}
					Main_Time += 10000;
					Timer_Item_Count--;
				}
			}
		});
		
		for(int i = 0, y = 0 ; i < 8 ; i++, y+=75)
		{
			for(int j = 0, x = 0 ; j < 8 ; j++, x+=64)
				rect_point[i][j] = new Rectangle(x, y, 64, 75);
		}
		main_timer.schedule(main_task, 0, 10000);
		
		setVisible(true);
	}
	public void gameOver() {
		removeAll();
		setVisible(false);
		this.setLayout(null);
		add(game_finish);
		game_finish.setBounds(0, 0, 1024, 758);
		setVisible(true);
	}
	public void gameClear() {
		removeAll();
		setVisible(false);
		this.setLayout(null);
		add(game_clear);
		game_clear.setBounds(0, 0, 1024, 768);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent e){
		int flag = 0;
		if((e.getComponent().equals(pic_1_1)) || (e.getComponent().equals(pic_2_1)) 
				|| (e.getComponent().equals(pic_3_1)) || (e.getComponent().equals(pic_4_1))
				|| (e.getComponent().equals(pic_5_1)))
			flag = 1;
		else
			flag = 2;
		
		Correct_check c_check1 = new Correct_check();
		Correct_check c_check2 = new Correct_check();

		c_check1.setOpaque(false);
		c_check2.setOpaque(false);
		
		if(flag == 1)
		{
			if((e.getX() >= rect_point[points[Stage_Count-1][0].x][points[Stage_Count-1][0].y].x) 
					&& (e.getX() <= (rect_point[points[Stage_Count-1][0].x][points[Stage_Count-1][0].y].x+64)) 
					&& (e.getY() >= rect_point[points[Stage_Count-1][0].x][points[Stage_Count-1][0].y].y) 
					&& ((e.getY() <= rect_point[points[Stage_Count-1][0].x][points[Stage_Count-1][0].y].y+75)))
			{
				check_x = points[Stage_Count-1][0].x; check_y = points[Stage_Count-1][0].y;
			}
			else if((e.getX() >= rect_point[points[Stage_Count-1][1].x][points[Stage_Count-1][1].y].x) 
					&& (e.getX() <= (rect_point[points[Stage_Count-1][1].x][points[Stage_Count-1][1].y].x+64)) 
					&& (e.getY() >= rect_point[points[Stage_Count-1][1].x][points[Stage_Count-1][1].y].y) 
					&& ((e.getY() <= rect_point[points[Stage_Count-1][1].x][points[Stage_Count-1][1].y].y+75)))
			{
				check_x = points[Stage_Count-1][1].x; check_y = points[Stage_Count-1][1].y;
			}
			else if((e.getX() >= rect_point[points[Stage_Count-1][2].x][points[Stage_Count-1][2].y].x) 
					&& (e.getX() <= (rect_point[points[Stage_Count-1][2].x][points[Stage_Count-1][2].y].x+64)) 
					&& (e.getY() >= rect_point[points[Stage_Count-1][2].x][points[Stage_Count-1][2].y].y) 
					&& ((e.getY() <= rect_point[points[Stage_Count-1][2].x][points[Stage_Count-1][2].y].y+75)))
			{
				check_x = points[Stage_Count-1][2].x; check_y = points[Stage_Count-1][2].y;
			}
			else if((e.getX() >= rect_point[points[Stage_Count-1][3].x][points[Stage_Count-1][3].y].x) 
					&& (e.getX() <= (rect_point[points[Stage_Count-1][3].x][points[Stage_Count-1][3].y].x+64)) 
					&& (e.getY() >= rect_point[points[Stage_Count-1][3].x][points[Stage_Count-1][3].y].y) 
					&& ((e.getY() <= rect_point[points[Stage_Count-1][3].x][points[Stage_Count-1][3].y].y+75)))
			{
				check_x = points[Stage_Count-1][3].x; check_y = points[Stage_Count-1][3].y;
			}
			else if((e.getX() >= rect_point[points[Stage_Count-1][4].x][points[Stage_Count-1][4].y].x) 
					&& (e.getX() <= (rect_point[points[Stage_Count-1][4].x][points[Stage_Count-1][4].y].x+64)) 
					&& (e.getY() >= rect_point[points[Stage_Count-1][4].x][points[Stage_Count-1][4].y].y) 
					&& ((e.getY() <= rect_point[points[Stage_Count-1][4].x][points[Stage_Count-1][4].y].y+75)))
			{
				check_x = points[Stage_Count-1][4].x; check_y = points[Stage_Count-1][4].y;
			}
			else
			{
				System.out.println("False");
				if(Stage_Count == 1)
				{
					pic_1_1.add(w_check1);
					pic_1_2.add(w_check2);
				}
				else if(Stage_Count == 2)
				{
					pic_2_1.add(w_check1);
					pic_2_2.add(w_check2);
				}
				else if(Stage_Count == 3)
				{
					pic_3_1.add(w_check1);
					pic_3_2.add(w_check2);
				}
				else if(Stage_Count == 4)
				{
					pic_4_1.add(w_check1);
					pic_4_2.add(w_check2);
				}
				else if(Stage_Count == 5)
				{
					pic_5_1.add(w_check1);
					pic_5_2.add(w_check2);
				}
				w_check1.setBounds(e.getX(), e.getY(), 64, 75);
				w_check2.setBounds(-(e.getX()-512)-64, -(e.getY()-600)-75, 64, 75);
				
			// 	appear X mark a period of time and then disappear
				Timer w_timer = new Timer(true);
				TimerTask w_task = new TimerTask() {
					public void run() {
						w_check1.setBounds(-200, -200, 64, 75);
						w_check2.setBounds(-100, -100, 64, 75);
					}
				};
				w_timer.schedule(w_task, 1000);
				
				if(Life_Count == 3)
					life_3.setBounds(-123, -456, 64, 64);
				else if(Life_Count == 2)
					life_2.setBounds(-123, -456, 64, 64);
				else if(Life_Count == 1)
					life_1.setBounds(-123, -456, 64, 64);
				Life_Count--;
				
				if(Life_Count == 0)
				{
				// 	game over
					System.out.println("Game Over");
					gameOver();
				}
			}
		}
		else if(flag == 2)
		{
			if((e.getX() >= rect_point[-(points[Stage_Count-1][0].x-7)][-(points[Stage_Count-1][0].y-7)].x) 
					&& (e.getX() <= (rect_point[-(points[Stage_Count-1][0].x-7)][-(points[Stage_Count-1][0].y-7)].x+64)) 
					&& (e.getY() >= rect_point[-(points[Stage_Count-1][0].x-7)][-(points[Stage_Count-1][0].y-7)].y) 
					&& ((e.getY() <= rect_point[-(points[Stage_Count-1][0].x-7)][-(points[Stage_Count-1][0].y-7)].y+75)))
			{
				check_x = -(points[Stage_Count-1][0].x-7); check_y = -(points[Stage_Count-1][0].y-7);
			}
			else if((e.getX() >= rect_point[-(points[Stage_Count-1][1].x-7)][-(points[Stage_Count-1][1].y-7)].x) 
					&& (e.getX() <= (rect_point[-(points[Stage_Count-1][1].x-7)][-(points[Stage_Count-1][1].y-7)].x+64)) 
					&& (e.getY() >= rect_point[-(points[Stage_Count-1][1].x-7)][-(points[Stage_Count-1][1].y-7)].y) 
					&& ((e.getY() <= rect_point[-(points[Stage_Count-1][1].x-7)][-(points[Stage_Count-1][1].y-7)].y+75)))
			{
				check_x = -(points[Stage_Count-1][1].x-7); check_y = -(points[Stage_Count-1][1].y-7);
			}
			else if((e.getX() >= rect_point[-(points[Stage_Count-1][2].x-7)][-(points[Stage_Count-1][2].y-7)].x) 
					&& (e.getX() <= (rect_point[-(points[Stage_Count-1][2].x-7)][-(points[Stage_Count-1][2].y-7)].x+64)) 
					&& (e.getY() >= rect_point[-(points[Stage_Count-1][2].x-7)][-(points[Stage_Count-1][2].y-7)].y) 
					&& ((e.getY() <= rect_point[-(points[Stage_Count-1][2].x-7)][-(points[Stage_Count-1][2].y-7)].y+75)))
			{
				check_x = -(points[Stage_Count-1][2].x-7); check_y = -(points[Stage_Count-1][2].y-7);
			}
			else if((e.getX() >= rect_point[-(points[Stage_Count-1][3].x-7)][-(points[Stage_Count-1][3].y-7)].x) 
					&& (e.getX() <= (rect_point[-(points[Stage_Count-1][3].x-7)][-(points[Stage_Count-1][3].y-7)].x+64)) 
					&& (e.getY() >= rect_point[-(points[Stage_Count-1][3].x-7)][-(points[Stage_Count-1][3].y-7)].y) 
					&& ((e.getY() <= rect_point[-(points[Stage_Count-1][3].x-7)][-(points[Stage_Count-1][3].y-7)].y+75)))
			{
				check_x = -(points[Stage_Count-1][3].x-7); check_y = -(points[Stage_Count-1][3].y-7);
			}
			else if((e.getX() >= rect_point[-(points[Stage_Count-1][4].x-7)][-(points[Stage_Count-1][4].y-7)].x) 
					&& (e.getX() <= (rect_point[-(points[Stage_Count-1][4].x-7)][-(points[Stage_Count-1][4].y-7)].x+64)) 
					&& (e.getY() >= rect_point[-(points[Stage_Count-1][4].x-7)][-(points[Stage_Count-1][4].y-7)].y) 
					&& ((e.getY() <= rect_point[-(points[Stage_Count-1][4].x-7)][-(points[Stage_Count-1][4].y-7)].y+75)))
			{
				check_x = -(points[Stage_Count-1][4].x-7); check_y = -(points[Stage_Count-1][4].y-7);
			}
			else
			{
				System.out.println("False");
				if(Stage_Count == 1)
				{
					pic_1_1.add(w_check1);
					pic_1_2.add(w_check2);
				}
				else if(Stage_Count == 2)
				{
					pic_2_1.add(w_check1);
					pic_2_2.add(w_check2);
				}
				else if(Stage_Count == 3)
				{
					pic_3_1.add(w_check1);
					pic_3_2.add(w_check2);
				}
				else if(Stage_Count == 4)
				{
					pic_4_1.add(w_check1);
					pic_4_2.add(w_check2);
				}
				else if(Stage_Count == 5)
				{
					pic_5_1.add(w_check1);
					pic_5_2.add(w_check2);
				}
				w_check2.setBounds(e.getX(), e.getY(), 64, 75);
				w_check1.setBounds(-(e.getX()-512)-64, -(e.getY()-600)-75, 64, 75);
				
			// 	appear X mark a period of time and then disappear 
				Timer w_timer = new Timer(true);
				TimerTask w_task = new TimerTask() {
					public void run() {
						w_check1.setBounds(-200, -200, 64, 75);
						w_check2.setBounds(-100, -100, 64, 75);
					}
				};
				w_timer.schedule(w_task, 1000);
				
				if(Life_Count == 3)
					life_3.setBounds(-123, -456, 64, 64);
				else if(Life_Count == 2)
					life_2.setBounds(-123, -456, 64, 64);
				else if(Life_Count == 1)
					life_1.setBounds(-123, -456, 64, 64);
				Life_Count--;
				
				if(Life_Count == 0)
				{
				// 	game over
					System.out.println("Game Over");
					gameOver();
				}
			}
		}
		
		if((check_x != -10) && (check_y != -10))
		{
			System.out.println(check_x + " " + check_y);
			if(check_arr[Stage_Count-1][check_x][check_y] == 0)
			{
				if((Stage_Count-1) == 0)
				{
					pic_1_1.add(c_check1);
					pic_1_2.add(c_check2);
				}
				else if((Stage_Count-1) == 1)
				{
					pic_2_1.add(c_check1);
					pic_2_2.add(c_check2);
				}
				else if((Stage_Count-1) == 2)
				{
					pic_3_1.add(c_check1);
					pic_3_2.add(c_check2);
				}
				else if((Stage_Count-1) == 3)
				{
					pic_4_1.add(c_check1);
					pic_4_2.add(c_check2);
				}
				else if((Stage_Count-1) == 4)
				{
					pic_5_1.add(c_check1);
					pic_5_2.add(c_check2);
				}
				
				if(flag == 1)
				{
					c_check1.setBounds(rect_point[check_x][check_y].x, 
							rect_point[check_x][check_y].y, 64, 75);
					c_check2.setBounds(rect_point[-(check_x-7)][-(check_y-7)].x, 
							rect_point[-(check_x-7)][-(check_y-7)].y, 64, 75);
				}
				else if(flag == 2)
				{
					c_check2.setBounds(rect_point[check_x][check_y].x, 
							rect_point[check_x][check_y].y, 64, 75);
					c_check1.setBounds(rect_point[-(check_x-7)][-(check_y-7)].x, 
							rect_point[-(check_x-7)][-(check_y-7)].y, 64, 75);
				}
			
				check_arr[Stage_Count-1][check_x][check_y] = 1;
				Answer_Count++;
			}
		}
		if(Answer_Count == 5)
		{
			// All of object initialize and appear the next card 
			
			init_stage();
			Stage_Count++;
			card1.next(card1_pan);
			card2.next(card2_pan);
			if(Stage_Count > 5)
				gameClear();
		}
	}
	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	
	class MyTimerTask extends TimerTask {
		public void run() {
			System.out.println("" + Main_Time/1000);
			if(Main_Time / 10000 == 7)
				t7.setBounds(256, 664, 256, 64);
			else if(Main_Time / 10000 == 6)
			{
				t7.setBounds(-256, -664, 256, 64);
				t6.setBounds(256, 664, 256, 64);
			}
			else if(Main_Time / 10000 == 5)
			{
				t6.setBounds(-256, -664, 256, 64);
				t5.setBounds(256, 664, 256, 64);
			}
			else if(Main_Time / 10000 == 4)
			{
				t5.setBounds(-256, -664, 256, 64);
				t4.setBounds(256, 664, 256, 64);
			}
			else if(Main_Time / 10000 == 3)
			{
				t4.setBounds(-256, -664, 256, 64);
				t3.setBounds(256, 664, 256, 64);
			}
			else if(Main_Time / 10000 == 2)
			{
				t3.setBounds(-256, -664, 256, 64);
				t2.setBounds(256, 664, 256, 64);
			}
			else if(Main_Time / 10000 == 1)
			{
				t2.setBounds(-256, -664, 256, 64);
				t1.setBounds(256, 664, 256, 64);
			}
			else
				gameOver();
			// decreased by 10 seconds 
			Main_Time -= 10000;
		}
	}
	public void init_stage() {
		check_x = check_y = -10;
		Life_Count = 3;
		Hint_Count = 3;
		Answer_Count = 0;
		Main_Time = 70000;
		Timer_Item_Count = 1;
			
		for(int i = 0 ; i < 5 ; i ++)
		{
			for(int j = 0 ; j < 8 ; j++)
			{
				for(int k = 0 ; k < 8 ; k++)
					check_arr[i][j][k] = 0;
			}
		}
		
		life_1.setBounds(256, 600, 64, 64);
		life_2.setBounds(352, 600, 64, 64);
		life_3.setBounds(444, 600, 64, 64);
		hint_1.setBounds(768, 600, 64, 64);
		hint_2.setBounds(864, 600, 64, 64);
		hint_3.setBounds(956, 600, 64, 64);
		t1.setBounds(-1111, -2222, 256, 64);
		t2.setBounds(-1111, -2222, 256, 64);
		t3.setBounds(-1111, -2222, 256, 64);
		t4.setBounds(-1111, -2222, 256, 64);
		t5.setBounds(-1111, -2222, 256, 64);
		t6.setBounds(-1111, -2222, 256, 64);
		t7.setBounds(-1111, -2222, 256, 64);
		
		main_timer.cancel();
		main_timer = null;
		main_timer = new Timer();
		main_timer.schedule(new MyTimerTask(), 0, 10000);
	}
}