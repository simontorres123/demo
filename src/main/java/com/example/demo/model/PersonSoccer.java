package com.example.demo.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@SqlResultSetMapping(name = "getpersonSoccerMapping",classes = {
        @ConstructorResult(
                columns = {
                        @ColumnResult(name = "name",type = String.class),
                        @ColumnResult(name = "league",type = String.class)
                },
                targetClass = PersonSoccer.class
        )
})
public class PersonSoccer implements Serializable {

    @Id
    private String name;
    private String league;



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
}
