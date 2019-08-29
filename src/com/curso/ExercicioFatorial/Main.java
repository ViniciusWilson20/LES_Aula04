package com.curso.ExercicioFatorial;

public class Main {

	public static void main(String[] args) {
		
		Fatorial f1 = new Fatorial();
		Thread t1 = new Thread(f1);
		t1.start();
		
		

	}

}
