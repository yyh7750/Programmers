package 음양더하기;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        String[] num = new String[absolutes.length];
        
        for(int i = 0; i < num.length; i++) {
        	if(signs[i]) {
        		num[i] = Integer.toString(absolutes[i]);
        	}
        	else {
        		num[i] = "-" + Integer.toString(absolutes[i]);
        	}
        }
        
        for(int i = 0; i < num.length; i++) {
        	answer += Integer.parseInt(num[i]);
        }
        
        return answer;
    }
}