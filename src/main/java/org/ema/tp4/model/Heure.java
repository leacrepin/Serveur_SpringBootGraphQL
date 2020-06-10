package org.ema.tp4.model;

public class Heure {
    private int heure;
    private int minute;

    public Heure(int heure, int minute) {
        this.heure = heure;
        this.minute = minute;
    }

    public Heure(){
    }

    public int getHeure() {
        return heure;
    }

    public int getMinute() {
        return minute;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
