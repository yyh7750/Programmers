/**
 * 
 */
package 다단계_칫솔;

import java.util.HashMap;
import java.util.Map;

/**
 * 프로그래머스 다단계 칫솔 판매 문제. 추천인에게 10%의 수익 제공
 *
 * @param enroll   : 판매원의 이름이 담긴 배열
 * @param referral : 추천인 이름이 담긴 배열
 * @param seller   : 판매한 사람이 담긴 배열
 * @param amount   : 판매 수량이 담긴 배열
 *
 * @return answer : 각 판매원 별 판매 수익금의 값이 담긴 배열
 *
 * @author 유영훈
 * @since 2021. 10. 9
 */
public class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = {};

        Map<String, Person> person = new HashMap<>();
        
        // 최상위 트리 - 사장님
        person.put("-", new Person("-"));
        
        // 트리 구조로 판매원 이름 삽입
        for(int i = 0; i < enroll.length; i++) {
            person.put(enroll[i], new Person(enroll[i]));
        }
            
        // 판매원의 부모 트리 설정
        for(int i = 0; i < referral.length; i++) {
            person.get(enroll[i]).referral = person.get(referral[i]);
        }
        
        // 수익금 계산
        for(int i = 0; i < seller.length; i++) {
            addProfit(person.get(seller[i]), amount[i] * 100);
        }
        
        // 결과 삽입
        for(int i = 0; i < enroll.length; i++) {
            answer[i] = person.get(enroll[i]).profit;
        }
        
        return answer;
    }
   
    /**
     * 수익금을 계산하기 위한 메소드
     * 
     * @param person : Person의 객체 - 판매원 이름
     * @param profit : 판매 갯수 * 100 -> 10% 떼기 전 금액
     *
     * @author 유영훈
     * @since 2021. 10. 9
     */
    public void addProfit(Person person, int profit){
        // 추천인에게 줄 금액
        int profit_for_parent = profit / 10;
        
        // 추천인이 있다면
        if(profit_for_parent != 0 && person.referral != null){
            // 수익금의 10% 추천인에게 지불
            person.profit += profit - profit_for_parent;
            // 추천인의 추천인에게 같은 방식 적용
            addProfit(person.referral, profit_for_parent);
        }
        else{
            // 추천인이 없다면 수익금 분배하지 않고 본인 소유
            person.profit += profit;
        }
    }
}