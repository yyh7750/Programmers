package 소수개수구하기;

public class Solution {
	public int solution(int n) {
		
		int answer = 0;
		boolean k = true;
		
		for(int i = 2; i <= n; i++) {
			for(int j = 2; j < i; j++) {
				if(i%j == 0) {
					k = false;
					break;
				}
				else {
					k = true;
				}
			}
			if(k) {
				answer++;
			}
			System.out.println(i);
			System.out.println(k);
			System.out.println(answer);
			System.out.println("-----------");
		}
		
		return answer;
	}
}
