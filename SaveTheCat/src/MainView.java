import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame{
	JPanel frm = new JPanel();
	
	public MainView(){
		super("냥이들을 구해라");
		add(frm);
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//버튼 설정
		
		JButton start = new JButton("게임 시작");
		start.setBounds(250,450,500,50);
		frm.add(start);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainView();

	}

}
