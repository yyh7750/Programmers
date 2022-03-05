package 멀쩡한_사각형;

public class Solution {
    public long solution(int w, int h) {
        long answer = 0;
        long n = 0;
        int len = Math.min(w, h);
        
        for(int i = 1; i <= len; i++) {
            if(w % i == 0 && h % i == 0) {
                n = i;
            }
        }
        
        // ���α׷��ӽ����� w�� h�� ������ int�� ������ ��� �� �ֱ� ������ long���� ����ȯ���ش�.
        answer = ((long)w * (long)h) - (w + h - n);
        
        return answer;
    }
}