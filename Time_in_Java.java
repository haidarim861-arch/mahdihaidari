
package time_in_java;


public class Time_in_Java {

    
    public static void main(String[] args) {
 
    long totalTimeMillis = System.currentTimeMillis();
    long totalSecond = totalTimeMillis/1000;
    long currentSecond = totalSecond%60;
    long totalMinute = totalSecond/60;
    long currentMinute = totalMinute%60;
    long totalHour = totalMinute/60;
    long currentHour = totalHour%24;
     System.out.println(currentHour+":"+currentMinute+":"+currentSecond);
        
    }
    
}
