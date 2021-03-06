package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "SOCCER_TEAM")
public class SoccerTeam implements Serializable {
    @Id
    @Column(name = "name")
    private String name;
    @Column(name = "league")
    private String league;
    @Column(name = "championships")
    private String championships;

    public SoccerTeam() {
    }

    public SoccerTeam(String name, String league, String championships) {
        this.name = name;
        this.league = league;
        this.championships = championships;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getChampionships() {
        return championships;
    }

    public void setChampionships(String championships) {
        this.championships = championships;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SoccerTeam)) return false;
        SoccerTeam that = (SoccerTeam) o;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getLeague(), that.getLeague()) && Objects.equals(getChampionships(), that.getChampionships());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLeague(), getChampionships());
    }

    @Override
    public String toString() {
        return "SoccerTeam{" +
                "name='" + name + '\'' +
                ", league='" + league + '\'' +
                ", championships='" + championships + '\'' +
                '}';
    }
}
