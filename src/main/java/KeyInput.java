import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class KeyInput extends KeyAdapter {
	
	public static void main(String[] args) {
		
	}
	
	public void keyPressed(KeyEvent e){
		// New key press
		int key = e.getKeyCode();
		// If we press right
		if (key == KeyEvent.VK_RIGHT) {
			System.out.println("The right arrow key is pressed");
			// Or, if we press left
		} else if (key == KeyEvent.VK_LEFT) {
			System.out.println("The left arrow key is pressed");
		}
	}
}
