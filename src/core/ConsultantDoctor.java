package core;

public class ConsultantDoctor extends Doctor {
    
    Team team;

    public ConsultantDoctor(int id, Team team) {
        super(id, team);
        this.team = team;
    }
    
}
