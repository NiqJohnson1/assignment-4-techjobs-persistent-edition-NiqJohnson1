package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Skill extends AbstractEntity {

    private String description;

    //No Arg Constructor:
    public Skill() {}

    // Getters and Setters:

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Skill skill = (Skill) o;
        return Objects.equals(description, skill.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), description);
    }
}