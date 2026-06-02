package eksamen6;

public class HogwartsStudent implements Comparable<HogwartsStudent> {
    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName, String house) {
        this.firstName = firstName;
        this.lastName = lastName;
        setHouse(house);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getHouse() {
        return house;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHouse(String house) {
        if (house.equals("gryf") || house.equals("raven")
                || house.equals("huffle") || house.equals("slyth")) {
            this.house = house;
        } else {
            throw new IllegalArgumentException("ugyldigt hus" + house);
        }

    }

    public int compareTo(HogwartsStudent other) {
        return this.lastName.compareToIgnoreCase(other.lastName);
    }

@Override
public String toString() {
return firstName + " - " + lastName + " - " + house;
}

}
