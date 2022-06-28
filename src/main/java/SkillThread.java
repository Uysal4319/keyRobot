import java.awt.*;
import java.awt.event.KeyEvent;

public class SkillThread extends Thread{
	@Override
	public void run() {
		System.out.println("SkillThread Started. thread id = " + Thread.currentThread().getId());
		while (true){
			Robot bot = null;
			try {
				bot = new Robot();
				bot.delay(1000);
				bot.keyRelease(KeyEvent.VK_SPACE);
				bot.keyPress(KeyEvent.VK_CONTROL);
				bot.keyPress(KeyEvent.VK_H);
				bot.delay(500);
				bot.keyRelease(KeyEvent.VK_CONTROL);
				bot.keyRelease(KeyEvent.VK_H);
				bot.delay(1000);
				bot.keyPress(KeyEvent.VK_3);
				bot.delay(500);
				bot.keyRelease(KeyEvent.VK_3);
				bot.delay(4000);
				bot.keyPress(KeyEvent.VK_4);
				bot.delay(500);
				bot.keyRelease(KeyEvent.VK_4);
				bot.delay(2000);
				bot.keyPress(KeyEvent.VK_CONTROL);
				bot.keyPress(KeyEvent.VK_H);
				bot.delay(500);
				bot.keyRelease(KeyEvent.VK_CONTROL);
				bot.keyRelease(KeyEvent.VK_H);
				bot.delay(1000);
				bot.keyPress(KeyEvent.VK_SPACE);
				Thread.sleep(1000*60*8);
			} catch (AWTException | InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
