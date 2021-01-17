package gane;

import java.awt.Color;
import java.awt.Graphics;

public class Tank {
	private int tank_x, tank_y, tank_radius;//4.X轴，Y轴，半径。
	private int speed = 5;//6.坦克一步走5个像素。
	public boolean dir_up = false,dir_down = false,dir_left = false,dir_right = false;
	//7.坦克的上下左右。
	public Tank(int tank_x, int tank_y, int tank_radius) {//5.构造方法（可用快捷方式完成）。
		super();
		this.tank_x = tank_x;
		this.tank_y = tank_y;
		this.tank_radius = tank_radius;
	}
	
	public void drawTank(Graphics g) {//9.画坦克
		g.setColor(Color.BLACK);//画笔颜色
		g.drawOval(tank_x, tank_y, tank_radius*2, tank_radius*2);//画圆，其实就是坦克的主体（位置，半径）
		g.fillOval(tank_x, tank_y, tank_radius*2, tank_radius*2);//填充圆
		
		if(dir_up) {//14.画坦克炮筒。
			//之前只绘画了坦克的身体，下面这段是画出了坦克的炮筒。
			g.drawRect(tank_x+tank_radius-2, tank_y-tank_radius, 4, 50);
			//画矩形，X和Y为坐标，后面两个为宽和高。
			//+tank_radius是加上了坦克身体（圆形）的半径，让它显示在中间，其他的也一样。
			g.fillRect(tank_x+tank_radius-2, tank_y-tank_radius, 4, 50);
		}else if(dir_down) {
			g.drawRect(tank_x+tank_radius-2, tank_y+tank_radius, 4, 50);
			g.fillRect(tank_x+tank_radius-2, tank_y+tank_radius, 4, 50);
		}else if(dir_left) {
			g.drawRect(tank_x-tank_radius, tank_y+tank_radius-2,50,4);
			g.fillRect(tank_x-tank_radius, tank_y+tank_radius-2, 50,4);
		}else if(dir_right) {
			g.drawRect(tank_x+tank_radius, tank_y+tank_radius-2, 50,4);
			g.fillRect(tank_x+tank_radius, tank_y+tank_radius-2, 50,4);
		}else {
			g.drawRect(tank_x+tank_radius-2, tank_y-tank_radius, 4, 50);
			g.fillRect(tank_x+tank_radius-2, tank_y-tank_radius, 4, 50);
		}
	}
	
	public void move() {//8.坦克移动方法
		if(dir_up) {
			this.tank_y -= speed;//上下由Y轴控制。
		}else if(dir_down) {
			this.tank_y += speed;
		}else if(dir_left) {
			this.tank_x -= speed;//左右由X轴控制。
		}else if(dir_right) {
			this.tank_x += speed;
		}
	}
}
