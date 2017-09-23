package ru.sbrf.app.devops.pipeline.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Класс описывающий подсистемы
 * Created by Tom on 23.09.2017.
 */
@Entity
public class Subsystem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany
    private List<Build> builds;

    public Subsystem(String name) {
        this.name = name;
    }

    public Subsystem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Build> getBuilds() {
        return builds;
    }

    public void setBuilds(List<Build> builds) {
        this.builds = builds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subsystem subsystem = (Subsystem) o;

        return name != null ? name.equals(subsystem.name) : subsystem.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
