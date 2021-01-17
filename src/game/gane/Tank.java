package gane;

import java.awt.Color;
import java.awt.Graphics;

public class Tank {
	private int tank_x, tank_y, tank_radius;//4.X�ᣬY�ᣬ�뾶��
	private int speed = 5;//6.̹��һ����5�����ء�
	public boolean dir_up = false,dir_down = false,dir_left = false,dir_right = false;
	//7.̹�˵��������ҡ�
	public Tank(int tank_x, int tank_y, int tank_radius) {//5.���췽�������ÿ�ݷ�ʽ��ɣ���
		super();
		this.tank_x = tank_x;
		this.tank_y = tank_y;
		this.tank_radius = tank_radius;
	}
	
	public void drawTank(Graphics g) {//9.��̹��
		g.setColor(Color.BLACK);//������ɫ
		g.drawOval(tank_x, tank_y, tank_radius*2, tank_radius*2);//��Բ����ʵ����̹�˵����壨λ�ã��뾶��
		g.fillOval(tank_x, tank_y, tank_radius*2, tank_radius*2);//���Բ
		
		if(dir_up) {//14.��̹����Ͳ��
			//֮ǰֻ�滭��̹�˵����壬��������ǻ�����̹�˵���Ͳ��
			g.drawRect(tank_x+tank_radius-2, tank_y-tank_radius, 4, 50);
			//�����Σ�X��YΪ���꣬��������Ϊ��͸ߡ�
			//+tank_radius�Ǽ�����̹�����壨Բ�Σ��İ뾶��������ʾ���м䣬������Ҳһ����
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
	
	public void move() {//8.̹���ƶ�����
		if(dir_up) {
			this.tank_y -= speed;//������Y����ơ�
		}else if(dir_down) {
			this.tank_y += speed;
		}else if(dir_left) {
			this.tank_x -= speed;//������X����ơ�
		}else if(dir_right) {
			this.tank_x += speed;
		}
	}
}
