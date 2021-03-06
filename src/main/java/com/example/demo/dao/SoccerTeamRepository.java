package com.example.demo.dao;

import com.example.demo.model.SoccerTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SoccerTeamRepository extends JpaRepository<SoccerTeam,String> {

    @Query(value = "Select s from SoccerTeam s")
     List<SoccerTeam> getSoccerTemas();
}
