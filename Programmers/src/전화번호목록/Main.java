package 전화번호목록;

public class Main {
    public static void main(String[] args) {
        String[] phone_book = {"12", "123", "12345"};
        
        Solution sol = new Solution();
        boolean p = sol.solution(phone_book);
        
        System.out.println(p);
    }
}
