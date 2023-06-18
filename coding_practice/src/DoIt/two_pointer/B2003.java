package DoIt.two_pointer;
import  java.util.Scanner;

public class B2003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] nums = new int[n];
		
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		
		sc.close();
		
		int start =0, end = 0, sum = 0, ans = 0;
		
		while(start < n) {
			if(sum > m || end == n) {
				sum -= nums[start];
				start++;
			}
			else {
				sum += nums[end];
				end++;
			}
			
			if(sum == m) {
				ans++;
			}
		}
		
		System.out.println(ans);
		
	}
}
