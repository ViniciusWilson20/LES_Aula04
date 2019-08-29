package com.curso.ExercicioFatorial;

import java.math.BigInteger;

public class Fatorial implements Runnable {

	@Override
	public void run() {

		/*
		 * double Fat = 1; for (int i = 1; i <=100; i++) { Fat = Fat * i;
		 * System.out.println("O fatorial de " + i + " é: " + Fat); }
		 */

		BigInteger Fat = BigInteger.ONE;
		BigInteger i = BigInteger.ONE;
		while (i.min(new BigInteger("101")) == i) {
			Fat = Fat.multiply(i);
			System.out.println("O fatorial de " + i + " é: " + Fat);
			i = i.add(BigInteger.ONE);
		}
	}
}
