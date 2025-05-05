package schedule.prototyp;

import jakarta.persistence.*;

@Entity
@Table(name = "schedule")
public class Schedule {

    /**
     * it may appear that the schedule is redundant as it is a
     * specifically-ordered list of parties at a venue, but
     * the schedule is required to maintain all of its components
     * (day/time paired containers for a single party) , and should
     * never be allowed to delete any part of itself. the SCHEDULE
     * is defined by the business hours of the venue and its elements
     * are CONTAINERS for Parties, not JUST party objects.
     * i wish there were a better day to organize things by day but
     * i can't figure it out in a way that makes sense or even makes
     * things easier
     */

    /**
     * each Schedule object should have a schedule id, venue id, day, time, and party.
     * creating a party should be a put command to the schedule controller that calls a post in the party controller
     * this is because the schedule is pre-generated and not meant to have its elements added or removed later
     * deleting a party is likewise a put command
     */

    //timeslotId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int timeslotId;

    //private Party party;

    @Column(nullable = false)
    private int venueId;
    private String day;
    private int startTime;
    private int endTime;



    public Schedule() {

    }

    public Schedule(int venueId, String day, int startTime, int endTime){
        this.venueId = venueId;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
     //   this.party = party;
    }


    /**
     * all values should be initialized the first time the schedule is created
     * only the party and start/end times should be able to be modified afterwards
     * @return
     */

    public int getTimeslotId() {
        return timeslotId;
    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

//    public Party getParty() {
//        return party;
//    }

//    public void setParty(Party party) {
//        this.party = party;
//    }
}
