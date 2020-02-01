package main;

public class Subsitem {

	public static void main(String[] args) {
		double d = 2.95;
		int i = 4;
		System.out.println(++d>i?d:i);
		
		/* este instructiune if-else scrisa in linie valoare expresiei este 4 deoarece il incrementam pe "d" cu 1 iar noua 
		 valoare este 3.95, acesta nu respecta conditia ca "++d>i=true" si ii este atribuita valoarea lui "i"  */
}

}