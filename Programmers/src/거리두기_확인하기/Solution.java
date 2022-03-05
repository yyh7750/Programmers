/**
 * 
 */
package 거리두기_확인하기;

import java.util.Arrays;

/**
 * @packageName : 거리두기_확인하기
 * @description : 
 * @author : Younghun Yu
 * @date : 2022.03.04
 * ===========================================================
 *     DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022.03.04  Younghun Yu  최초 생성
 */
class Solution {
	public int[] solution(String[][] places) {
		int[] answer = new int[places.length];

		for (int i = 0; i < places.length; i++) {
			String[] place = places[i];

			manhattan(place);
		}

		return answer;
	}

	public boolean manhattan(String[] place) {

		String[][] arr = new String[5][5];
		
		for(int i = 0; i < place.length; i++) {
			String[] str = place[i].split("");
			for(int j = 0; j < place.length; j++) {
				arr[i][j] = str[j];
			}
		}
		
		

		return false;
	}
}