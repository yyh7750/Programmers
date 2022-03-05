package 로또의_최고순위와_최저순위;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();

		int[] lottos1 = { 44, 1, 0, 0, 31, 25 };
		int[] win_nums1 = { 31, 10, 45, 1, 6, 19 };
		System.out.println(Arrays.toString(s.solution(lottos1, win_nums1)));

		int[] lottos2 = { 0, 0, 0, 0, 0, 0 };
		int[] win_nums2 = { 38, 19, 20, 40, 15, 25 };
		System.out.println(Arrays.toString(s.solution(lottos2, win_nums2)));

		int[] lottos3 = { 45, 4, 35, 20, 3, 9 };
		int[] win_nums3 = { 20, 9, 3, 45, 4, 35 };
		System.out.println(Arrays.toString(s.solution(lottos3, win_nums3)));
	}

}
