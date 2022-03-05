package 윤년_2016;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class Solution {
    
    public String solution(int a, int b) {
        
        String result = "";
        
        Date date;
        
        Calendar cal = Calendar.getInstance();
        cal.set(2016, a-1, b);
        
        date = cal.getTime();
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E", Locale.ENGLISH);
        
        result = simpleDateFormat.format(date).toUpperCase();
        
        return result;
    }
}