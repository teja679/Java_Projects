package Snack_Game;
import java.awt.*;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.event.AncestorListener;
import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame(){
			
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}