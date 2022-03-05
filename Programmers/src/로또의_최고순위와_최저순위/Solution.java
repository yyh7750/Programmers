package 로또의_최고순위와_최저순위;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};
        int winNum = 0;
        int loseNum = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int lotto : lottos) {
        	list.add(lotto);
        }
        
        for(int win_num : win_nums) {
        	if(list.contains(win_num)) {
        		winNum++;
        	}
        	if(list.contains(win_num)) {
        		loseNum++;
        	}
        }
        
        for(int i = 0; i < lottos.length; i++) {
        	 if(list.get(i) == 0) {
        		 winNum++;
        	 }
        }
                
        if(loseNum == 0) {
        	loseNum = 1;
        }
        if(winNum == 0) {
        	winNum = 1;
        }
        
        answer[0] = 7 - winNum;
        answer[1] = 7 - loseNum;
                
        return answer;
    }
}