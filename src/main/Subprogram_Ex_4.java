package main;

public class Subprogram_Ex_4 {

	public static void main(String[] args){
		int suma = 0;
		for(int i = 1; i < 10; i++) {
			suma += suma +i;
		}
System.out.print("Suma este: " + suma);
	}
/* Rezultatul este 1013, subprogramul o sa execute pana in momentul in care "i" nu mai indeplineste conditia "i<10"    */
}