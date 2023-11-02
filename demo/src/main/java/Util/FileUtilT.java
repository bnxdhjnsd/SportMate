package Util;

import com.example.demo.Member;
import com.example.demo.Team;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtilT {
    private static final String DATA_FILET= "C:\\Users\\wangyang12\\IdeaProjects\\sportmate\\demo\\src\\main\\java\\Util\\dataT.txt";
    public static List<Team> readData(){
        List<Team> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_FILET))){
            String line = reader.readLine();
            while (line != null){
                String[] dataArray = line.split(",");
                String teamName = dataArray[0];
                String type = dataArray[1];
                String leader = dataArray[2];
                String memberList = dataArray[3];
                Team team = new Team(teamName,type,leader,memberList);
                result.add(team);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }
    public static void addData(Team team){
        List<Team> result = new ArrayList<>();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_FILET, true))){
            writer.write(team.toString());
            writer.newLine();
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void deleteData(String teamName){
        List<Team> teams = readData();
        File file = new File(DATA_FILET);
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        teams.removeIf(x -> x.getTeamName().equals(teamName));
        for (Team team : teams){
            addData(team);
        }

    }
    public static void editData(Team t){
        List<Team> teams = readData();
        File file = new File(DATA_FILET);
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int index = -1;
        for (Team team : teams) {
            if (team.getTeamName().equals(t.getTeamName())){
                index = teams.indexOf(team);
                break;
            }
        }
        if (index != -1){
            teams.set(index, t);
        }
        for (Team team : teams){
            addData(team);
        }

    }
}
