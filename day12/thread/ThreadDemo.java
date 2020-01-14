package com.cts.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		thread.setName("DUTT");
		System.out.println(thread.getName());
		System.out.println(thread.isDaemon());
		System.out.println("IS DUTT ALIVE   " + thread.isAlive());
		System.out.println(thread.getState());
		System.out.println(thread.getId());
		System.out.println(thread.getPriority());

	}

}
