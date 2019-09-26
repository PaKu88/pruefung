package numbers;

import java.util.Scanner;

public class kuerzenBruch 
{
	private int p;
	private int q;
	
	public kuerzenBruch()
	{
		this.p = 1;
		this.q = 1;
	}	
	public void kuerzen() {
		// Vorzeichen merken und Betrag bilden
		int sign = 1;
		if (p < 0) {
			sign = -sign;
			p = -p;
		}
		if (q < 0) {
			sign = -sign;
			q = -q;
		}

		int teiler = ggt(p, q);

		// Vorzeichen restaurieren
		p = sign * p / teiler;
		q = q / teiler;

	}	
	public void eingabe() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Geben Sie den Zaehler ein:");
		int i = sc.nextInt();
		p = i;

		System.out.println("Geben Sie den Nenner ein:");
		i = sc.nextInt();
		q = i;

		sc.close();
	}
	private int ggt(int x, int y) {

		while (y > 0) {
			int rest = x % y;
			x = y;
			y = rest;
		}
		return x;
	}
	public void print() {
		System.out.println(p + "/" + q);
	}
	
	public void ausführen ()
	{
		eingabe();
		System.out.println("Ihre Eingabe:");
		print();
		kuerzen();
		System.out.println("Gekürzter Bruch:");
		print();
	}
}
