package 상호평가;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[][] scores = { 
				{ 100, 90, 98, 88, 65 }, 
				{ 50, 45, 99, 85, 77 }, 
				{ 47, 88, 95, 80, 67 },
				{ 61, 57, 100, 80, 65 }, 
				{ 24, 90, 94, 75, 65 } 
		};

		String s = sol.solution(scores);
		
		System.out.println(s);
	}

}
