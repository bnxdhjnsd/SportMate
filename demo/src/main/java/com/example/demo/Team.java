package com.example.demo;

public class Team {
    private String teamName;
    private String type;
    private String leader;
    private String memberList;

    public String toString() {
        return teamName + "," + type + "," + leader + "," + memberList ;
    }

    public Team() {
    }

    public Team(String teamName, String type, String leader, String memberList) {
        this.teamName = teamName;
        this.type = type;
        this.leader = leader;
        this.memberList = memberList;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getMemberList() {
        return memberList;
    }

    public void setMemberList(String memberList) {
        this.memberList = memberList;
    }
}
