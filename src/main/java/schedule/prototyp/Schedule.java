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
     * Yes it's possible for a schedule to populate with 168 elements
     * but this is CORRECT behavior, representing the maximum number
     * of 1-hour segments in a 7 day week
     */

    /**
     * each Schedule object should have a schedule id, venue id, day, time, and party.
     * creating a party should be a put command to the schedule controller that calls a post in the party controller
     * this is because the schedule is pre-generated and not meant to have its elements added or removed later
     * deleting a party is likewise a put command
     */

    //scheduleId
    @Id
    @Override@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int scheduleId;

    private int venueId;

    @Column(nullable = false)
    private String day;
    private int time;

    private Party party;


    public Schedule() {

    }
}
