public class InputThreadStarter {
	
	public static void main(String[] args) throws InterruptedException {
		SkillThread skillThread  = new SkillThread();
		System.out.println("SkillThread created.");
		skillThread.start();
		Thread.sleep(12000);
		InputThread thread  = new InputThread();
		System.out.println("InputThread created.");
		thread.start();
		
//		Thread.sleep(1000);
//		SpaceThread spaceThread  = new SpaceThread();
//		System.out.println("SpaceThread created.");
//		spaceThread.start();
		
	}
}
