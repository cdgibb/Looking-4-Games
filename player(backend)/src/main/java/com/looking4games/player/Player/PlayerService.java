package com.looking4games.player.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    public List<Player> getAllPlayers() {
        return repository.findAll();
    }

    public Player getPlayerById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Player addPlayer(Player player) {
        return repository.save(player);
    }

    public Player updatePlayer(Long id, Player updatedPlayer) {
        Optional<Player> optional = repository.findById(id);
        if (optional.isPresent()) {
            Player existing = optional.get();
            existing.setUsername(updatedPlayer.getUsername());
            existing.setEmail(updatedPlayer.getEmail());
            existing.setPassword(updatedPlayer.getPassword());
            existing.setRoleType(updatedPlayer.getRoleType());
            existing.setBio(updatedPlayer.getBio());
            existing.setLocation(updatedPlayer.getLocation());
            existing.setPreferredGameStyle(updatedPlayer.getPreferredGameStyle());
            existing.setAvailableTimes(updatedPlayer.getAvailableTimes());
            existing.setActiveGamesIds(updatedPlayer.getActiveGamesIds());
            existing.setStatus(updatedPlayer.getStatus());
            existing.setDistanceWillingToTravel(updatedPlayer.getDistanceWillingToTravel());
            existing.setReviewsWritten(updatedPlayer.getReviewsWritten());
            existing.setRecentEventsAttended(updatedPlayer.getRecentEventsAttended());
            return repository.save(existing);
        }
        return null;
    }

    public void deletePlayer(Long id) {
        repository.deleteById(id);
    }

    public Player subscribeToGame(Long id, Integer gameId) {
        Optional<Player> optional = repository.findById(id);
        if (optional.isPresent()) {
            Player player = optional.get();
            if (!player.getActiveGamesIds().contains(gameId)) {
                player.getActiveGamesIds().add(gameId);
                return repository.save(player);
            }
        }
        return null;
    }

    public Player unsubscribeFromGame(Long id, Integer gameId) {
        Optional<Player> optional = repository.findById(id);
        if (optional.isPresent()) {
            Player player = optional.get();
            player.getActiveGamesIds().remove(gameId);
            return repository.save(player);
        }
        return null;
    }


}

