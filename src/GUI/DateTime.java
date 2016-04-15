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
    static Color[] set = { new Color(128, 128, 128), Color.WHITE };

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
        
        for(int i=1; i<size; ++i){
            String activity = (String) activities.get(i);
            String that = (String) activities.get(i-1);
            
            int thatmonth = Integer.parseInt(that.substring(17, 19));
            int thatday   = Integer.parseInt(that.substring(20, 22));
            int thatDay = convertDay(thatmonth, thatday);
            int nowDay  = convertDay(now("MM"), now("dd"));
            
            int thatMins = getTotalMins(that);
            int thisMins = getTotalMins(activity);
            int timeSpan = thisMins-thatMins;
            
            if( (last.startsWith("Opened:") && activity.startsWith("Closed:") )
              ||(last.startsWith("Opened:") && activity.startsWith("Startd:") )
              ||(last.startsWith("Paused:") && activity.startsWith("Startd:") )
              ||(last.startsWith("Paused:") && activity.startsWith("Closed:") ))
                marks.add(new ActiveMark(set[0], 15*(6-(nowDay-thatDay)), thatMins/4, 15, timeSpan/4));
            else if(last.startsWith("Startd:") && activity.startsWith("Paused:"))
                marks.add(new ActiveMark(set[1], 15*(6-(nowDay-thatDay)), thatMins/4, 15, timeSpan/4));
            
            last = activity;
        }
    }
}
