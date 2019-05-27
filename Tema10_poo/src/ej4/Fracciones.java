package ej4;

import java.util.Scanner;

public class Fracciones {

	private int denominador;

	private int numerador;

	public Fracciones(int n, int d) {
		this.denominador = d;
		this.numerador = n;

	}

	public Fracciones() {
		// TODO Auto-generated constructor stub
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int sumar(int n, int d) {

		Scanner s = new Scanner(System.in);

		System.out.println("Indique el denominador");

		n = s.nextInt();

		System.out.println("Indique el denominador");

		d = s.nextInt();

		int suma = n + d;

		System.out.println(suma);
		return suma;

	}

	@Override
	public String toString() {
		return "Fracciones [denominador=" + denominador + ", numerador=" + numerador + "]";
	}

}
