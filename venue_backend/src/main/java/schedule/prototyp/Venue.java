package schedule.prototyp;

import jakarta.persistence.*;

@Entity
@Table(name = "venues")

public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int venueId;

    @Column(nullable = false)
    private String name;
    private String address;
    private String email;
    private int openTime;
    private int closeTime;

    //constructors


    public Venue() {}

    public Venue(String name, String address, String email, int openTime, int closeTime)    {
        this.name = name;
        this.address = address;
        this.email = email;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getVenueId() {
        return venueId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getOpenTime() {
        return openTime;
    }

    public void setOpenTime(int openTime) {
        //potentially add error checking so that things don't break if openTime > closeTime
        this.openTime = openTime;
    }

    public int getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(int closeTime) {
        //close time must be no greater than 24
        this.closeTime = closeTime;
    }

    public void generateSchedule(int openTime, int closeTime){
//        int monCarrier = openTime;
//        int tueCarrier = openTime;
//        int wedCarrier = openTime;
//        int thuCarrier = openTime;
//        int friCarrier = openTime;
//        int satCarrier = openTime;
//        int sunCarrier = openTime;
//        it wasn't working for some reason but i fixed it
        for(int i = openTime; i < closeTime; i++){
            Schedule newSchedule = new Schedule();
            newSchedule.setStartTime(i);
            newSchedule.setEndTime(i+1);
            newSchedule.setDay("Monday");
            newSchedule.setVenueId(venueId);
            //monCarrier++;
        }
        for(int i = openTime; i < closeTime; i++){
            Schedule newSchedule = new Schedule();
            newSchedule.setStartTime(i);
            newSchedule.setEndTime(i+1);
            newSchedule.setDay("Tuesday");
            newSchedule.setVenueId(venueId);
            //tueCarrier++;
        }
        for(int i = openTime; i < closeTime; i++){
            Schedule newSchedule = new Schedule();
            newSchedule.setStartTime(i);
            newSchedule.setEndTime(i+1);
            newSchedule.setDay("Wednesday");
            newSchedule.setVenueId(venueId);
            //wedCarrier++;
        }
        for(int i = openTime; i < closeTime; i++){
            Schedule newSchedule = new Schedule();
            newSchedule.setStartTime(i);
            newSchedule.setEndTime(i+1);
            newSchedule.setDay("Thursday");
            newSchedule.setVenueId(venueId);
            //thuCarrier++;
        }
        for(int i = openTime; i < closeTime; i++){
            Schedule newSchedule = new Schedule();
            newSchedule.setStartTime(i);
            newSchedule.setEndTime(i+1);
            newSchedule.setDay("Friday");
            newSchedule.setVenueId(venueId);
            //friCarrier++;
        }
        for(int i = openTime; i < closeTime; i++){
            Schedule newSchedule = new Schedule();
            newSchedule.setStartTime(i);
            newSchedule.setEndTime(i+1);
            newSchedule.setDay("Saturday");
            newSchedule.setVenueId(venueId);
            //satCarrier++;
        }
        for(int i = openTime; i < closeTime; i++){
            Schedule newSchedule = new Schedule();
            newSchedule.setStartTime(i);
            newSchedule.setEndTime(i+1);
            newSchedule.setDay("Sunday");
            newSchedule.setVenueId(venueId);
            //sunCarrier++;
        }
    }
}
