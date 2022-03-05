package 모의고사_수포자;

import java.util.*;

class Solution {
	public int[] solution(int[] answers) {
		int[] point = { 0, 0, 0 };
		int[] pointCopy = {};
		int max = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();

		int[][] pArr = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };

		for (int i = 0; i < answers.length; i++) {
			if (pArr[0][i % 5] == answers[i]) {
				point[0]++;
			}

			if (pArr[1][i % 8] == answers[i]) {
				point[1]++;
			}

			if (pArr[2][i % 10] == answers[i]) {
				point[2]++;
			}
		}

		pointCopy = point.clone();
		Arrays.sort(pointCopy);
		max = pointCopy[2];

		for (int i = 0; i < point.length; i++) {
			if (point[i] == max) {
				list.add(i + 1);
			}
		}

		int[] answer = new int[list.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
