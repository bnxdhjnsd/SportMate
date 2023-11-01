package Util;

import com.example.demo.Member;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String DATA_FILE= "C:\\Users\\wangyang12\\Desktop\\demo\\demo\\src\\main\\java\\Util\\data.txt";
    public static List<Member> readData(){
        List<Member> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_FILE))){
            String line = reader.readLine();
            while (line != null){
                String[] dataArray = line.split(",");
                String name = dataArray[0];
                String age = dataArray[1];
                String gender = dataArray[2];
                String email = dataArray[3];
                String phone = dataArray[4];
                String team = dataArray[5];
                Member member = new Member(name,age,gender,email,phone,team);
                result.add(member);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }
    public static void addData(Member member){
        List<Member> result = new ArrayList<>();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_FILE, true))){
            writer.write(member.toString());
            writer.newLine();
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void deleteData(String name){
        List<Member> members = readData();
        File file = new File(DATA_FILE);
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        members.removeIf(x -> x.getName().equals(name));
        for (Member member : members){
            addData(member);
        }

    }
    public static void editData(Member m){
        List<Member> members = readData();
        File file = new File(DATA_FILE);
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int index = -1;
        for (Member member : members) {
            if (member.getName().equals(m.getName())){
                index = members.indexOf(member);
                break;
            }
        }
        if (index != -1){
            members.set(index, m);
        }
        for (Member member : members){
            addData(member);
        }

    }
}
