import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame frm = new JFrame();
		frm.setTitle("Pong Project");
		Game g = new Game();
		frm.setContentPane(g);
		frm.setSize(700, 600);
		frm.setResizable(false);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
