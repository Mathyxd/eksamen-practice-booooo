package eksamen36;

import java.time.LocalDate;

public class Dream implements Comparable<Dream> {
    private LocalDate date;
    private int duration;
    private Type type;

    public Dream(LocalDate date, int duration, Type type) {
        this.date = date;
        this.duration = duration;
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isPleasant() {
        if (type == Type.MARERIDT) {
            return false;
        } else if (type == Type.PROBLEMLØSENDE) {
            return duration < 10;
        } else {
            return duration > 10;
        }
    }


    @Override
    public int compareTo(Dream other) {
        return this.date.compareTo(other.date);
    }

    @Override
    public String toString() {
        return date + " - " + duration + " - " + type;
    }
}
