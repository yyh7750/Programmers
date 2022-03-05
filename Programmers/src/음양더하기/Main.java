package 음양더하기;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		int[] absolutes = {1, 2, 3, 4, 5};
		boolean[] signs = {false, false, true, true, true};
		
		int result = sol.solution(absolutes, signs);
		
		System.out.println(result);

	}

}
