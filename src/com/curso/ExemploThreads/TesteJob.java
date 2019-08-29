package com.curso.ExemploThreads;

public class TesteJob {

	public static void main(String[] args) {

		JobNumeros job = new JobNumeros("A");
		Thread t1 = new Thread(job);
		t1.start();

		JobNumeros job2 = new JobNumeros("B");
		Thread t2 = new Thread(job2);
		t2.start();
	}
}
