import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainView extends JFrame{
   ImageIcon i = new ImageIcon(".//image//first.jpg");
   Image im = i.getImage();
   MyPanel frm = new MyPanel();
   public MainView() {
      this.setTitle("냥이를 구해라");
        add(frm);
        setSize(1000,1000);
      frm.setBounds(250,450,500,150);
      frm.setLayout(new FlowLayout());

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

      JButton start = new JButton("게임 시작");
       start.setBounds(250,450,500,50);
       frm.add(start);
        
       start.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              new Game();
              setVisible(false);
           }
        });
    }
   
//   public class Game extends JFrame{
//      Game(){
//            super("냥이를 구해라");
//            JPanel Game = new JPanel();
//            
//            add(Game);
//            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            setVisible(true);
//         }
//      }
//   
    class MyPanel extends JPanel{
            
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(im,0,0,getWidth(),getHeight(),this);
          
        }
    }

   public static void main(String[] args) {
        new MainView();
   }
}