import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome(Integer x) {
        String str = x.toString();
        int len = str.length();
        for (int i = 0; i<len; i+=2) {
            if (str.charAt(i) != str.charAt(len-i-1)) return false;
        }
        return true;
    }
	
	public static void main(String[] args)
    {
		System.out.println("¬ведите число: ");
		Scanner in = new Scanner(System.in);		
		if (in.hasNextInt()) 
		{
	        int n = in.nextInt();
	        for (int i = 0; i<n; i++) { 
	            if (isPalindrome(i)) System.out.println(i);
	        }
	        
	    } 
    }
}
