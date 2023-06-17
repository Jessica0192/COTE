package DoIt.array;

import java.util.Scanner;

public class B2738 {

	public static void main(String[] args) {
		int n,m;
		Scanner sc = new Scanner(System.in);
		// 행의 개수 입력 받기
		n = sc.nextInt();
		// 열의 개수 입력 받기
		m = sc.nextInt();
		int[][] ans = new int[n][m];
		// 반복 횟수를 제어하기 위한 변수 iterate 초기화
		int iterate = 2;
		
		while(iterate > 0) {
			for(int i=0; i< n; i++) {
				for(int j=0; j<m; j++) {
					ans[i][j] += sc.nextInt();		
				}
			}
			iterate--;
		}

		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
