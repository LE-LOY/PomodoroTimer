//@author LE-LOY

package GUI;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;
    
    public TimeSpan(){
        this.hours = 0;
        this.minutes = 25;
        this.seconds = 0;
    }
    
    public TimeSpan(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public int getHours(){
        return this.hours;
    }
    
    public int getMinutes(){
        return this.minutes;
    }
    
    public int getSeconds(){
        return this.seconds;
    }
}
