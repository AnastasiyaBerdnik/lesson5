package anastasiya.lesson5.fraction.task;

import java.util.Random;


public class Main {

	public static void main(String[] args) {
		Random ();
		}

public static void Random () {
	Random rand = new Random();
	int ns = 5;
	Fraction[] mas = new Fraction[ns];
	for (int i = 0; i < mas.length; i++) {
		int n, d;
		n = rand.nextInt(100);
		d = rand.nextInt(100);
		mas[i] = new Fraction(n, d);
		
	}
	for (int i = 0; i< mas.length; i++){
		System.out.println(mas[i].getNum() + "/"+ mas[i].getDen());
	} 

}
}




