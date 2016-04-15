//@author LE-LOY

package GUI;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Settings {
    static TimeSpan[] spans = new TimeSpan[3];
    static int pomCycles;
    
    public static void init(){
        File file = new File("settings.txt");
        try{
            Scanner scan = new Scanner(file);
            
            for (int i = 0; i < 3; i++) {
                int h = scan.nextInt();
                int m = scan.nextInt();
                int s = scan.nextInt();
                spans[i] = new TimeSpan(h, m, s);
            }
            
            pomCycles = scan.nextInt();
            
            System.out.println("Settings loaded!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public static void save(){
        File file = new File("settings.txt");
        try{
            FileWriter filewriter = new FileWriter(file);
            
            for(int i=0; i<3; ++i){
                String h = String.valueOf(spans[i].getHours());
                String m = String.valueOf(spans[i].getMinutes());
                String s = String.valueOf(spans[i].getSeconds());
                filewriter.write(h+" "+m+" "+s+"\n");
            }
            filewriter.write( String.valueOf(pomCycles) );
            filewriter.close();
            
            System.out.println("Settings saved!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
