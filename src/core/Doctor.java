package core;

import java.util.ArrayList;

public class Doctor {
    protected int id;
    protected Team team;
    protected ArrayList<Appoiment> appoiments;
    protected ArrayList<Patient> patients;

    public abstract Doctor(int id, Team team) {
        this.id = id;
        this.team = team;
        this.appoiments = new ArrayList<Patient>();
        this.patients = new ArrayList<Patient>();
    }

    public int getId() {
        return id;
    }

    public Team getTeam() {
        return team;
    }

    public ArrayList<Appoiment> getAppoiments() {
        return appoiments;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }
    
    
}
