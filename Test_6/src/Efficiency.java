import java.util.Scanner;
public class Efficiency {
	
	public static int calculation(int weights[], int price[], int Massa) {
	    int n = weights.length;
	    int dp[][] = new int[Massa + 1][n + 1];
	    for (int j = 1; j <= n; j++) {
	        for (int w = 1; w <= Massa; w++) {
	            if (weights[j-1] <= w) {
	                dp[w][j] = Math.max(dp[w][j - 1], dp[w - weights[j-1]][j - 1] + price[j-1]);
	            } else {
	                dp[w][j] = dp[w][j - 1];
	            }
	        }
	    }
	    /*
	    for (int i = 1; i <= Massa; i++) 
	    {
	    	if(i==1)
	    	{
	    		for(int w = 0; w <= n; w++) 
	    			System.out.print(w + "\t");
	    		System.out.println("");
	    	}
	    	System.out.print(i + "\t");
	    	for (int j = 1; j <= n; j++) 
	    		System.out.print(dp[i][j] + "\t");
	    	System.out.println("");
	    }
	    */
	    return dp[Massa][n];
	}
	
	public static void main(String[] args)
    {
		
		Scanner in = new Scanner(System.in);	
 
		System.out.println("Введите грузоподъемность рюкзака: ");
		int Massa = in.nextInt();
		
		System.out.println("Введите Количество вещей: ");
		int n = in.nextInt();
		
		int weights[];
		weights = new int[n];
		int price[];
		price = new int[n];
		
		for (int i = 0; i < n; i++)
		{
			System.out.println("Введите вес " + i + " вещи");
			weights[i] = in.nextInt();
			
			System.out.println("Введите цену " + i + " вещи");
			price[i] = in.nextInt();
		}
	        
		int Sum = calculation(weights, price, Massa);
		System.out.println(Sum);
    }
}
