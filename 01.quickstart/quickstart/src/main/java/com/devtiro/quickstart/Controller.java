package com.devtiro.quickstart;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController  // ---->
public class Controller {

    private static final List<IplTeam> teams = Arrays.asList(
            new IplTeam("MI", 5, "Ambani", "Rohit Sharma"),
            new IplTeam("CSK", 5, "N Srinivasan", "Rituraj G"),
            new IplTeam("KKR", 3, "SRK", "Shreyash Iyer"),
            new IplTeam("RR", 1, "Manoj Badale", "Sanju Samson"),
            new IplTeam("PK", 0, "Preity Zinta, Ness Wadia, Mohit Burman, Karan Paul", "Shreyash Iyer"),
            new IplTeam("SH", 1, "Kalanithi Maran", "Pat Cummins"),
            new IplTeam("GT", 1, "CVC Capital Partners", "Shubman Gill"),
            new IplTeam("DC", 0, "CVC Capital Partners", "Rishabh Pant"),
            new IplTeam("LSG", 0, "Sanjiv Goenka", "K.L Rahul"),
            new IplTeam("RCB", 0, "United Spirits Ltd.", "Faf du Plessis") );



    @GetMapping (path ="/count") //---> GET TYPE Methode

    public int teamCount(){

        return teams.toArray().length;
    }


    // ipl team name
    // trophies win
    // team owner
    //team caption.

    // Method to get complete team information
    @GetMapping("/teamInfo")
    public List<IplTeam> getAllTeams(){
        return teams;
    }

    // Method to get a single team's information based on team name
    @GetMapping("/teamInfo/{teamName}")
    public IplTeam getSingleTeamData(@PathVariable String teamName){
        for(IplTeam team :teams){
            if(team.getTeamName().equalsIgnoreCase(teamName)){
                return team;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Team not found");
    }

}
