import java.awt.*;
import java.awt.event.KeyEvent;

public class InputThread extends Thread {
	@Override
	public void run() {
		System.out.println("thread Started. thread id" + Thread.currentThread().getId());
		Robot bot = null;
		try {
			bot = new Robot();
			while (true){
				try {
					bot.delay(500);
					bot.keyPress(KeyEvent.VK_X);
					bot.delay(1000);
					bot.keyRelease(KeyEvent.VK_X);
					bot.delay(1000);
					Thread.sleep(500);
				} catch ( InterruptedException e) {
					e.printStackTrace();
				}
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	
	}
}
