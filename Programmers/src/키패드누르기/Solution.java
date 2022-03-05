package 키패드누르기;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        
        int rIndex = 12;
        int lIndex = 10;
        int rLength = 0;
        int lLength = 0;
        
        for(int i : numbers) {
        	if(i == 1 || i == 4 || i == 7) {
        		answer.append("L");
        		lIndex = i;
        	}
        	else if(i == 3 || i == 6 || i == 9) {
        		answer.append("R");
        		rIndex = i;
        	}
        	else {
        		rLength = getLength(rIndex, i);
        		lLength = getLength(lIndex, i);
        		
        		if(rLength > lLength) {
        			answer.append("L");
            		lIndex = i;
        		}
        		else if(rLength < lLength) {
        			answer.append("R");
            		rIndex = i;
        		}
        		else {
        			if(hand.equals("right")) {
        				answer.append("R");
                		rIndex = i;
        			}
        			else {
        				answer.append("L");
                		lIndex = i;
        			}
        		}
        	}
        }
        
        return answer.toString();
    }
    
    public int getLength(int index, int num) {
    	// ���� 0�� ��� 11�� ġȯ
    	index = (index == 0) ? 11 : index;	
    	num = (num == 0) ? 11 : num;

    	int x = (index - 1) / 3;
    	int y = (index - 1) % 3;
    	int centerX = num / 3;
    	int centerY = 1;

    	return Math.abs(x-centerX) + Math.abs(y-centerY);
    }
}