package core;

import java.util.ArrayList;

public class Doctor {
    protected int id;
    protected Team team;
    protected ArrayList<Appointment> appoiments;
    protected ArrayList<Patient> patients;

    public Doctor(int id, Team team) {
        this.id = id;
        this.team = team;
        this.appoiments = new ArrayList<Patient>();
        this.patients = new ArrayList<Patient>();
    }
    
    
    
}
