package Util;

import com.example.demo.Event;
import com.example.demo.Team;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtilE {
    private static final String DATA_FILEE= "demo\\src\\main\\java\\Util\\dataE.txt";
    public static List<Event> readData(){
        List<Event> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_FILEE))){
            String line = reader.readLine();
            while (line != null){
                String[] dataArray = line.split(",");
                String eventName = dataArray[0];
                String eventType = dataArray[1];
                String time = dataArray[2];
                String loca = dataArray[3];
                Event event = new Event(eventName,eventType,time,loca);
                result.add(event);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }
    public static void addData(Event event){
        List<Event> result = new ArrayList<>();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_FILEE, true))){
            writer.write(event.toString());
            writer.newLine();
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void deleteData(String eventName){
        List<Event> events = readData();
        File file = new File(DATA_FILEE);
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        events.removeIf(x -> x.getEventName().equals(eventName));
        for (Event event : events){
            addData(event);
        }

    }
    public static void editData(Event ee){
        List<Event> events = readData();
        File file = new File(DATA_FILEE);
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int index = -1;
        for (Event event : events) {
            if (event.getEventName().equals(ee.getEventName())){
                index = events.indexOf(event);
                break;
            }
        }
        if (index != -1){
            events.set(index, ee);
        }
        for (Event event : events){
            addData(event);
        }

    }
}
