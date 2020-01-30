package main;

/* Exercitiul 1 */

public class Asignare{

	public static void main(String[] args) {
		int a= 3;
		int b = (a=2)*a;
		int c = b * (b=5);
		System.out.println("a= " + a + ", b=" + b + ", c=" + c);
	
		/* 1. Raspuns: a= 2, b=5, c=20
		  chiar daca in prima instanta a= 3, ii este reatribuita valoarea de la b, acelasi lucru si pentru b 
		  caruia i se atribuie valoarea de la c, in schimb pentru c este valoarea 20 doarece primului "b" ii 
		  este atribuita valoarea 4 iar "(b=5)=5" 4*5=20 */
	}
}

