package DoIt.array;
import java.util.Scanner;

public class B10798 {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[5][15];
				
		// get inputs
		for(int i=0; i<5; i++) {
			// 사용자로부터 한 줄씩 입력 받아 문자 배열로 변환하여 arr 배열에 저장
			arr[i] = sc.nextLine().toCharArray();
		}
		
		int j = 0;
		for(int i=0; i<15; i++) {
			for(j=0; j<5; j++){
				// 현재 열(i)이 해당 행(j)의 문자 배열 길이보다 작은 경우
				if(i<arr[j].length) {
					// null 문자('\0')인 경우 반복문의 다음 단계로 건너뜀
					if(arr[j][i] == '\0') continue;
					sb.append(arr[j][i]);
				}
			}
		}
		
		System.out.println(sb);
	}
}
