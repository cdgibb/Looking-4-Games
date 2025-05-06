package schedule.prototyp.Admin;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import schedule.prototyp.Player.Player;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "parties")
@Data // Lombok generates getters/setters, equals, hashCode, toString
@NoArgsConstructor // Lombok generates a no-argument constructor
@AllArgsConstructor // Lombok generates an all-argument constructor
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;

    @ManyToOne
    @JoinColumn(name = "ownerId", nullable = false)
    private Player player;

    @ManyToMany
    @JoinTable(
            name = "party_members",
            joinColumns = @JoinColumn(name = "partyId"),
            inverseJoinColumns = @JoinColumn(name = "playerId"))
    private List<Player> memberIds;

    private String gameType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date scheduledTime;
}
