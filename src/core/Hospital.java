package core;

import java.util.ArrayList;

public class Hospital {
    private ArrayList<Team> teams;
    private ArrayList<Ward> wards;

    public Hospital() {
        this.teams = new ArrayList<>();
        this.wards = new ArrayList<>();
    }
    

    public Team getTeam(int idTeam)
    {
        for (Team team : this.teams)
        {
            if (team.getId() == idTeam)
            {
                return team;
            }
        }
        return null;
    }
    
    public void addTeam(int idTeam, int CDId)
    {
        Team team = new Team(idTeam);
        team.addDoctor(new ConsultantDoctor(CDId, team));
        teams.add(team);
    }
    
    public void addJuniorDoctor(Team team, int idDoctor)
    {
        JuniorDoctor junior = new JuniorDoctor(team, idDoctor);
        for (Team searchTeam : this.teams)
        {
            if (searchTeam.getId() == team.getId())
            {
                searchTeam.addDoctor(junior);
            }
        }
    }
    
    public void addWard(int id){
        this.wards.add(new Ward(id));
    }
}