package 완주하지못한선수;

public class Main {
	
	static String participant[] = {"leo", "kiki", "eden"};
	static String completion[] = {"eden", "kiki"};
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		String str = sol.solution(participant, completion);
		
		System.out.println(str);
	}
}