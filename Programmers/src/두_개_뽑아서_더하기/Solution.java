package 두_개_뽑아서_더하기;

import java.util.ArrayList;
import java.util.TreeSet;

public class Solution {
	
	public TreeSet<Integer> solution(int[] num) {
        ArrayList<Integer> answer = new ArrayList<>();
          
        
        for(int i = 0; i < num.length; i++) {
        	for(int j = i + 1; j < num.length; j++) {
        	    int sum = 0;
        	    sum = num[i] + num[j];
        	    System.out.println(num[i] + " " + num[j] + " " + sum);
        	    
        	    answer.add(sum);
            }
        }
        
        TreeSet<Integer> result = new TreeSet<>();
        answer.forEach(i -> result.add(i));

        return result;
    }
}
