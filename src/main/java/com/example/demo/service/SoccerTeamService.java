package com.example.demo.service;

import com.example.demo.model.PersonSoccer;
import com.example.demo.model.SoccerTeam;

import java.util.List;

public interface SoccerTeamService {

    List<SoccerTeam> findAll();
    List<PersonSoccer> getCustomQuery();
}
