
public class Prob {
	public static int knapsack(int weights[], int costs[], int needed) {
	    int n = weights.length;
	    int dp[][] = new int[needed + 1][n + 1];
	    for (int j = 1; j <= n; j++) {
	        for (int w = 1; w <= needed; w++) {
	            if (weights[j-1] <= w) {
	                dp[w][j] = Math.max(dp[w][j - 1], dp[w - weights[j-1]][j - 1] + costs[j-1]);
	            } else {
	                dp[w][j] = dp[w][j - 1];
	            }
	        }
	    }
	    return dp[needed][n];
	}
	
	public static void main(String[] args)
    {
		int weights[]; 
		weights = new int[10];
		for(int i = 0; i<10; i++)
		{
			weights[i]=i;
		}
		
		
		int costs[]; 
		costs = new int[10];
		for(int i = 9; i>=0; i--)
		{
			costs[i]=i;
		}
		
		int needed = 1000;
		
		int f = knapsack(weights, costs, needed);
		System.out.println(f);
    }
}
