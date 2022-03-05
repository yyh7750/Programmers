package 더_맵게;

public class Main {

    public static void main(String[] args) {
        Integer[] scoville = {1, 2, 3};
        int K = 11;
        
        Solution sol = new Solution();
        int result = sol.solution(scoville, K);
        
        System.out.println(result);
    }

}
