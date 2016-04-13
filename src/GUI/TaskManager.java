//@author leloy

package GUI;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaskManager {
    static ArrayList tasks = new ArrayList();
    
    public static void loadTasks(){
        tasks.clear();
        File file = new File("tasks.txt");
        try{
            Scanner scan = new Scanner(file);
            
            while(scan.hasNext())
                tasks.add(scan.nextLine());
                        
            System.out.println("TaskManager loaded!");
        } catch(IOException e) {
            
        }
    }
    
    public static void saveTasks(){
        int size = tasks.size();
        
        File file = new File("tasks.txt");
        try{
            FileWriter filewriter = new FileWriter(file);
            for(int i=0; i<size; ++i){
                filewriter.write(tasks.get(i)+"\n");
            }
            filewriter.close();
            
            //System.out.println("GOT HERE!"+String.valueOf(size));
        } catch(IOException e){
            e.printStackTrace();
        }
        
        System.out.println("TaskManager saved!");
        //System.out.println("GOT HERE!");
    }
    
    public static void saveToDone(int i){
        String task = (String)tasks.get(i);
        
        File file = new File("done.txt");
        try{
            FileWriter filewriter = new FileWriter(file, true);
            filewriter.write(task+"\n");
            filewriter.close();
        } catch( IOException e ){
            e.printStackTrace();
        }
    }
    
    public static String next(){
        String temp = "Chill out!";
        
        if(!tasks.isEmpty()){
            saveToDone(0);
            tasks.remove(0);
        }
        
        if(!tasks.isEmpty())
            temp = (String)tasks.get(0);
        
        saveTasks();
        
        return temp;
    }
}
