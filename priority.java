package javaproject1;

public class priority {

	public static void main(String[] args) {
		Thread lowpriorityThread=new Thread(() -> {
		for(int i=1;i<=5;i++) {
			System.out.println("Low priority Thread"+i);
		}
		});
	Thread highpriorityThread=new Thread(() -> {
		for(int i=1;i<=5;i++) {
			System.out.println("High priority Thread"+i);
		}});
		lowpriorityThread.setPriority(Thread.MIN_PRIORITY);
		highpriorityThread.setPriority(Thread.MAX_PRIORITY);
		lowpriorityThread.start();
		highpriorityThread.start();
		
	}

}
