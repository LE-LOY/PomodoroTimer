//@author LE-LOY
package GUI;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DateTime {
    static ArrayList activities = new ArrayList();
    
    public static void load(){
        //carefull: lastIndex
    }
    
    public static void save(){
        
    }
    
    public static String now(String format){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(cal.getTime());
    }
    
    public static void saveNow(String type){
        String activity = String.valueOf(type)+" "+now("EEE yyyy MM dd 'at' hh mm ss a");
        
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
}
