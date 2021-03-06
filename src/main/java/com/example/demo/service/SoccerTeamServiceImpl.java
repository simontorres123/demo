package com.example.demo.service;

import com.example.demo.dao.SoccerTeamRepository;
import com.example.demo.model.PersonSoccer;
import com.example.demo.model.SoccerTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class SoccerTeamServiceImpl implements SoccerTeamService{
    @Autowired
    private SoccerTeamRepository soccerTeamRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<SoccerTeam> findAll() {
        return soccerTeamRepository.findAll();
    }

    @Override
    public List<PersonSoccer> getCustomQuery(){
      String query = "select p.name as name, s.league as league from PERSON as p JOIN SOCCER_TEAM as s on p.name = s.name";

        Query q = entityManager.createNativeQuery(query,PersonSoccer.class);
        List<PersonSoccer> list = q.getResultList();
        return list;
    }
}
