package 숫자문자열과_영단어;

class Solution {
    public int solution(String s) {
    	String[] sNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] iNum = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for(int i = 0; i < sNum.length; i++) {
        	s = s.replace(sNum[i], iNum[i]);
        }
        
        return Integer.parseInt(s);
    }
}


class Solution2 {
    public int solution(String s) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < numbers.length; i++) {
        	s = s.replace(numbers[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
}