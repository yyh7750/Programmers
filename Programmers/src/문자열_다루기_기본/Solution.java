package 문자열_다루기_기본;

public class Solution {
	boolean solution(String s) {
	    if(s.length() == 4 || s.length() == 6){
	          try{
	              int x = Integer.parseInt(s);
	              return true;
	          } catch(NumberFormatException e){
	              return false;
	          }
	      }
	      else {
	          return false;
	      }
	}
}
