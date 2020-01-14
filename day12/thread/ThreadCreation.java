package com.cts.thread;

public class ThreadCreation {

	public static void main(String[] args) {
		System.out.println("main thread");
		//Resource r=new Resource();
		//FirstThread ft = new FirstThread(r);
		//ft.start();
		//SecondThread st = new SecondThread(r);
		//st.start();
		//Thread t1=new Thread(st);
		//.start();
/*t1.setPriority(Thread.MAX_PRIORITY);
 ft.setPriority(Thread.NORM_PRIORITY-2);
	System.out.println("first thread  priority   :"+ft.getPriority());

System.out.println("second thread   priority  :"+t1.getPriority());

	}*/

}
class Resource{
	public void display(String msg) {
		for(int i=1;i<=5;i++) {
			System.out.println(msg+""+i);
		}
	}
}
class FirstThread extends Thread {
	Resource resource;
	public 	FirstThread(Resource resource) {
		this.resource=resource;
	}
	public void run() {

		resource.display("second thread");
		/*for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("first thread:" + i);
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
	}
}

class SecondThread implements Runnable {
	Resource resource;
	public SecondThread(	Resource resource) {
		this.resource=resource;
	}

	public void run() {
		resource.display("First thread");
		/*for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("second thread:" + i);
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/

	}
}
}