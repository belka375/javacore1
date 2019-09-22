package hw10;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class Gym {
    private String trainer;
    private String [] machines;
    private int indoorPool;
    public boolean kidsClub;

    public void setIndoorPool(int indoorPool) {
        this.indoorPool = indoorPool;
    }

    public void setKidsClub(boolean kidsClub) {
        this.kidsClub = kidsClub;
    }

    public void setMachines(String[] machines) {
        this.machines = machines;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public int getIndoorPool() {
        return indoorPool;
    }

    public String getTrainer() {
        return trainer;
    }

    public String[] getMachines() {
        return machines;
    }

    public boolean isKidsClub() {
        return kidsClub;
    }
    public void printGymInfo(){
        System.out.println("Gym has: "+indoorPool+" indoor pool, "+ trainer+" , "+kidsClub);
    }
    public Gym(){
        this.indoorPool = getIndoorPool();
        this.machines = getMachines();
        this.kidsClub =isKidsClub();
        this.trainer=getTrainer();

    }
}

