package schedule.prototyp;

import jakarta.persistence.*;

@Entity
@Table(name = "party")

/**
 * the "party" is a container that inherits a venue id, schedule id, day, and time from the schedule object that
 * created it
 * creating a party object should be done in the form of a post command called by a put command editing an existing
 * schedule object.
 * the capacity of the party determines the ability of people to join the party after it exists via the "joinParty"
 * put command
 * i don't know how this will work
 *
 * the party is referenced by players in a many-to-one relationship possibly ?
 * it's very late and i'm very tired
 *
 */

public class Party {
    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int partyId;

    //venueId
    private int venueId;
    //scheduleId
    private int scheduleId;
//
//    @ManyToOne
//    @JoinColumn(name = "")
    //private ????/????;

    @Column(nullable = false)
    private int capacity;
    private String name;
    private String day;
    private int time;

    public Party() { }

    public Party(int venueId, int scheduleId, String day, int time, int capacity) {
        this.venueId = venueId;
        this.scheduleId = scheduleId;
        this.day = day;
        this.time = time;
        this.capacity = capacity;
    }

    public int getPartyId() {return partyId; }

    public String getNme() { return name;}
    public void setName(String name) {this.name = name;}
    public int getCapacity() {return capacity;}
    public void setCapacity(int capacity) {this.capacity = capacity;}
    public String getDay() {return day;}
    public int getTime() {return time;}

    /**
    @Override
    public String toString() {
        return "Party{" +
                "partyId= " + partyId +
                ", name= '" + name + '\'' +
                ", capacity = " + capacity +
                '}';
    }**/
}
