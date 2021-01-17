package gane;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameInterface extends JPanel {
	public JFrame game_jframe;
	public Tank tank;//10.调用坦克类
	public ArrayList<Bullets> bullets;//18.子弹列表变量。
	public GameInterface() {
		tank = new Tank(100,100,25);//10.
		game_jframe = new JFrame("坦克大战-单机版1.1");
		bullets = new ArrayList<>();//创建子弹列表。
		game_jframe.setSize(1000,800);
		game_jframe.setLayout(null);
		game_jframe.setLocationRelativeTo(null);
		game_jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ListerTank listerTank = new ListerTank(this);//12.创建监听对象。
		//这里的this参数，是因为ListerTank类没有无参构造方法。
		//只有一个类型为GameInterface的参数，就是现在所在的这个类为参数，所以用this为参数。
		game_jframe.addKeyListener(listerTank);//注册监听。
		
		
		this.setSize(1000,800);//1.面板管理器
		this.setLayout(null);
		this.setBackground(Color.CYAN);
		
		game_jframe.add(this);//2.面板管理器加到容器中。
		game_jframe.setVisible(true);
		new Thread() {//14.匿名线程
			//一个线程控制所有的坦克，避免坦克太多的时候线程太多而卡。
			public void run() {
				while(true) {//反复执行
					try {
						tank.move();//执行move方法。
						sleep(20);
					}catch(Exception e) {
						
					}
				}
			}
		}.start();//调用线程
	}
	public void paint(Graphics g) {//11.设置画笔
		super.paint(g);//调用父类的画笔
		tank.drawTank(g);//坦克类调用画笔去画坦克。
		
		//19.用画笔画出子弹。
		for(int i=0;i<bullets.size();i++) {
			Bullets bullet = bullets.get(i);
			bullet.drawBullets(g);
		}
		
		repaint();//一直调用paint方法，重复绘制坦克，形成动画。
	}
}
