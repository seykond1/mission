import java.util.Scanner;

public class NOK_NOD {
	public static void main(String[] args)
    {
		System.out.println("Введите два числа: ");
		Scanner in = new Scanner(System.in);		
		int a = 0, b = 0;
		if (in.hasNextInt()) a = in.nextInt();
	    else 
	    {
	    	System.out.println("Вы ввели не целое число");
	    	return;
	    }
		a = Math.abs(a);
		if (in.hasNextInt()) b = in.nextInt();
	    else 
	    {
    		System.out.println("Вы ввели не целое число");
    		return;
    	}
		b = Math.abs(b);
		int c, d, a1, b1;
		a1 = a; b1 = b;
		c = a;
		while (a != b) {
			if (a > b) a -= b;
			else b -= a;
			c = a;
		}
		d = (a1 * b1) / c;
		System.out.println("НОД: " +  c);
		System.out.println("НОК: " +  d);
		
    }
}
