import java.util.Scanner;
public class NumberCheck {
	
	public static void prostoe(int n)
    {
		if( n == 0 || n == 1 ) 
			{
				System.out.println("�� ������� � �� ���������");
				return;
			}
		for (int i = 2; i < n / 2; i++)
			if (n % i == 0) 
			{
				if(n == i) break;
				System.out.println("���������");
				return;
			}
		System.out.println("�������");
    }
	
	public static void main(String[] args)
    {
		System.out.println("������� �����: ");
		Scanner in = new Scanner(System.in);		
		if (in.hasNextInt()) 
		{
	        int n = in.nextInt();
	        n = Math.abs(n);
	        if (n % 2 == 0) 
	        {
	        	System.out.println("������");
	        	prostoe(n);
	        }
	        else
	        	{
	        		System.out.println("��������");
	        		prostoe(n);
	        	}
	    } else {
	        System.out.println("�� ����� �� ����� �����");
	    }
    }
}
