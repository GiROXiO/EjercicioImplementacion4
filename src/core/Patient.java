package core;

import java.util.ArrayList;

public class Patient {
    private int id;
    private Team team;
    private Ward ward;
    private ArrayList<Appoiment> appoiments;
    private ArrayList<Doctor> doctors;

    public Patient(Team team, Ward ward) {
        this.team = team;
        this.ward = ward;
        this.appoiments = new ArrayList<Appoiment>();
        this.doctors = new ArrayList<Doctor>();
    }
    
    public Patient(int id, Team team, Ward ward) {
        this.id = id;
        this.team = team;
        this.ward = ward;
        this.appoiments = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    
    
}
