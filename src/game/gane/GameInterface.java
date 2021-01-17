package gane;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameInterface extends JPanel {
	public JFrame game_jframe;
	public Tank tank;//10.����̹����
	public ArrayList<Bullets> bullets;//18.�ӵ��б������
	public GameInterface() {
		tank = new Tank(100,100,25);//10.
		game_jframe = new JFrame("̹�˴�ս-������1.1");
		bullets = new ArrayList<>();//�����ӵ��б�
		game_jframe.setSize(1000,800);
		game_jframe.setLayout(null);
		game_jframe.setLocationRelativeTo(null);
		game_jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ListerTank listerTank = new ListerTank(this);//12.������������
		//�����this����������ΪListerTank��û���޲ι��췽����
		//ֻ��һ������ΪGameInterface�Ĳ����������������ڵ������Ϊ������������thisΪ������
		game_jframe.addKeyListener(listerTank);//ע�������
		
		
		this.setSize(1000,800);//1.��������
		this.setLayout(null);
		this.setBackground(Color.pink);
		
		game_jframe.add(this);//2.���������ӵ������С�
		game_jframe.setVisible(true);
		new Thread() {//14.�����߳�
			//һ���߳̿������е�̹�ˣ�����̹��̫���ʱ���߳�̫�������
			public void run() {
				while(true) {//����ִ��
					try {
						tank.move();//ִ��move������
						sleep(20);
					}catch(Exception e) {
						
					}
				}
			}
		}.start();//�����߳�
	}
	public void paint(Graphics g) {//11.���û���
		super.paint(g);//���ø���Ļ���
		tank.drawTank(g);//̹������û���ȥ��̹�ˡ�
		
		//19.�û��ʻ����ӵ���
		for(int i=0;i<bullets.size();i++) {
			Bullets bullet = bullets.get(i);
			bullet.drawBullets(g);
		}
		
		repaint();//һֱ����paint�������ظ�����̹�ˣ��γɶ�����
	}
}
