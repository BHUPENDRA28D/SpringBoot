package com.devtiro.quickstart;

public class IplTeam {

    String teamName;
    int trophies;
    String teamOwnerName;
    String teamCaptianName;

    @Override
    public String toString() {
        return "IplTeam{" +
                "teamName='" + teamName + '\'' +
                ", trophies=" + trophies +
                ", teamOwnerName='" + teamOwnerName + '\'' +
                ", teamCaptianName='" + teamCaptianName + '\'' +
                '}';
    }

    public IplTeam() {
        super();
    }

    public IplTeam(String teamName, int trophies, String teamOwnerName, String teamCaptianName) {
        this.teamName = teamName;
        this.trophies = trophies;
        this.teamOwnerName = teamOwnerName;
        this.teamCaptianName = teamCaptianName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    public String getTeamOwnerName() {
        return teamOwnerName;
    }

    public void setTeamOwnerName(String teamOwnerName) {
        this.teamOwnerName = teamOwnerName;
    }

    public String getTeamCaptianName() {
        return teamCaptianName;
    }

    public void setTeamCaptianName(String teamCaptianName) {
        this.teamCaptianName = teamCaptianName;
    }
}
