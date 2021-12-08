import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JFrame{
	static int setX = 0;
	static int setY = 0;
	static int score = 0;
	static int newX = 0;
	static int newY = 0;
	
	
	
	 Game(){
         super("�����ϱ�");
         JPanel frm = new JPanel();
         setSize(1000,1000);
         add(frm);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
         frm.addMouseListener(new MouseClick());
         play();
      }

	//�������� ��ǥ ����
	public static int setX() {
		int x = (int) (Math.random()*1000+1);
		setX = x;
		return x;
	}
	public static int setY() {
		int min = 10;
		int max = 1000;
		int y = (int)((Math.random() * (max - min)) + min);
		setY = y;
		return y;
	}
	
	
	

	//�̹��� Ŭ�� �ߴ��� ���ߴ���
	public static boolean check() {
		int X = setX;
		int Y = setY;
		int newX = Game.newX;
		int newY = Game.newY;
		System.out.println("Ŭ���� ��ǥ: ("+newX +"," + newY+")");
		if(X == newX && Y == newY) {
			score += 10;
			System.out.println("score: "+ score);
			return true;
		}else {
			System.out.println("score: "+ score);
			return false;
			
		}
		
	}
	
	//ǥ�õ� �̹��� ���ֱ�
	
	public static void play() {
		int x = Game.setX();
		int y = Game.setY();
		System.out.println("��ǥ ����: ("+x+","+y+")");
		
		//�̹��� �ֱ�
		new MyThread();
	}
	

}
class MyThread extends Frame{
	//�̹��� �ֱ�
	ImageIcon i = new ImageIcon("C:\\Users\\OHMINJUNG\\git\\SaveTheCat\\SaveTheCat\\cat.PNG");
	Image im = i.getImage();
	public void paintComponent(Graphics g) {
		System.out.println("�̹��� �ֱ�");
		g.drawImage(im,Game.setX,Game.setY,100,100,this);
	}
}
class MouseClick extends JFrame implements MouseListener{
	@Override
	public void mouseClicked(MouseEvent e) {
		Game.newX = e.getX();
		Game.newY = e.getY();
		Game.check();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseClick();
		System.out.println("���콺 Ŭ��");
	}
	
}

