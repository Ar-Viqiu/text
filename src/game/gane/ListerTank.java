package gane;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ListerTank extends KeyAdapter{//12.监听类，继承于键盘监听（下面内容可快捷键生成）。

	public GameInterface game;
	public ListerTank(GameInterface game) {
		this.game = game;//通过game拿到坦克对象，从而拿到speed变量（下面要用到）。
	}
	
	@Override
	public void keyPressed(KeyEvent e) {//按下键盘时
		// TODO 自动生成的方法存根
		super.keyPressed(e);
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			this.game.tank.dir_up = true;
			//13.通过game拿到坦克对象，通过坦克对象拿到键盘变量，将变量改为true，就是按下键盘的状态。
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			this.game.tank.dir_down = true;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.game.tank.dir_left = true;
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.game.tank.dir_right = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {//松开键盘时。
		// TODO 自动生成的方法存根
		super.keyReleased(e);
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			this.game.tank.dir_up = false;
			//值为false，则为松开键盘的状态。
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			this.game.tank.dir_down = false;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.game.tank.dir_left = false;
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.game.tank.dir_right = false;
		}
	}
	
}
