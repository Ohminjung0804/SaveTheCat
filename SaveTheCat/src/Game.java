
public class Game {
	//�������� ��ǥ ����
	public static int setX() {
		int x = (int) (Math.random()*1000+1);
		return x;
	}
	public static int setY() {
		int min = 10;
		int max = 1000;
		int y = (int)((Math.random() * (max - min)) + min);
		return y;
	}
	//������ ��ǥ�� �̹��� �ֱ�
	//�ش� ��ǥ Ŭ���ϸ� ���� �߰�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = setX();
		int y = setY();
		System.out.println("��ǥ ����: ("+x+","+y+")");
	}

}
