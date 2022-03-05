package 예산;

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        // �� ���� �� ���� ���Ͽ� �ִ�� ������ �� �ִ� �μ� ���� �̱� ���� ����
        Arrays.sort(d); 

        for(int i=0; i<d.length; i++){
            if(d[i] <= budget){

                // �� ���� ������ ���� �ݾ׺��� ũ�ų� ������ �����ϰ� ���꿡�� ����
                budget -= d[i];

                // �� �μ� ������ ������ ī��Ʈ 1 ����
                answer++;

            }else{
                // ������ ������ ��� �ߴ�
                break;
            }
        }

        return answer;
    }
}