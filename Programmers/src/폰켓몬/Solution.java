package 폰켓몬;

import java.util.TreeSet;

public class Solution {
	public int solution(int[] nums) {
		int answer = 0;
		int max = nums.length / 2;

		TreeSet<Integer> tree = new TreeSet<>();
		
		for(int i = 0; i < nums.length; i++) {
			tree.add(nums[i]);
		}
		
		if(max < tree.size()) {
			answer = max;
		}
		else {
			answer = tree.size();
		}

		return answer;
	}
}