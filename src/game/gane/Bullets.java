package gane;

import java.awt.Color;
import java.awt.Graphics;

public class Bullets {//15.���ӵ�
	private int bullet_x,bullet_y,bullet_radius;//16.�ӵ�λ�ã��뾶��

	public Bullets(int bullet_x, int bullet_y, int bullet_radius) {//�ӵ��๹�췽����
		super();
		this.bullet_x = bullet_x;
		this.bullet_y = bullet_y;
		this.bullet_radius = bullet_radius;
	}
	
	public void drawBullets(Graphics g) {//17.���ӵ�����
		g.setColor(Color.BLUE);
		g.drawRect(bullet_x, bullet_y, bullet_radius*2, bullet_radius*2);
		g.fillRect(bullet_x, bullet_y, bullet_radius*2, bullet_radius*2);
	}
}
