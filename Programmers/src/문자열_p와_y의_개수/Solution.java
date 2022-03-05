package 문자열_p와_y의_개수;

public class Solution {
	boolean solution(String s) {
		boolean answer = true;
		int count_p = 0;
		int count_y = 0;
		
		System.out.println(s);
		
		s = s.toUpperCase();
		
		System.out.println(s);
		 		
		String arr[] = s.split("");

		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("P")) {
				count_p++;
			}
			else if(arr[i].equals("Y")) {
				count_y++;
			}
		}
		
		System.out.println(count_p);
		System.out.println(count_y);
		
		
		if(count_p == 0 && count_y == 0) {
			answer = true;
		}
		else if(count_p == count_y) {
			answer = true;
		}
		else {
			answer = false;
		}
		
		return answer;
	}
}
