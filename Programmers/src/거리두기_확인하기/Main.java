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
public class Main {

	/**
	 * @methodName : main
	 * @description :
	 * @param args
	 *
	 * @author : Younghun Yu
	 * @date : 2022.03.04
	 */
	public static void main(String[] args) {

		Solution solution = new Solution();

		String[][] places = { //
				{ "POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP" }, //
				{ "POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP" }, //
				{ "PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX" }, //
				{ "OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO" }, //
				{ "PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP" } };
		
		System.out.println(Arrays.toString(solution.solution(places)));
	}
}