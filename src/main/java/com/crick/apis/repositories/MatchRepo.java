package com.crick.apis.repositories;

import com.crick.apis.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match, Integer> {
    // we want to fetch match
    // give us the teamName

    Optional<Match> findByTeamHeading(String teamHeading);
}
