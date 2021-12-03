
public class Game {
	//램덤으로 좌표 생성
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
	//생성된 좌표에 이미지 넣기
	//해당 좌표 클릭하면 점수 추가
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = setX();
		int y = setY();
		System.out.println("좌표 생성: ("+x+","+y+")");
	}

}
