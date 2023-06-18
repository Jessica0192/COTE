package DoIt.two_pointer;
import java.util.Scanner;
import java.util.ArrayList;

public class B1644 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		boolean prime[];
		ArrayList<Integer> prime_numbers = new ArrayList<>();
		
		// 1. 소수 구하기
        prime = new boolean[n+1];        
        prime[0] = prime[1] = true;       
        for(int i=2; i*i<=n; i++){
            if(!prime[i]) for(int j=i*i; j<=n; j+=i) prime[j]=true;                
        }            
        for(int i=1; i<=n;i++){
        	if(!prime[i]) prime_numbers.add(i);     
        }
        
        // 2. 연속합으로 주어진 정수 구할 수 있는지 판별
        int start=0, end=0, sum=0, count=0;
        while(true) {
        	if(sum >= n ) sum -= prime_numbers.get(start++);
        	else if(end == prime_numbers.size()) break;
        	else sum += prime_numbers.get(end++);       	
        	if(n==sum) count++;        	
        }		
        System.out.println(count);	
	}
}
