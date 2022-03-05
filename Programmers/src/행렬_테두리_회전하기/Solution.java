/**
 * 
 */
package 행렬_테두리_회전하기;

import java.util.Arrays;

/**
 * @packageName : 행렬_테두리_회전하기
 * @description :
 * @author : Younghun Yu
 * @date : 2022.02.21
 *       =========================================================== DATE AUTHOR
 *       NOTE -----------------------------------------------------------
 *       2022.02.21 Younghun Yu 최초 생성
 */
public class Solution {
	public int[] solution(int rows, int columns, int[][] queries) {
		int[] answer = {};

		int[][] arr = new int[rows][columns];

		// 초기 배열
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = i * columns + j + 1;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		for(int i = 0; i < queries.length; i++){ // 회전하고 최솟값 answer에 저장
            answer[i] = rotate(queries[i], arr);
        }

		return answer;
	}
	
	 public int rotate(int[] query, int[][] arr){
	        int r1 = query[0]-1; 
	        int c1 = query[1]-1;
	        int r2 = query[2]-1;
	        int c2 = query[3]-1;
	        
	        int temp = arr[r1][c1]; // 시작위치 값 임시저장
	        int min = temp;                 // min값 초기화
	        for(int i = r1; i < r2; i++){ // 회전의 1번
	            arr[i][c1] = arr[i+1][c1];
	            if(min > arr[i][c1]) min = arr[i][c1];
	        }
	        for(int i = c1; i < c2; i++){ // 회전의 2번
	            arr[r2][i] = arr[r2][i+1];
	            if(min > arr[r2][i]) min = arr[r2][i];
	        }
	        for(int i = r2; i > r1; i--){ // 회전의 3번
	            arr[i][c2] = arr[i-1][c2];
	            if(min > arr[i][c2]) min = arr[i][c2];
	        }
	        for(int i = c2; i > c1; i--){ // 회전의 4번
	            arr[r1][i] = arr[r1][i-1];
	            if(min > arr[r1][i]) min = arr[r1][i];
	        }
	        arr[r1][c1+1] = temp; // 임시저장한 값 저장
	        
	        return min; //최솟값 반환
	    }
}