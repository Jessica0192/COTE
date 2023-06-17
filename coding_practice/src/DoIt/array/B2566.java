package DoIt.array;

import java.util.Scanner;

public class B2566 {
	
	public static void main(String[] args) {
		int max = 0;
		int[] maxInd = { 1, 1};
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				int input = sc.nextInt();
				// 입력 값이 현재까지의 최댓값보다 큰 경우
				if(max < input) {
					max = input;
					maxInd[0] = i+1;
					maxInd[1] = j+1;
				}
			}
		}
		
		System.out.println(max);
		for(int ind : maxInd) {
			System.out.print(ind+" ");
		}
	}
}
