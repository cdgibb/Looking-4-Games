package com.looking4games.player.Player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByPlayerId(Long playerId);
    List<Review> findByVenueId(Long venueId); // Optional
}

