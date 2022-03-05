package 상호평가;

class Solution {
    public String solution(int[][] scores) {
        String answer = "";
        
        for (int i = 0; i < scores.length; i++) {
            int scoresum = 0;
            int score = 0;
            int maxNum = 0;
            int minNum = 101;
            double count = scores.length;
            boolean p = true;
            
            for (int j = 0; j < scores.length; j++) {
                score = scores[j][i];
                
                maxNum = Math.max(maxNum, score);
                minNum = Math.min(minNum, score);
                
                if(j != i && score == scores[i][i]) p = false;
                
                scoresum += score;
            }
            
            if (p && (maxNum == scores[i][i] || minNum == scores[i][i])) {
                count--;
                scoresum -= scores[i][i];
            }
            
            double avg = scoresum / count;

            if (avg >= 90) {
                answer += "A";
            } else if (avg >= 80 && avg < 90) {
                answer += "B";
            } else if (avg >= 70 && avg < 80) {
                answer += "C";
            } else if (avg >= 50 && avg < 70) {
                answer += "D";
            } else if (avg < 50) {
                answer += "F";
            }
        }

        return answer;
    }
}