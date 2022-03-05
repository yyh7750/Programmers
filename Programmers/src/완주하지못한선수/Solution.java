package 완주하지못한선수;

import java.util.Arrays;

public class Solution {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i;
        
		for (i = 0; i < completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				answer = participant[i];
				System.out.println(answer);
			}
        }
		
		if(answer == "") {
			answer = participant[participant.length - 1];
		}
		
		return answer;
        
        /* ��ȿ������ ����
         * for(int i = 0; i < participant.length; i++){
        	
        	boolean p = true;
        	
            for(int j = 0; j < completion.length; j++){
            	if(participant[i].equals(completion[j])) {
            		completion[j] = null;
            		p = false;
            		break;
            	}
            }
            if(p) {
            	answer = participant[i];
            }
        }
        */
    }
}
