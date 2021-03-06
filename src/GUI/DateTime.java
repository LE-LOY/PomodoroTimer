//@author LE-LOY
package GUI;

import static GUI.TaskManager.tasks;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class DateTime {
    static int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static Color[] set = { new Color(128, 128, 128), Color.WHITE , new Color(60, 60, 60)};
    static int cWidth = 30;
    
    static ArrayList activities = new ArrayList();
    static ArrayList marks = new ArrayList();
    
    public static void load(){
        activities.clear();
        File file = new File("activities.txt");
        try{
            Scanner scan = new Scanner(file);
            
            while(scan.hasNext())
                activities.add(scan.nextLine());
                        
            System.out.println("Activities loaded!");
        } catch(IOException e) {
            
        }
    }
    
    public static String now(String format){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(cal.getTime());
    }
    
    public static void saveNow(String type){
        String activity = String.valueOf(type)+" "+now("EEE yyyy MM dd 'at' HH mm");
        
        //ac
        File file = new File("activities.txt");
        try{
            FileWriter filewriter = new FileWriter(file, true);
            filewriter.write(activity+"\n");
            filewriter.close();
            activities.add(activity);
            System.out.println(activity);
        } catch( IOException e ){
            e.printStackTrace();
        }
    }
    
    public static int convertDay(String MM, String dd){
        int month = Integer.parseInt(MM);
        int day = Integer.parseInt(dd);
        
        for(int i=0; i<month; ++i)
            day+=monthDays[i];
        
        return day;
    }
    
    public static int convertDay(int MM, int dd){
        for(int i=0; i<MM; ++i)
            dd+=monthDays[i];
        
        return dd;
    }
    
    private static int getTotalMins(String temp){
        int hour = Integer.parseInt(temp.substring(26, 28));
        int min = Integer.parseInt(temp.substring(29, 31));
        
        return min + hour*60;
    }
    
    public static void analyzeMarks(){
        marks.clear();
        
        int size = activities.size();
        String last = "Opened:";
        
        for(int i=0; i<7; ++i)
            marks.add(new ActiveMark(set[2], cWidth*i, 90, cWidth, 180));
        
        for(int i=1; i<size; ++i){
            String activity = (String) activities.get(i);
            String that = (String) activities.get(i-1);
            
            
            
            if( (last.startsWith("Opened:") && activity.startsWith("Closed:") )
              ||(last.startsWith("Opened:") && activity.startsWith("Startd:") )
              ||(last.startsWith("Paused:") && activity.startsWith("Startd:") )
              ||(last.startsWith("Paused:") && activity.startsWith("Closed:") ))
                addMark(0, activity, that);
            else if(last.startsWith("Startd:") && activity.startsWith("Paused:"))
                addMark(1, activity, that);
            
            last = activity;
        }
    }
    
    private static void addMark(int i, String activity, String that){
        int thatMonth = Integer.parseInt(that.substring(17, 19));
        int thatDay   = Integer.parseInt(that.substring(20, 22));
        thatDay = convertDay(thatMonth, thatDay);
        
        int thismonth = Integer.parseInt(activity.substring(17, 19));
        int thisDay   = Integer.parseInt(activity.substring(20, 22));
        thisDay = convertDay(thismonth, thisDay);
        
        int nowDay  = convertDay(now("MM"), now("dd"));

        int thatMins = getTotalMins(that);
        int thisMins = getTotalMins(activity);
        int timeSpan = thisMins-thatMins;
        
        if(thisDay>thatDay){
            int extra = (thatMins/4)+(timeSpan/4);
            marks.add(new ActiveMark(set[i], cWidth*(6-(nowDay-thatDay)), thatMins/4, cWidth, 360-thatMins/4));
            marks.add(new ActiveMark(set[i], cWidth*(7-(nowDay-thatDay)),          0, cWidth, extra));
        } else
            marks.add(new ActiveMark(set[i], cWidth*(6-(nowDay-thatDay)), thatMins/4, cWidth, timeSpan/4));
    }
}
