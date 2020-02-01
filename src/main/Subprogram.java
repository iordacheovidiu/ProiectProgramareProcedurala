package main;

public class Subprogram {
	
	public static void main(String[] args) {
		int a = 3;
		if (++a<4)
			if (a++<4)
				System.out.println(a);
			else
				System.out.println(a);
			
		/* nu se va afisa nimic, in ambele cazuri "a" este incrementat cu 1, astfel "a=4" de aici rezulta ca "a" nu este mai 
		 mic decat 4  */
	}

}
