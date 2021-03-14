package edu.fiipractic.tasky.models;

import javax.persistence.*;

@Entity
@Table(name="boards")
public class Board {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name="name")
    private String name;

    public void setId(Integer id) {

        this.id = id;
    }

    public Integer getId() {

        return id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }
}
