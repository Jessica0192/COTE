package DoIt.two_pointer;
import java.util.Scanner;

public class B2559 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n+1];
		
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<=n-k; i++) {
			int sum = 0;
			for(int j=i; j<i+k; j++) {
				sum += nums[j];
			}
			max = Math.max(max, sum);
		}
		 
		 System.out.println(max);
	}
}
