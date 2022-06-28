import java.awt.*;
import java.awt.event.KeyEvent;

public class SpaceThread extends Thread{
	@Override
	public void run() {
		Robot bot = null;
		try {
			bot = new  Robot();
			while (true){
				bot.keyPress(KeyEvent.VK_SPACE);
				bot.keyRelease(KeyEvent.VK_SPACE);
				Thread.sleep(100);
			}
		} catch (AWTException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
