package gane;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ListerTank extends KeyAdapter{//12.�����࣬�̳��ڼ��̼������������ݿɿ�ݼ����ɣ���

	public GameInterface game;
	public ListerTank(GameInterface game) {
		this.game = game;//ͨ��game�õ�̹�˶��󣬴Ӷ��õ�speed����������Ҫ�õ�����
	}
	
	@Override
	public void keyPressed(KeyEvent e) {//���¼���ʱ
		// TODO �Զ����ɵķ������
		super.keyPressed(e);
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			this.game.tank.dir_up = true;
			//13.ͨ��game�õ�̹�˶���ͨ��̹�˶����õ����̱�������������Ϊtrue�����ǰ��¼��̵�״̬��
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			this.game.tank.dir_down = true;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.game.tank.dir_left = true;
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.game.tank.dir_right = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {//�ɿ�����ʱ��
		// TODO �Զ����ɵķ������
		super.keyReleased(e);
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			this.game.tank.dir_up = false;
			//ֵΪfalse����Ϊ�ɿ����̵�״̬��
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			this.game.tank.dir_down = false;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.game.tank.dir_left = false;
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.game.tank.dir_right = false;
		}
	}
	
}
