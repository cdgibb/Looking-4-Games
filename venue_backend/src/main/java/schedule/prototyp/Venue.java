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


    //constructors


    public Venue() {}

    public Venue(String name, String address)    {
        this.name = name;
        this.address = address;
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
}
