package a0706;

import java.util.Calendar;

public class Calendar02 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
    
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Current Date : " + year + "-" + month + "-" + day);
        
    }
}
