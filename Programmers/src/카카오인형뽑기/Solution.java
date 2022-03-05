package 카카오인형뽑기;

import java.util.Stack;

public class Solution {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < moves.length; i++) {
        	for(int j = 0; j < board.length; j++) {
        		
        		if(board[j][moves[i]-1] != 0) {
        			
        			if(stack.isEmpty()) {
        				stack.push(board[j][moves[i]-1]);
        			}
        			else {
        				if(stack.peek() == board[j][moves[i]-1]) {
        					stack.pop();
        					answer += 2;
        				}
        				else {
        					stack.push(board[j][moves[i]-1]);
        				}
        			}
        			
        			board[j][moves[i]-1] = 0;
        			break;
        		}
        	}
        }
        
        return answer;

//      int x = board.length;
//      int i, j;
//        
//		if (x >= 5 && x <= 30) {
//			for (i = 0; i < x; i++) {
//				for (j = 0; j < x; j++) {
//					board[i][j] = (int) (Math.random() * 100);
//					System.out.println(board[i][j]);
//				}
//			}
//		}
    }
}