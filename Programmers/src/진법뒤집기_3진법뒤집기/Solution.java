package 진법뒤집기_3진법뒤집기;

import java.util.*;

class Solution {
    public int solution(int n) {
        String answer = "";
        ArrayList<Integer> temp = new ArrayList<>();
        
        // 10���� -> 3����(����) ����Ʈ�� �� �� �������� ���� reverse�� �ʿ䰡 ����.
        while(true){
            if(n<3){ temp.add(n); break; }
            temp.add(n%3);
            n = n/3;
        }
        
        for(int i = 0; i < temp.size(); i++) {
        	answer += temp.get(i);
        }
        
        return Integer.parseInt(answer, 3);
    }
}