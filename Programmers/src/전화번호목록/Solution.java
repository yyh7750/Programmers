package 전화번호목록;

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> hashSet = new HashSet<>();

        for (String number : phone_book) {
            hashSet.add(number);
        }
        
        for (String key : hashSet) {
            for (int j = 1; j <= key.length() - 1; j++)
                if (hashSet.contains(key.substring(0, j))) {
                    return false;
                }
        }
        return true;
    }
}