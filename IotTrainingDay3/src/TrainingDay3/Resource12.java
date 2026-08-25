package TrainingDay3;

import java.util.Iterator;
class Resource {
   synchronized void method1(Resource12 r) {
	   System.out.println(Thread.currentThread().getName()
			   + " entered method1()");
	   try {
		   Thread.sleep(1000);
	} catch (Exception e) {
		   e.printStackTrace();
	}
	System.out.println(Thread.currentThread().getName()
			+ " is waiting for method2()");
	r.method2();
   }
  synchronized void method2() {
	  System.out.println(Thread.currentThread().getName()
			  + " entered method2()");
	  try {
		  Thread.sleep(1000);
	} catch (InterruptedException e) {
		  e.printStackTrace();
	}
  }
}
public class Resource12 {
	public static void main(String[] args) {
		Resource12 r1 = new Resource12();
		Resource12 r2 = new Resource12();
		Thread t1 = new Thread(() -> {
			r2.method1(r2);
		}, "Thread 1");
		Thread t2 = new Thread(() -> {
			r2.method2();
		}, "Thread 2");
		t1.start();
		t2.start();
	}
	private void method1(Resource12 r2) {
	}
	public void method2() {
	}
}