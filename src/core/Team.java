package core;

import java.util.ArrayList;

public class Team {
    private int id;
    private ArrayList<Doctor> doctors;
    private ConsultantDoctor teamLeader;
    private ArrayList<Patient> patients;

    public Team(int id) {
        this.id = id;
        this.doctors = new ArrayList<>();
        this.teamLeader = null;
        this.patients = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public ConsultantDoctor getTeamLeader() {
        return teamLeader;
    }
    
    public void addDoctor(Doctor doctor)
    {
        doctors.add(doctor);
    }
}
