package gane;

import java.awt.Color;
import java.awt.Graphics;

public class Bullets {//15.画子弹
	private int bullet_x,bullet_y,bullet_radius;//16.子弹位置，半径。

	public Bullets(int bullet_x, int bullet_y, int bullet_radius) {//子弹类构造方法。
		super();
		this.bullet_x = bullet_x;
		this.bullet_y = bullet_y;
		this.bullet_radius = bullet_radius;
	}
	
	public void drawBullets(Graphics g) {//17.画子弹方法
		g.setColor(Color.BLUE);
		g.drawRect(bullet_x, bullet_y, bullet_radius*2, bullet_radius*2);
		g.fillRect(bullet_x, bullet_y, bullet_radius*2, bullet_radius*2);
	}
}
