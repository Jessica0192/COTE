package DoIt.array;
import java.util.Scanner;

public class B2563 {
	public static void main(String[] args) {
		final int SIZE = 10;
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int n = sc.nextInt();
		
		// 도화지의 넓이를 boolean 값으로 배열을 선언
		// 아직 어떠한 색종이로도 채워지지 않을 경우 false이며 otherwise, true이다
		boolean[][] largePaper = new boolean[101][101];
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int j = x; j < x+SIZE; j++) {
                for (int k = y; k < y+SIZE; k++) {
                	// 어떠한 색종이로도 도화지 부분이 채워지지 않았을 경우
                    if (!largePaper[j][k]) {
                    	largePaper[j][k] = true;
                    	// 넓이 '1'씩 증가
                        sum++;
                    }
                }
            }
		}
		
		System.out.println(sum);
	}
}
