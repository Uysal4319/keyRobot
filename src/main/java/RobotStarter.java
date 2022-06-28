import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotStarter {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		while (true){
			Robot bot = new Robot();
			bot.setAutoDelay(250);
			bot.keyPress(KeyEvent.VK_X);
			bot.keyRelease(KeyEvent.VK_X);
			Thread.sleep(500);
		}
	}
}
